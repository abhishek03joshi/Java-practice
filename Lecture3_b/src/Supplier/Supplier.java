package Supplier;
import java.util.Scanner;

public class Supplier {

	Scanner sc = new Scanner(System.in);
	
	int id;
	String name;
	//Initializing constructors via System.in
	public Supplier() {
		System.out.print("Please enter id ");
		id = sc.nextInt();
		System.out.print("Please enter Name ");
		name = sc.next();
	}
	
	public void show() {
		System.out.println("ID : "+id);
		System.out.println("Name is : "+name);
	}
	
	public static void main(String[] args) {
		
		Supplier sp = new Supplier();
		
		sp.show();

	}

}
