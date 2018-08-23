package Person;
import java.util.Scanner;

public class Employee extends Person {
	
	Scanner sc = new Scanner(System.in);
	
	int id;
	float salary;
	String doj;
	
	public void getEmployee() {
	
		getPerson();
		System.out.print("Enter the id ");
		id = sc.nextInt();
		System.out.print("Enter the salary ");
		salary = sc.nextFloat();
		System.out.print("Enter the doj ");
		doj = sc.next();
	}
	
	public void showEmployee() {
		showPerson();
		System.out.println("ID is "+id);
		System.out.println("Salary is "+salary);
		System.out.println("DOJ is "+doj);
	}
	

}
