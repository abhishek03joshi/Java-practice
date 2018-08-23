package lec9;

public class onlineCustomer extends Customer{
	
	int id;
	String name;
	
	
	public void discount() {
		System.out.println("method discount called");
	}
	
	public void contact() {
		System.out.println("method contact called");
		
	}
	
	public void paymentTerms() {
		System.out.println("method paymentTerms called");
		
	}
	
	public void returnPolicy() {
		System.out.println("method return policy called");
	}

}
