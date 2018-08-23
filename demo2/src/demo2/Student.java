package demo2;
import java.util.Scanner;

public class Student {
	
	int rollNum;
	String fName;
	String lName;
	int std;
	char div;
	
	void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter roll num : ");
		rollNum=sc.nextInt();
		
		System.out.print("Please enter first name : ");
		fName=sc.next();
		
		System.out.print("Please enter last name : ");
		lName=sc.next();
		
		System.out.print("Please enter standard : ");
		std=sc.nextInt();
		
		System.out.print("Please enter division : ");
		div=sc.next().charAt(0);
				
		sc.close();
		
	}
	
	
	
	void output() {
		
		System.out.println("Roll Num : "+rollNum);
		System.out.println("First Name : "+fName);
		System.out.println("Last Name : "+lName);
		System.out.println("Standard : "+std);
		System.out.println("Division : "+div);
	}

}
