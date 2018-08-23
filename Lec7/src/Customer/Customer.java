package Customer;

abstract public class Customer {

	double creditlimit;
	
	abstract public void contact();
	
	public void discount(float dis, int amount, String type) {
		
		System.out.println("Discount calculated!!");
	}
	
}
