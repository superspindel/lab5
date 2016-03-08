package lab5.carwash.model;
import lab5.general.control.Event;
import lab5.general.model.SimState;

public class carwashState extends SimState {
	CarFactory carFactory;

	int numFreeFast;
	int numFreeSlow;
	
	FIFO carQueue;
	private int maxQueueSize;
	
	public Event CurrentEvent;
	float lastEvent;
	
	RandomStreams ranStream;
	
	float queueTime;
	float idleMachineTime;
	int rejectedCars; 
	
	public carwashState(int numFast, int numSlow, long seed, int maxQueueSize){
		this.numFreeFast = numFast;
		this.numFreeSlow = numSlow;
		this.carFactory = new CarFactory();
		initializeQueue(this, maxQueueSize);
		initializeRandom(this, seed);
	}
	public Car getCarFromQueue(){
		Car returnCar = (Car)this.carQueue.getFirst();
		this.carQueue.deleteFirst();
		return returnCar;
	}
	public void putCarInQueue(Car bil){		
		this.carQueue.add(bil);
	}
	public boolean isQueueEmpty(){
		return this.carQueue.isEmpty();
	}
	public int sizeOfQueue(){
		return this.carQueue.size();
	}
	public boolean queueIsFull()
	{
		return this.sizeOfQueue() == this.maxQueueSize;
	}
	private void initializeQueue(carwashState self, int maxQueueSize)
	{
		self.carQueue = new FIFO();
		self.maxQueueSize = maxQueueSize;
	}
	private void initializeRandom(carwashState self, long seed)
	{
		self.ranStream = new RandomStreams(seed, 3.5, 6.7, 2.8, 4.6, 2);
	}
}

