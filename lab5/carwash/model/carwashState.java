package lab5.carwash.model;
import lab5.general.*;
import lab5.general.control.Event;
import lab5.general.model.SimState;
import lab5.carwash.*;

public class carwashState extends SimState {

	public CarFactory carFactory;
	private int numFastMachines;
	private int numSlowMachines;
	private int numFreeFast;
	private int numFreeSlow;
	private FIFO carQueue;
	private float lastEvent;
	private float queueTime;
	private float idleMachineTime;
	private int rejectedCars; //Ska vi ha long eller int? Tänker att en int bör räcka men det beror ju på hur stort antal som ska kunna rejectas.
	private RandomStreams RandomStream; //Ska vi ha ett objekt av RandomStreams här?
	private int seed;
	
	public carwashState(int numFast, int numSlow, int seed){
		this.numFastMachines = numFast;
		this.numSlowMachines = numSlow;
		this.seed = seed;
		this.carQueue = new FIFO();
		this.carFactory = new CarFactory();
	}
	public void getCarFromQueue(){
		FIFO.getFirst();
	}
	public void putCarInQueue(Car bil){		
		this.carQueue.add(bil);			//Här skickar vi in ett bilobjekt.
	}
	public boolean isQueueEmpty(){
		return this.carQueue.isEmpty();
	}
	public int sizeOfQueue(){
		return this.carQueue.size();
	}
	public void washCar(){		//Här skickar vi in ett bilobjekt.
		
	}
	public void updateQueueTime(Event lastEvent){ //Osäker på hur vi ska göra här.
										
	}
}

