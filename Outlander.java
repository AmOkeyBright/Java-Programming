package section6.exercises;

public class Outlander extends Car{
	
	private int roadServiceMonths;
	
	/**
	 * @param name
	 * @param size
	 * @param wheels
	 * @param doors
	 * @param gears
	 * @param isManual
	 * @param roadServiceMonths
	 */
	public Outlander(int roadServiceMonths) {
		super("Outlander", "4WD", 5, 5, 6, false);
		this.roadServiceMonths = roadServiceMonths;
	}
	
	public void accelerate (int rate) 
	{
		int newVelocity = getCurrentVelocity() + rate;
		
		if(newVelocity == 0) 
		{
			stop();
			changeGear(1);
		}
		
		else if (newVelocity > 0 && newVelocity <= 10) 
		{
			changeGear(1);
		}
		
		else if (newVelocity > 10 && newVelocity <= 20) 
		{
			changeGear(2);
		}
		
		else if (newVelocity > 20 && newVelocity <= 30) 
		{
			changeGear(3);
		}
		else 
		{
			changeGear(4);
		}
		
		if(newVelocity > 0) 
		{
			changeVelocity(newVelocity, getCurrentDirection());
		}
	}

	
	
	public static void main(String[] args) {
		
		Outlander outlander = new Outlander(36);
		outlander.steer(45);
		outlander.accelerate(30);
		System.out.println("===============================");
		outlander.accelerate(40);
		System.out.println("===============================");
		outlander.accelerate(-62);
		
	}

}
