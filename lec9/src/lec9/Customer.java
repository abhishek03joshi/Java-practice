package lec9;

abstract public class Customer implements iCustomer{

	abstract public void returnPolicy();
	
	
	public void points(int amount) {
		System.out.println("Calculate points");
		
	}
	
}
