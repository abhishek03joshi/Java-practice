
public class Tax {
	
	double tax;
	float amount;
	
	public Tax(float amount) {
		this.tax = 0.0d;
		this.amount = amount;
	}
	
	public void check() {
		if(amount >=0 && amount <=100000) {
			tax = amount * 0.10;
			System.out.println(amount+" is between 0 - 100000");
			System.out.println("Tax is 10% : "+tax);
		}
		
		else if(amount >100000 && amount <=200000) {
			tax = amount * 0.20;
			System.out.println(amount+" is between 100000 - 200000");
			System.out.println("Tax is 20% : "+tax);
		}
		else{
			tax = amount * 0.30;
			System.out.println(amount+" is between 200000 - 300000");
			System.out.println("Tax is 30% : "+tax);
		}
	}
	

}
