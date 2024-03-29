package section6.exercises;

/**
* Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
* Write the following methods (instance methods):
* Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
* Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
* Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
* Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
* Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
* Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
* Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
* Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
 * 
 * */

public class SimpleCalculator {
	
	private double firstNumber;
	private double secondNumber;
	
	
	public double getFirstNumber() 
	{
		return this.firstNumber;
	}
	
	public void setFirstNumber(double firstNumber) 
	{
		this.firstNumber = firstNumber;
	}
	
	public double getSecondNumber() 
	{
		return this.secondNumber;
	}
	
	public void setSecondNumber(double secondNumber) 
	{
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult() 
	{
		return this.firstNumber + this.secondNumber;
	}
	
	public double getSubtractionResult() 
	{
		return this.secondNumber - this.firstNumber;
	}
	
	public double getMultiplicationResult() 
	{
		return this.secondNumber * this.firstNumber;
	}
	
	public double getDivisionResult() 
	{
		if (this.secondNumber == 0) 
		{
			return 0;
		}
		return this.firstNumber / this.secondNumber;
		
	}
	

	public static void main(String[] args) {
		
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("Addition = " + calculator.getAdditionResult());
		System.out.println("Subtraction = " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("Multiplication = " + calculator.getMultiplicationResult());
		System.out.println("Division = " + calculator.getDivisionResult());

	}

}
