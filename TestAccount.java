package introtojava.chapter8.objectsandclasses.exercises;

public class TestAccount {

	public static void main(String[] args) {
		
		
		Account accountObject = new Account(1122, 20000);
		accountObject.setAnnualInterestRate(4.5);
		accountObject.withdraw(2500);
		accountObject.deposit(3000);
		System.out.println("The balance is:"+accountObject.getBalance() +
							"\nThe monthly Interest is:"+accountObject.getMonthInterest() +
							"\nThe account was created on:"+accountObject.getDateCreated());
		
		System.out.println("==================================");
		Account accountObjectTwo = new Account(2213, 25000);
		accountObjectTwo.setAnnualInterestRate(3.5);
		accountObjectTwo.withdraw(1500);
		accountObjectTwo.deposit(2500);
		System.out.println(accountObjectTwo.getID());
		System.out.println("The balance is:"+accountObjectTwo.getBalance() +
							"\nThe monthly Interest is:"+accountObjectTwo.getMonthInterest() +
							"\nThe account was created on:"+accountObjectTwo.getDateCreated());

	}

}
