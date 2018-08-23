package Number;

public class Palindrome {
	
	int num;
	int reverse;
	public Palindrome(int num) {
		this.num=num;
		this.reverse=0;
	}
	
	public void pal() {
		int temp;
		temp=num;
		int digit=0;
		while(temp>0) {
			digit=temp%10;
			reverse=reverse*10+digit;
			temp /=10;
		}
		
		if(num == reverse) {
			System.out.println(num+" is a palindrome number");
		}
		else {
			System.out.println(num+" is not a palindrome number");
		}
	}

}
