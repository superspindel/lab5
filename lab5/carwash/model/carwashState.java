package temp;

public class carwashState extends simState {

	private int numFastMachines;
	private int numSlowMachines;
	private int numFreeFast;
	private int numFreeSlow;
	private FIFO carQueue;
	private ? lastEvent;
	private ? queueTime;
	private ? idleMachineTime;
	private int rejectedCars; //Ska vi ha long eller int? Tänker att en int bör räcka men det beror ju på hur stort antal som ska kunna rejectas.
	private RandomStreams RandomStream; //Ska vi ha ett objekt av RandomStreams här?
	
	public carwashState(numFast, numSlow, seed){
		
	}
	public void getCarFromQueue(){
		
	}
	public void putCarInQueue(){		
		FIFO.add();			//Här skickar vi in ett bilobjekt.
	}
	public boolean isQueueEmpty(){
		FIFO.isEmpty();
	}
	public int sizeOfQueue(){
		FIFO.size();
	}
	public ? washCar(){		//Här skickar vi in ett bilobjekt.
		
	}
	public updateQueueTime(lastEvent){ //Osäker på hur vi ska göra här.
										
	}
}

