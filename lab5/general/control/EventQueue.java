package lab5.general.control;

public class EventQueue {
	public static void main(String[] args) {
		SortedSequence kalle = new SortedSequence();
		Event event1 = new Event(3.14);
		Event event2 = new Event(1.337);
		Event event3 = new Event(5.23);
		Event event4 = new Event(108.31);
		Event event5 = new Event(0.89);
		kalle.add((Object)event1, event1.getTime());
		kalle.add((Object)event2, event2.getTime());
		kalle.add((Object)event3, event3.getTime());
		kalle.add((Object)event4, event4.getTime());
		kalle.add((Object)event5, event5.getTime());
		while(!(kalle.isEmpty())){
			Object fisk = kalle.getFirst();
			System.out.println(((Event) fisk).getTime());
			kalle.deleteFirst();
		}
	}
}
