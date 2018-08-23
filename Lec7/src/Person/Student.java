package Person;
import java.util.Scanner;


public class Student extends Person{
	
	Scanner sc = new Scanner(System.in);
	
	int rollNum;
	String std;
	String div;
	
	public void getStudent() {
		getPerson();
		System.out.print("Enter the rollnum ");
		rollNum=sc.nextInt();
		System.out.print("Enter the std ");
		std=sc.next();
		System.out.print("Enter the div ");
		div=sc.next();
	}
	
	public void showStudent() {
		
		showPerson();
		System.out.println("Roll num is "+rollNum);
		System.out.println("Std is "+std);
		System.out.println("Div is "+div);
		
	}
	
	

}
