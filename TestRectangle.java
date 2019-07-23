package introtojava.chapter8.objectsandclasses.exercises;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TestRectangle {
	
	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("#.########");	
	df.setRoundingMode(RoundingMode.CEILING);
	
	Rectangle rectOne = new Rectangle(4, 40);
	Rectangle rectTwo = new Rectangle(3.5, 35.9);
	
	System.out.println("For Rectangle One: ");
	System.out.println("Width is:"+rectOne.width + ", Height is:" + rectOne.height + ", Area is:" + 
					   df.format(rectOne.getArea()) + " and Perimeter is "+ df.format(rectOne.getPerimeter()));
	
	System.out.println("For Rectangle Two: ");
	System.out.println("Width is:"+rectTwo.width + ", Height is:" + rectTwo.height + ", Area is:" + 
			df.format(rectTwo.getArea()) + " and Perimeter is "+ df.format(rectTwo.getPerimeter()));
	}
}