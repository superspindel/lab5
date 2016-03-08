package lab5.carwash.model;

public class RandomStreams {
	UniformRandomStream fastWashTime;
	UniformRandomStream slowWashTime;
	ExponentialRandomStream nextArrivalTime;
	
	public RandomStreams(long seed, double slowA, double slowB, double fastA, double fastB, double lambda)
	{
		this.fastWashTime = new UniformRandomStream(fastA, fastB, seed);
		this.nextArrivalTime = new ExponentialRandomStream(lambda, seed);
		this.slowWashTime = new UniformRandomStream(slowA, slowB, seed);
	}
	
}