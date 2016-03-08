package lab5.carwash.model;
import lab5.general.control.Event;
import lab5.general.control.EventQueue;

public class carLeavesEvent extends Event{
	private carwashState myCarwashState;
	private EventQueue myQueue;
	private double TimeForEvent;
	private Car thisCar;
	private int washerUsed;
	
	public carLeavesEvent(carwashState setState, EventQueue myQueue, double timeForEvent, Car leavingCar, int washerUsed)
	{
		this.myCarwashState = setState;
		this.myQueue = myQueue;
		this.TimeForEvent = timeForEvent;
		this.thisCar = leavingCar;
		this.washerUsed = washerUsed;
		
	}
	public int getCarId()
	{
		return this.thisCar.getId();
	}
	public void execute()
	{
		this.myCarwashState.CurrentEvent = this;
		updateStats();
		if(!(this.myCarwashState.isQueueEmpty()))
		{
			if(this.washerUsed ==  1)
			{
				createFastWashEvent(this.myCarwashState.getCarFromQueue());
			}
			else if(this.washerUsed == 2)
			{
				createSlowWashEvent(this.myCarwashState.getCarFromQueue());
			}
		}
		if(this.washerUsed == 1)
		{
			this.myCarwashState.numFreeFast++;
		}
		else if(this.washerUsed == 2)
		{
			this.myCarwashState.numFreeSlow++;
		}
	}
	private void createFastWashEvent(Car myCar)
	{
		carLeavesEvent thisCarLeaves = new carLeavesEvent(this.myCarwashState, this.myQueue, this.TimeForEvent+this.myCarwashState.ranStream.fastWashTime.next(), myCar, 1);
		this.myQueue.add(thisCarLeaves);
	}
	private void createSlowWashEvent(Car myCar)
	{
		carLeavesEvent thisCarLeaves = new carLeavesEvent(this.myCarwashState, this.myQueue, this.TimeForEvent+this.myCarwashState.ranStream.slowWashTime.next(), myCar, 2);
		this.myQueue.add(thisCarLeaves);
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
}