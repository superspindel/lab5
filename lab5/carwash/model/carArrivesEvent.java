package lab5.carwash.model;
import lab5.general.control.Event;
import lab5.general.control.EventQueue;

public class carArrivesEvent extends Event{
	private carwashState myCarwashState;
	private EventQueue myQueue;
	private double TimeForEvent;
	
	public carArrivesEvent(carwashState setState, EventQueue myQueue, double timeForEvent)
	{
		this.myCarwashState = setState;
		this.myQueue = myQueue;
		this.TimeForEvent = timeForEvent;
		
	}
	public void execute()
	{
		this.myCarwashState.CurrentEvent = this;
		updateStats();
		Car myCar = createCar();
		if(freeWashers())
		{
			if(this.myCarwashState.numFreeFast != 0)
			{
				createFastWashEvent(myCar);
				this.myCarwashState.numFreeFast--;
			}
			else if(this.myCarwashState.numFreeSlow != 0)
			{
				createSlowWashEvent(myCar);
				this.myCarwashState.numFreeSlow--;
			}
		}
		else if(this.myCarwashState.queueIsFull())
		{
			rejectCar();
		}
		else
		{
			queueCar(myCar);
		}
		createNextArrivesEvent();
	}
	
	private Car createCar()
	{
		return this.myCarwashState.carFactory.createCar();
	}
	private boolean freeWashers()
	{
		if(this.myCarwashState.numFreeFast != 0 || this.myCarwashState.numFreeSlow != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private void createFastWashEvent(Car myCar)
	{
		carLeavesEvent thisCarLeaves = new carLeavesEvent(this.myCarwashState, this.myQueue, this.TimeForEvent+this.myCarwashState.ranStream.fastWashTime.next(), myCar,  1);
		this.myQueue.add(thisCarLeaves);
	}
	private void createSlowWashEvent(Car myCar)
	{
		carLeavesEvent thisCarLeaves = new carLeavesEvent(this.myCarwashState, this.myQueue, this.TimeForEvent+this.myCarwashState.ranStream.slowWashTime.next(),myCar, 2);
		this.myQueue.add(thisCarLeaves);
	}
	private void queueCar(Car myCar)
	{
		this.myCarwashState.putCarInQueue(myCar);
	}
	
	/**
	 * update 	free washers
	 * 			idleMachineTime
	 * 			rejectedCars
	 * 			lastEventTime
	 */
	private void updateStats()
	{
		this.myCarwashState.idleMachineTime += (this.TimeForEvent-this.myCarwashState.lastEvent)*(this.myCarwashState.numFreeFast+this.myCarwashState.numFreeSlow);
		this.myCarwashState.queueTime += (this.TimeForEvent-this.myCarwashState.lastEvent)*(this.myCarwashState.sizeOfQueue());
	}
	
	private void rejectCar()
	{
		this.myCarwashState.rejectedCars++;
	}
	
	private void createNextArrivesEvent()
	{
		carArrivesEvent nextCarArrives = new carArrivesEvent(this.myCarwashState, this.myQueue, this.TimeForEvent+this.myCarwashState.ranStream.nextArrivalTime.next());
		this.myQueue.add(nextCarArrives);
	}
}
