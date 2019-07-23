package introtojava.chapter8.objectsandclasses.exercises;

import java.util.Date;

/**
 * Write a program that creates a Date object, sets its elapsed time to 10000, 100000, 1000000, 
 * 10000000, 100000000, 1000000000, 10000000000, and 100000000000, and displays the date and time using  
 * the toString() method, respectively.
 * **/


public class TestDateClass {
	
	public static void main(String[] args) {
		
		Date dateOne = new Date(10000);
		System.out.println("Date and time elapsed since 10000ms:" + dateOne.toString());
		
		Date dateTwo = new Date(100000);
		System.out.println("Date and time elapsed since 100000ms:" + dateTwo.toString());
		
		Date dateThree = new Date(1000000);
		System.out.println("Date and time elapsed since 1000000ms:" + dateThree.toString());
		
		Date dateFour = new Date(10000000);
		System.out.println("Date and time elapsed since 10000000ms:" + dateFour.toString());
		
		Date dateFive = new Date(100000000);
		System.out.println("Date and time elapsed since 100000000ms:" + dateFive.toString());
		
		Date dateSix = new Date(1000000000);
		System.out.println("Date and time elapsed since 1000000000ms:" + dateSix.toString());
		
		Date dateSeven = new Date(10000000000L);
		System.out.println("Date and time elapsed since 10000000000ms:" + dateSeven.toString());
		
		Date dateEight = new Date(100000000000L);
		System.out.println("Date and time elapsed since 100000000000ms:" + dateEight.toString());
	}
}
