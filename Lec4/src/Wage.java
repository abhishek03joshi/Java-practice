
public class Wage {

	String name;
	int hr;
	double wages;
	double rate;
	
	public Wage (String name, int hr, double rate) {
		this.name=name;
		this.hr=hr;
		this.wages=0.0d;
		this.rate=rate;		
	}
	
	void check() {
		if(hr<=40) {
			wages = rate * 40;
			System.out.println("The wage is "+wages);
	
		}
		else if(hr>40 && hr<=60) {
			wages = (hr-40)*1.5*rate + rate*40;
			System.out.println("The wage is "+wages);
		}
		else{
			wages = (hr-60)*2*rate + rate*20*1.5 + rate*40;
			System.out.println("The wage is "+wages);
		}
	}
}
