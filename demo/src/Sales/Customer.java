package Sales;

public class Customer {
	public int id;
	public String fName;
	public String lName;
	public String type;
	public String contact;
	
	public void show () {
		System.out.println("Customer details:");
		System.out.println("ID "+id);
		System.out.println("first Name "+fName);
		System.out.println("Last Name"+lName);
		System.out.println("Type of customer "+type);
		System.out.println("Contact info"+contact);
	}
}
