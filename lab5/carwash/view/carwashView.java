package lab5.carwash.view;

private String message;

public carwashView(){
  
}
public void getMessage(){
  return message;
}
public void setMessage(String newMessage){
  message = newMessage;
}
	public void firstPrint(){
		System.out.println("Fast machines: "+myState.numfreefast;)
		System.out.println("Slow machines: "+myState.numfreeslow;)
		System.out.println("Fast distribution: "+myState.fastDis)
		System.out.println("Slow distribution: "+myState.slowDis)
		System.out.println("Exponential distribution with lambda = "+myState.lambda);
		System.out.println("Seed: "+myState.seed);
		System.out.println("Max Queue size: "+myState.maxQueueSize);
		System.out.println("----------------------------------------");
		String UpperFormattedString = String.format("%1$-5s %2$7s %3$7s %4$7s %5$-10s %6$10s %7$15s %8$15s %9$15s", "Time", "Fast", "Slow", "Id", "Event", "IdleTime", "QueueTime", "QueueSize", "Rejected");
		System.out.println(UpperFormattedString);
	}
	public void afterPrint(){
		System.out.println("----------------------------------------");
		System.out.println("Total idle machine time: "+myState.idleMachineTime);
		System.out.println("Total Queueing time: "+myState.queueTime);
		System.out.println("Mean queueing time: "+((CarFactory.numCar-myState.rejectedCars)/myState.queueTime));
	}
