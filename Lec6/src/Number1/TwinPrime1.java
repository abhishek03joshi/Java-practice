package Number1;

public class TwinPrime1 {
	
	int num1;
	int num2;
	
	public TwinPrime1 (int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	int prime(int n) {
		int flag=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		return flag;
	}
	
	public void isTwinPrime() {
		int p1;
		int p2;
		double d;
		d = num1 - num2;
		if(d==2 || d==-2) {
			p1=prime(num1);
			p2=prime(num2);
			if(p1==0 && p2==0) {
				System.out.println(num1+" and "+num2+" are twin prime numbers");
			}
			else {
				System.out.println(num1+" and "+num2+" are not twin prime numbers");
			}
		}
		else {
			System.out.println("Numbers are not eligible for twin prime");
		}
		
	}

}
