package section6.exercises;

public class Car extends Vehicle {
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	
	/**
	 * @param name
	 * @param size
	 * @param wheels
	 * @param doors
	 * @param gears
	 * @param isManual
	 * @param currentGear
	 */
	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	/**
	 * @param currentGear the currentGear to set
	 */
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.changeGear(): Changed to " + this.currentGear + " gear.");
	}
	
	
	public void changeVelocity(int speed, int direction) 
	{
		System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
		super.move(speed, direction);
		
	}

}
