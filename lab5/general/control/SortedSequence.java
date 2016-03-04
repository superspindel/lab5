package lab5.general.control;

public class SortedSequence {
	
	private Node startnode;
	private int Length;
	
	private class Node 
	{
		private Node next;
		private Event cargo;
		private double ranking;
		public Node(Event event, double ranking) {
			this.next = null;
			this.cargo = event;
			this.ranking = ranking;
		}
	}
	public SortedSequence(){
		this.startnode = new Node(null, 0);
	}
	
	public Event getFirst()
	{
		return startnode.next.cargo;
	}
	public void add(Event event, double ranking)
	{
		boolean added = false;
		Node AddNode = new Node(event, ranking);
		if(this.isEmpty())
		{
			this.startnode.next = AddNode;
		}
		else
		{
			Node prevNode = startnode;
			Node checkNode = startnode.next;
			while(checkNode.ranking < AddNode.ranking && !added)
			{
				if(checkNode.next == null)
				{
					checkNode.next = AddNode;
					prevNode = checkNode;
					added = true;
				}
				checkNode = checkNode.next;
			}
			if(!added)
			{
				prevNode.next = AddNode;
				AddNode.next = checkNode;
			}
		}
		this.Length++;
		
	}
	public void deleteFirst()
	{
		startnode.next = startnode.next.next;
		this.Length--;
	}
	public boolean isEmpty(){
		if (this.Length != 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public int getSize(){
		return this.Length;
	}
}