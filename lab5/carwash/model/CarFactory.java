package lab5.carwash.model;

public class CarFactory {
	private int carId;
	public CarFactory()
	{
		this.carId = 0;
	}
	
	public Car createCar()
	{
		return new Car(carId++);
	}
	
	public int numCars()
	{
		return this.carId;
	}
}