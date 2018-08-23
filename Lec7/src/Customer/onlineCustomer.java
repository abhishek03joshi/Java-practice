package Customer;

public class onlineCustomer extends Customer {
	int id;
	String type;
	
	public onlineCustomer(int id, String type, double creditlimit) {
		this.id=id;
		this.type=type;
		this.creditlimit=creditlimit;		
	}
	
	public void contact() {
		System.out.println("Online");
	}

}
