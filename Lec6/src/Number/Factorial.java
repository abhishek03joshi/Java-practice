package Number;

public class Factorial {
	
	int num;
	
	public Factorial(int num) {
		this.num=num;
	}
	
	public double fac() {
		double result=1;
		for(int i=2;i<=num;i++) {
			result*=i;
		}
		return result;
	}

}
