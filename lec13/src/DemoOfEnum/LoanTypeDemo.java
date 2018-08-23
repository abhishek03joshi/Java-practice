package DemoOfEnum;
import java.util.Scanner;

public class LoanTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iNum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.println("1-Auto loan || 2 - Home || 3 - Personal || 4 - Business");
		
		System.out.println();
		
		System.out.println("Please enter your option");
		
		iNum=sc.nextInt();
		iNum--;
		
		System.out.println();
		
		switch(iNum) {
			
			case 0:
				System.out.println("Auto loan interest rate : "+LoanType.Auto.getRate());
				break;
			case 1:
				System.out.println("Home loan interest rate : "+LoanType.Home.getRate());
				break;
			case 2:
				System.out.println("Personal loan interest rate : "+LoanType.Personal.getRate());
				break;
			case 3:
				System.out.println("Business loan interest rate : "+LoanType.Business.getRate());
				break;
			default:
				System.out.println("Invalid ");
				break;
		}
	}

}
