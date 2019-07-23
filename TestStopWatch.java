package introtojava.chapter8.objectsandclasses.exercises;

//import java.util.Arrays;

public class TestStopWatch {

	public static void main(String[] args) 
	{
		double[] numbers = new double[100000];       
	    //Generates 10 Random Numbers in the range 1 -100000
	    for(int i = 0; i < numbers.length; i++) 
	    {
	      numbers[i] = (int)(Math.random()*100000 + 1);
	    }//end for loop
	    //System.out.println("Numbers Generated: " + Arrays.toString(numbers));
	    
	    Stopwatch timeIt = new Stopwatch();
	    System.out.println(timeIt.getStartTime());
	    SelectionSort.selectionSort(numbers);
	    System.out.println(timeIt.getEndTime());
	    System.out.println("=======================");
	    System.out.println(timeIt.getElapsedTime());
	}

}
