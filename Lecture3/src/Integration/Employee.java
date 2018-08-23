package Integration;
import java.util.Scanner;


class Employee {

	int id;
	String name;
	Scanner sc = new Scanner(System.in);
	
	public void input(Address adr) {
		System.out.print("Please enter id ");
		id = sc.nextInt();
		System.out.print("Please enter name ");
		name = sc.next();
		
		System.out.print("Please enter area  ");
		adr.area = sc.next();
		System.out.print("Please enter city ");
		adr.city = sc.next();
		System.out.print("Please enter state ");
		adr.state = sc.next();
	}
	
	public void inputSal(Salary sal) {
		System.out.print("Enter the salary : ");
		sal.salary=sc.nextDouble();
	}
	
	public void output(Address adr) {
		
		System.out.println("ID "+id);
		System.out.println("Name "+name);
		System.out.println("Area "+adr.area);
		System.out.println("City "+adr.city);
		System.out.println("State "+adr.state);
	}
	
	public void salOutput(Salary sal) {
		System.out.println("Salary "+sal.salary);
		
	}
	
	
}
