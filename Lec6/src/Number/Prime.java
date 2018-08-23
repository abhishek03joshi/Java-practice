package Number;

public class Prime {
	
	int num;
	
	
	public Prime(int num) {
		this.num=num;
	}

	public int prime(int num) {
		int flag = 0;
		for (int i=2; i<num;i++) {
			if(num%i==0) {
				flag = 1;
				break;
			}
		}
		return flag;
	}
	
	public int reverse(int num) {
		int temp = 0;
		int rev = 0;
		int digit = 0;
		temp = num;
		
		while(temp > 0) {
			digit = temp % 10;//extraction of single digit
			rev = rev*10 + digit;//conversion of digit in to a number to make a reverse number 
			temp = temp /10;//digit count iteration
		}
		return rev;
	}
	
	public void twistedPrime() {
		int p=0;
		int r=0;
		int p2=0;
		p=prime(num);
		if(p==0) {
			r=reverse(num);
			p2=prime(r);
			if(p2==0) {
				System.out.println(num+" is twisted prime number");
			}
			else {
				System.out.println(num+" is just prime");
			}
		}
		else {
			System.out.println(num+" is not a prime number");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prime p = new Prime(23);
		
		//p.twistedPrime();
		/*double fact=0d;
		Twin t = new Twin(6,7);
		t.prin();*/
		
		//Factorial
		/*double fact=0d;
		Factorial f = new Factorial(5);		
		fact=f.fac();
		System.out.println("Factorial is "+fact);*/
		
		/*Palindrome pal1 = new Palindrome(121);
		pal1.pal();
		Palindrome pal2 = new Palindrome(234);
		pal2.pal();*/
		
		Square s = new Square(25);
		s.isSquare();
		
		
		
		
		
		

	}

}
