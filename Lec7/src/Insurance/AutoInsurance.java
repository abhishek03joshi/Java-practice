package Insurance;

public class AutoInsurance extends Insurance{
	
	
	String name;
	String car;
	int years;
	
	public AutoInsurance(float amount, String name, String car, int years) {
		this.amount=amount;
		this.name=name;
		this.car=car;
		this.years=years;
	}
	
	public void coverage() {
		System.out.println("Coverage for"+car+" is "+amount+"up to"+years+" years.");
	}
	
	
	public void display() {
		System.out.println(amount);
		System.out.println(name);
		System.out.println(car);
		System.out.println(years);
		
	}

}
