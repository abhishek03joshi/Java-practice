package Number1;

public class Factorial1 {

	//this class is used to calculate the factorial of a number
	
	int num;
	
	public Factorial1(int num) {
		this.num=num;
	}
	
	public double factorial() {
		double fact = 1;
		for(int i=2;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	
	
}
