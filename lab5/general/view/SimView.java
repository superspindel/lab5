package lab5.general.view;

import java.util.Observable;
import java.util.Observer;

import lab5.general.model.SimState;

public class SimView implements Observer {
	private SimState myState;
	
	public SimView(SimState theState)
	{
		this.myState = theState;
	}
	
	public void update(Observable obs, Object obj)
	{
		
	}
	public void firstPrint()
	{
		
	}
	public void afterPrint()
	{
		
	}
}