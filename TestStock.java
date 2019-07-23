package introtojava.chapter8.objectsandclasses.exercises;

public class TestStock {

	public static void main(String[] args) {
		
		Stock orclStock = new Stock("ORCL", "Oracle Corporation");
		orclStock.setPreviousClosingPrice(34.5);
		orclStock.setCurrrentPrice(34.35); 
		
		System.out.println("The percent change in the stock price is:" + orclStock.getChangePercent() + "%");

	}

}
