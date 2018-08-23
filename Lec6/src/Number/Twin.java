package Number;

public class Twin {

	int num1;
	int num2;
	
	public Twin(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public int prime(int num) {
		int flag = 0;
		for(int i=2;i<num;i++) {
			if(num%i ==0) {
				flag=1;
				break;
			}
		}
		return flag;
	}
	
	public void prin() {
		int p1,p2;
		double d=0;
		d=num1-num2;
		if(d==2 || d==-2 ) {
			p1=prime(num1);
			p2=prime(num2);
			if(p1==0 && p2==0) {
				System.out.println(num1+" and "+num2+" are twin prime");									
				}
			else {
				System.out.println(num1+" and "+num2+" are not twin prime");
				}
			}
		else{
			System.out.println("Not eligible for twin prime");
		}
		
		}
		
}	

