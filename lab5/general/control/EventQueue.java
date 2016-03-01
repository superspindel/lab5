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
		this.Queue.add((Object)event, event.getTime());
	}
	
	public Event getFirst()
	{
		return (Event)this.Queue.getFirst();
	}
	
	public void deleteFirst(){
		this.Queue.deleteFirst();
	}
	
	public boolean isEmpty(){
		return this.Queue.isEmpty();
	}
}
