package introtojava.chapter8.objectsandclasses.exercises;

/**
 * Design a class named StopWatch. The class contains:
 * Private data fields startTime and endTime with get methods.
 * A no-arg constructor that initializes startTime with the current time.
 * A method named start() that resets the startTime to the current time.
 * A method named stop() that sets the endTime to the current time.
 * A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test program that measures the execution
 * time of sorting 100,000 numbers using selection sort.
 * **/






public class Stopwatch {
	
	
	private long startTime;
	private long endTime;
	
	public Stopwatch() 
	{
		this.startTime = System.currentTimeMillis();
	}
	
	public long getStartTime() 
	{
		return this.startTime;
	}
	
	public long getEndTime() 
	{
		stop();
		return this.endTime;
	}
	
	public void start() 
	{
		this.startTime = System.currentTimeMillis();
	}
	
	public void stop() 
	{
		this.endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() 
	{
		return this.getEndTime() - this.getStartTime();
	}

}
