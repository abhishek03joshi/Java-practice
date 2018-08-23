package Number1;

public class Prime1 {
	int num;
	
	public Prime1(int num) {
		this.num=num;
	}
	
	public int prime(int num) {
		int flag=0;
		for(int i=2;i<num; i++) {
			if(num%i==0) {
				flag =1;
				break;
			}			
		}
		return flag;
	}
	
	public void isPrime() {
		int f;
		f=prime(num);
		if(f==0) {
			System.out.println(num+" is a prime num");
		}
		else {
			System.out.println(num+" is not a prime num");
		}
	}
	
	public int reverse(int num) {
		int rev=0;
		int temp;
		temp=num;
		int digit;
		while(temp > 0) {
			digit=temp%10;
			rev = rev*10+digit;
			temp= temp/10;
		}
		return rev;
	}
	
	public void twistedPrime() {
		int p;
		int rev;
		int p1;
		p=prime(num);		
		if(p==0) {
			rev=reverse(num);//calling function here directly without creating its object.
			p1=prime(rev);//calling fucntion here directly without creating its object.
			if(p1 == 0) {
				System.out.println("Number is a twisted prime number");
			}
			else {
				System.out.println("Number is just a prime number");
			}
		}
		else {
			System.out.println("Number is not a prime number");
		}
		
	}

}
