package lab5.general.view;

import java.util.Observer;

import lab5.general.model.SimState;

public abstract class SimView implements Observer {
	private SimState myState;
	
	public SimView(SimState theState)
	{
		this.myState = theState;
	}
	
	public abstract void update();
	public abstract void firstPrint();
	public abstract void afterPrint();
}