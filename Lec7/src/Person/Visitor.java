package Person;
import java.util.Scanner;

public class Visitor extends Person{
	
	Scanner sc = new Scanner(System.in);
	
	int cardNum;
	String dateOfVisit;
	
	public void getVisitor() {
		getPerson();
		System.out.println("Enter the cardNumber of visitor");
		cardNum=sc.nextInt();
		System.out.println("Enter the date of visit of visitor");
		dateOfVisit=sc.next();
		
	}
	
	public void showVisitor() {
		showPerson();
		System.out.println("Card Num"+cardNum);
		System.out.println("date Of Visit of "+fName+" "+lName+" is "+dateOfVisit);
	}

}
