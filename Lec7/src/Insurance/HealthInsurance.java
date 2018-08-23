package Insurance;

public class HealthInsurance extends Insurance {
	
	String name;
	int num;
	String coverage;
	int years;
	
	public HealthInsurance(float amount, String name, int num, String coverage, int years) {
		this.amount=amount;
		this.name=name;
		this.num=num;
		this.coverage=coverage;
		this.years=years;
	}
	
	public void coverage() {
		System.out.println("Coverage is for "+years+" years");
	}
	
	
	public void display() {
		System.out.println(amount);
		System.out.println(name);
		System.out.println(num);
		System.out.println(coverage);
		System.out.println(years);
		
		
	}

}
