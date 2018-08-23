package Person;
import java.util.Scanner;

public class Contractor extends Employee {
	
	Scanner sc = new Scanner(System.in);
	
	int durationMonth;
	String projectName;
	
	public void getContractor() {
		getEmployee();
		System.out.print("Enter the duration in Months ");
		durationMonth=sc.nextInt();
		System.out.print("Enter the project name ");
		projectName=sc.next();
	}
	
	public void showContractor() {
		showEmployee();
		System.out.println("Duration "+durationMonth);
		System.out.println("Project Name "+projectName);
	}
	

}
