package lab5.carwash.model;

import lab5.general.control.Event;
import lab5.general.control.EventQueue;

public class STOPevent extends Event{
	private carwashState myCarwashState;
	private EventQueue myQueue;
	private double TimeForEvent;
	
	public STOPevent(carwashState setState, EventQueue myQueue, double timeForEvent)
	{
		this.myCarwashState = setState;
		this.myQueue = myQueue;
		this.TimeForEvent = timeForEvent;		
	}

	public void execute()
	{
		this.myCarwashState.CurrentEvent = this;
		updateStats();
		this.myQueue.removeAll();
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