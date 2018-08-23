package loop;

public class Prime {
	int num;
	
	public Prime(int num) {
		this.num = num;
	}
	
	/*public void primeornot() {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				continue;
			}
		}
		System.out.println("Number "+num+" is a prime number");
	}*/
	
	public void optimumprime() {
		int flag=0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		
		if(flag ==0) {
			System.out.println(num + " is prime");
		}
		else {
			System.out.println(num + " is not prime");
		}
	}

}
