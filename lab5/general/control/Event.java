package lab5.general.control;

public class Event {
	private double TimeForEvent;
	
	public Event(double time){
		this.TimeForEvent = time;
	}
	public double getTime()
	{
		return this.TimeForEvent;
	}
}