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
	}
	public void afterPrint(){
	  
	}
