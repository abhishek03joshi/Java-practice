package person;

public class Supplier extends Person{
	
	String services;
	String contact;
	
	public Supplier() {
		System.out.println("Child class constructor");
		
		services = "";
		contact = "";
	}
	
	public Supplier(String fName,String lName,String services, String contact) {
		
		super(fName,lName);
		System.out.println("Parametrized child class");
		this.services = services;
		this.contact = contact;
		
	}
	
	public void showSupplier() {
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(services);
		System.out.println(contact);
	}

}
