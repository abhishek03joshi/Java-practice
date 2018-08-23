package Person;
import java.util.Scanner;

public class Person {
	
	Scanner sc = new Scanner(System.in);
	
	String fName;
	String lName;
	
	public void getPerson() {
		System.out.print("Enter fname ");
		fName = sc.next();
		System.out.print("Enter lname ");
		lName = sc.next();
	}
	
	public void showPerson() {
		System.out.println("First Name is "+fName);
		System.out.println("Last Name is "+lName);
		
	}
	
	
		}
