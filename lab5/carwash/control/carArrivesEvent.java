package lab5.carwash.control;

import lab5.carwash.model.carwashState;
import lab5.carwash.model.Car;

public class carArrivesEvent {
	private Car myCar;
	private carwashState myCarwashState;
	
	public carArrivesEvent(carwashState setState)
	{
		this.myCarwashState = setState;
	}
	public void execute()
	{
		this.myCar = createCar();
	}
	
	private Car createCar()
	{
		return this.myCarwashState.carFactory.createCar();
	}
	private void checkWashers()
	{
		
	}
	private void washCar()
	{
		
	}
	private void createEventForWash()
	{
		
	}
	private void queueCar()
	{
		
	}
	
	/**
	 * update 	free washers
	 * 			idleMachineTime
	 * 			rejectedCars
	 * 			lastEventTime
	 */
	private void updateStates()
	{
		
	}
}