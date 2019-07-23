package section6.exercises;

public class Rectangle {
	
	private double width;
	private double length;
	
	
	/**
	 * @param width
	 * @param length
	 */
	public Rectangle(double width, double length)
	{
		
		if(width < 0) 
		{
			this.width = 0;
		}
		else 
		{
			this.width = width;
		}
		
		if(length < 0) 
		{
			this.length = 0;
		}
		else 
		{
			this.length = length;
		}
	}


	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}


	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	
	public double getArea() 
	{
		return this.length * this.width;
	}
	
	

}
