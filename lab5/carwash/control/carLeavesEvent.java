package lab5.carwash.control;

public class carLeavesEvent {
	private Car myCar;
	private carwashState myCarwashState;
	private boolean slowCheck;
	private boolean fastCheck;

	public carLeavesEvent(carwashState setState) {
		this.myCarwashState = setState;
	}

	public void execute() {
		this.myCar = createCar();
	}

	private Car createCar() {
		return this.myCarwashState.carFactory.createCar();
	}

	private void checkWashers() {
		if (myCarwashState.numFreeSlow < 2) {
			slowCheck = true;
		} else {
			slowCheck = false;
		}
		if (myCarwashState.numFreeFast < 2) {
			fastCheck = true;
		} else {
			fastCheck = false;
		}

	}

	private void washCar() {
		if(den ska vara långsam && (slowCheck == true)){
			myCarwashState.numFreeSlow--;
			//Ändra state
			return;
		} 
		if(den ska vara snabb && (fasCheck == true)){
			myCarwashState.numFreeFast--;
			//Ändra state
			return;
		}
	}

	private void createEventForWash() {

	}

	private void queueCar(){
		checkWashers();
		if(slowCheck == false && fastCheck == false){
			//Sätt bilen i FIFO
		}
	}
}
