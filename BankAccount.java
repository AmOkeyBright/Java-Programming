package section6.exercises;


/**
 * Create a new class for a bank account
 * Create fields for the account number, balance, customer name, email and phone number.
 * 
 * Create getters and setters for each field
 * Create two additional methods
 * 
 * 1. To allow the customer to deposit funds (this should increment the balance field)
 * 2. To allow the customer to withdraw funds. This should deduct from the balance field,
 * but not allow the withdrawal to complete if there are insufficient funds
 * 
 * 
 * 
 * 
 * */

public class BankAccount {
	
	
	private String accountNumber;
	private double accountBalance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	
	/**
	 * @param customerName
	 * @param customerEmailAddress
	 * @param customerPhoneNumber
	 */
	public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
		this("999999", 100.55, customerName, customerEmailAddress,customerPhoneNumber);
	}
	
	/**
	 * @param accountNumber
	 * @param accountBalance
	 * @param customerName
	 * @param customerEmailAddress
	 * @param customerPhoneNumber
	 */
	public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmailAddress,
			String customerPhoneNumber) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
		System.out.println("Bank Account Constructor with parameters called");
	}




	public BankAccount() 
	{
		this("88888", 1.50, "Default CustomerName", "Default EmailAddress", "Default Phone");
		System.out.println("Empty Constructor called");
	}
	
	
	
	
	
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the accountBalance
	 */
	public double getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerEmailAddress
	 */
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	/**
	 * @param customerEmailAddress the customerEmailAddress to set
	 */
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	/**
	 * @return the customerPhoneNumber
	 */
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	/**
	 * @param customerPhoneNumber the customerPhoneNumber to set
	 */
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public void depositAmount(double amount) 
	{
		this.accountBalance = this.accountBalance + amount;
	}
	
	public void withdrawAmount(double amount) 
	{
		if (amount > this.accountBalance) 
		{
			System.out.println("Insufficient funds to perform this transaction");
			System.out.println("Your account balance is $" + this.accountBalance);
		}
		else 
		{
			this.accountBalance = this.accountBalance - amount;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob Brown",
				"testing@gmail.com", "(087) 123-45678");
		System.out.println(bobsAccount.accountBalance);
		
	}

}
