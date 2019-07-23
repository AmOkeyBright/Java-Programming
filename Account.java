package introtojava.chapter8.objectsandclasses.exercises;

import java.util.Date;

/**
 * Design a class named Account that contains:
 * 
 * A private int data field named id for the account (default is 0).
 * A private double data field named balance for the account (default 0).
 * A private double data field named annualInterestrate that stores the current interest rate (default is 0). Assume all
 * accounts have the same interest rate.
 * A private Date data field named dateCreated that stores the date when the account was created.
 * A no-arg constructor that creates a  default account.
 * A constructor that creates an account with the specified id and initial balance
 * The accessor and mutator methods for id, balance, and annualInterestRate.
 * The accessor method for dateCreated
 * A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * A method named getMonthlyInterest() that returns the monthly interest.
 * A method named withdraw that withdraws a specified amount from the account.
 * A method named deposit that deposits a specified amount to the account.
 * 
 * Draw the UML diagram for the class and then implement the class. (Hint: The method getMonthlyInterest() is to return 
 * monthly interest, not interest rate. Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is 
 * annualInterestRate / 12. Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100)
 * 
 * 
 * Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual interest
 * 
 * **/


public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestrate = 0;
	private Date dateCreated;

	public Account() 
	{
		
	}
	
	public Account(int id, double balance) 
	{
		this.id = id;
		this.balance = balance;
	}
	
	public Date getDateCreated() 
	{
		dateCreated = new Date();
		return dateCreated;
	}
	
	public int getID() 
	{
		return this.id;
	}
	
	public void setID(int id) 
	{
		this.id = id;
	}
	
	public double getBalance() 
	{
		return this.balance;
	}
	
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() 
	{
		return this.annualInterestrate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) 
	{
		this.annualInterestrate = annualInterestRate;
	}
	
	
	public double getMonthlyInterestRate() 
	{
		return (this.getAnnualInterestRate() / 1200);
	}
	
	public double getMonthInterest() 
	{
		return (this.getMonthlyInterestRate() * this.balance);
	}
	
	public void withdraw(double amount) 
	{
		if (amount > this.balance) 
		{
			System.out.println("You cannot withdraw the specified amount. Withdraw a lesser amount");
		}
		else 
		{
			this.balance = this.balance - amount;
		}
	}
	
	public void deposit(double amount) 
	{
		this.balance = this.balance + amount;
	}
}
