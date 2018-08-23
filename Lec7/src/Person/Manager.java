package Person;
import java.util.Scanner;

public class Manager extends Employee{
	
	Scanner sc= new Scanner(System.in);
	
	double incentive;
	int reporting;
	String depHead;
	
	public void getManager() {
		getEmployee();
		System.out.print("Enter the incentive ");
		incentive=sc.nextDouble();
		System.out.print("Enter the reporting ");
		reporting=sc.nextInt();
		System.out.print("Enter the deparment headed ");
		depHead=sc.next();
	}
	
	public void showManager() {
		showEmployee();
		System.out.println("Incentive is "+incentive);
		System.out.println("Reporting is "+reporting);
		System.out.println("Department headed is "+depHead);
	}

}
