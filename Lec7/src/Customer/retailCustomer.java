package Customer;

public class retailCustomer extends Customer {
	
	int id;
	String type;
	String city;
	
	public retailCustomer(int id, String type, String city, double creditlimit) {
	
		this.id= id;
		this.type=type;
		this.city=city;
		this.creditlimit=creditlimit;
	}
	
	public void contact() {
		System.out.println("SMS");
	}
	
	

}
