package Number1;

public class Number {
	
	private int num;
	private int sum;
	
	public Number(int num) {
		this.num=num;
		this.sum=0;
	}
	
	
	public void neon() {
		int temp;
		int square;
		temp = num;
		int digit=0;
		square = num*num;
		while(square > 0) {
			digit = square%10;
			sum = sum+digit;
			square /= 10;
		}
		
		if(sum==num){
			System.out.println("Number "+num+" is a Neon Number");
		}
		else {
			System.out.println("Number "+num+" is not a Neon Number");
		}
		
	}
	
	public void armstrong() {
		int digit=0;
		int temp;
		temp = num;
		int cube=0;
		while(temp > 0) {
			digit = temp % 10;
			System.out.println("digit :"+digit);
			cube = digit*digit*digit*digit;
			System.out.println("cube : "+cube);
			sum = sum+cube;
			System.out.println("sum : "+sum);
			temp /=10;
			System.out.println("temp : "+temp);
		}
		
		if(sum==num) {
			System.out.println("Number "+num+" is an armstrong number");
		}
		else {
			System.out.println("Number "+num+" is not an armstrong number");
		}
		
	}
	
	public void duck() {
		int temp;
		temp=num;
		int digit=1;
		while(temp > 0) {
			digit = temp % 10;
			if(digit ==0) {
				break;
			}
			temp /= 10;			
		}
		if(digit == 0) {
			System.out.println(num+" is a duck number.");
		}
		else {
			System.out.println(num+" is not a duck number.");
		}
	}
	
	public void buzz() {
		int temp;
		temp = num;
		if(temp%10==7 || temp%7==0) {
			System.out.println(num+" is a buzz number");
		}
		else {
			System.out.println(num+" is not a buzz number");
		}
	}
	
	public void fib() {
		int num1=0;
		int num2=1;
		int sum1=0;
		System.out.print(num1+ " ");
		System.out.print(num2+ " ");
		for(int i=1;i<=6;i++) {			
			sum1 = num1+num2;
			System.out.print(sum1+ " ");
			num1=num2;
			num2=sum1;
		}
		
	}
	
	public void automorphic() {
		int temp;
		int square;
		String n;
		int length;
		int result;
		temp = num;
		square = temp*temp;
		n= num+"";
		length = n.length();
		result = (int) (temp % Math.pow(10, length));
		if(result == num) {
			System.out.println("Number is automorphic");
		}
		else {
			System.out.println("Number is not automorphic");
		}		
		
	}

}
