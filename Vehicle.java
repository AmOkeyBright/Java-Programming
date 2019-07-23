package section6.exercises;


/**
 * 
 * Start with a base class of a vehicle, then create a Car class that inherits from this base class.
 * Finally, create another class, a specific type of Car that inherits from the Car Class.
 * You should be able to hand steering, changing gears, and moving (speed in other words). You will want to decide where to put
 * the appropriate state and behaviours (fields and methods)
 * As mentioned above, changing gear, increasing and decreasing speed should be included. 
 * For your specific type of vehicle, you will want to add something specific for that type of Car
 * 
 * */

public class Vehicle {
	
	private String name;
	private String size;
	private int currentVelocity;
	private int currentDirection;
	
	/**
	 * @param name
	 * @param size
	 */
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}
	
	
	public void steer(int direction) 
	{
		this.currentDirection = this.currentDirection + direction;
		System.out.println("Vehicle.steer(): Steering at " + this.currentDirection + " degrees.");
	}
	
	public void move(int velocity, int direction) 
	{
		this.currentVelocity = velocity;
		this.currentDirection = direction;
		System.out.println("Vehicle.move(): Moving at " + this.currentVelocity + " in direction " + this.currentDirection);
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}


	/**
	 * @return the currentVelocity
	 */
	public int getCurrentVelocity() {
		return currentVelocity;
	}


	/**
	 * @return the currentDirection
	 */
	public int getCurrentDirection() {
		return currentDirection;
	}
	
	
	
	/**
	 * stop the vehicle
	 */
	public void stop() 
	{
		this.currentVelocity = 0;
	}
	
	
	
	
	
	
	

}
