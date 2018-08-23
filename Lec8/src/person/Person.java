package person;

public class Person {
	
	String fName;
	String lName;
	
	public Person() {
		System.out.println("Parent class constructor");
		fName="";
		lName="";
		
	}
	
	public Person(String fName,String lName) {
		
		System.out.println("Parametrized parent class");
		this.fName=fName;
		this.lName=lName;
		
	}

}
