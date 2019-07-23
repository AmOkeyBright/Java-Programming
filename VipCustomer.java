package section6.exercises;

public class VipCustomer {

	private String customerName;
	private double customerCreditLimit;
	private String customerEmailAddress;
	
	
	
	public VipCustomer() {
		this("Default Name", 50000.0, "Default Email");
	}


	/**
	 * @param customerName
	 * @param customerEmailAddress
	 */
	public VipCustomer(String customerName, String customerEmailAddress) {
		this(customerName, 1000.0, customerEmailAddress);
	}


	/**
	 * @param customerName
	 * @param customerCreditLimit
	 * @param customerEmailAddress
	 */
	
	public VipCustomer(String customerName, double customerCreditLimit, String customerEmailAddress) {
		this.customerName = customerName;
		this.customerCreditLimit = customerCreditLimit;
		this.customerEmailAddress = customerEmailAddress;
	}


	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}


	/**
	 * @return the customerCreditLimit
	 */
	public double getCustomerCreditLimit() {
		return customerCreditLimit;
	}


	/**
	 * @return the customerEmailAddress
	 */
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	
	public static void main(String[] args) {
		
		VipCustomer personOne = new VipCustomer();
		System.out.println(personOne.getCustomerName());
		
		VipCustomer personTwo = new VipCustomer("Bob Brown", "bob.brown@gmail.com");
		System.out.println(personTwo.getCustomerName());
		
		VipCustomer personThree = new VipCustomer("John Johnson", 100000.0, "john.johnson@gmail.com");
		System.out.println(personThree.getCustomerName());
		System.out.println(personThree.getCustomerEmailAddress());
	}

}
