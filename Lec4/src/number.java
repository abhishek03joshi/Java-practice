
public class number {
	
	int number;
	
	public number(int number) {
		this.number = number;
	}
	
	public void check() {
		if(number >=0 && number <=10) {
			System.out.println(number+" is between 0 - 10");
		}
		
		else if(number >10 && number <=20) {
			System.out.println(number+" is between 10 - 20");
		}
		else{
			System.out.println(number+" is greater than 20");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*number n = new number(10);
		number m = new number(20);
		number o = new number(100);
		n.check();
		m.check();
		o.check();*/
		
		
		/*Tax t = new Tax(300000);
		Tax l = new Tax(30000);
		Tax m = new Tax(135000);
		t.check();
		l.check();
		m.check();*/
		
		/*Wage w = new Wage("Bob", 35, 25.00);
		Wage x = new Wage("Alice", 60, 35.00);
		Wage y = new Wage("Smith", 85, 40.00);
		w.check();
		x.check();
		y.check();*/
		
		Billing a = new Billing("9987456789", 50);
		Billing b = new Billing("9876234098", 125);
		Billing c = new Billing("9856234098", 275);
		a.calculateBill();
		b.calculateBill();
		c.calculateBill();
		
		
		
		
		}

	}


