package demo2;
import java.util.Scanner;

public class Teacher {
	String fName;
	String lName;
	double salary;
	String sub;
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name of Teacher : ");
		fName=sc.next();
		System.out.print("Enter the last name of Teacher : ");
		lName=sc.next();
		System.out.print("Enter the salary of the Teacher : ");
		salary=sc.nextInt();
		System.out.print("Enter the name of subject taught by the Teacher : ");
		sub=sc.next();
		
		sc.close();
		
	}
	
	public void display() {
		
		System.out.println("First name of the teacher is "+fName);
		System.out.println("Last name of the teacher is "+lName);
		System.out.println("Salary of the teacher is "+salary);
		System.out.println("Subject taught by the teacher is "+sub);
		
	}
	

}
