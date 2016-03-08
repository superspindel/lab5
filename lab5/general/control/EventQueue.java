package lab5.general.control;

public class EventQueue {
	private SortedSequence Queue;
	public EventQueue(){
		this.Queue = new SortedSequence();
	}
	public static void main(String[] args) {
		
	}
	public void add(Event event)
	{
		this.Queue.add(event, event.getTime());
	}
	
	public Event getFirst()
	{
		return this.Queue.getFirst();
	}
	
	public void deleteFirst(){
		this.Queue.deleteFirst();
	}
	
	public boolean isEmpty(){
		return this.Queue.isEmpty();
	}
	
	public void removeAll()
	{
		while(!(this.Queue.isEmpty()))
		{
			this.Queue.deleteFirst();
		}
	}
}
