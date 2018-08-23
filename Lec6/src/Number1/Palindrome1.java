package Number1;

public class Palindrome1 {
	public int num;
	
	public Palindrome1(int num) {
		this.num=num;
	}
	
	public void reverse() {
		int rev=0;
		int digit;
		int temp;
		temp=num;
		while(temp > 0) {
			digit = temp%10;
			//System.out.println(digit);
			rev = rev*10+digit;
			//System.out.println(rev);
			temp = temp / 10;
			//System.out.println(temp);
		}
		if(rev == num) {
			System.out.println(num+" number is a palindrome");
		}
		else {
			System.out.println(num+" number is not a palindrome");
		}		
	}
	
	/*public void isPalin() {
		int rev;
		rev=reverse(this.num);
		if(rev == num) {
			System.out.println(num+" number is a palindrome");
		}
		else {
			System.out.println(num+" number is not a palindrome");
		}
	}*/
	
	

}
