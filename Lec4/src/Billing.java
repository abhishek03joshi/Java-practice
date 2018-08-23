
public class Billing {

	String cellnum;
	int calls;
	double billamount;
	
	public Billing(String cellnum, int calls) {
		this.cellnum=cellnum;
		this.calls=calls;
		this.billamount=0.0d;	//initialize to zero to avoid junk and non printable characters	
		
	}
	
	public void calculateBill() {
		if(calls >=0 && calls <=100) {
			System.out.println("Monthly bill is : "+billamount); 
		}
		else if(calls >100 && calls <=200) {
			billamount = (calls-100)*2;
			System.out.println("Monthly bill is : "+billamount);			
		}
		else {
			billamount = (calls-200)*3 + 100*2;
			System.out.println("Monthly bill is : "+billamount);
		}
	}
}
