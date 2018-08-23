package loop;

public class Loop {

	public void show() {
		
		for(int a=0; a<10; a++) {
			if(a%2==0) {
				continue;
			}
			System.out.println(a);
			
		}
	}
	
	public void sumeven() {
		int sum = 0;
		for(int a=0; a<10; a++) {
			if(a%2==0) {
				sum +=a;
				System.out.println(a);
			}			
		}
		System.out.println("Even sum is "+sum);
		
	}
	
	public void sumodd() {
		int sum = 0;
		for(int a=0; a<10; a++) {
			if(a%2==0) {
				continue;
			}
			sum+=a;
			System.out.println(a);			
		}
		System.out.println("Odd sum is "+sum);
	}
	
	public void total() {
		int total = 0;
		for(int a=0; a<10; a++) {
			total+=a;				
		}
		System.out.println("Total is "+total);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Loop l = new Loop();
		//l.show();
		/*l.sumeven();
		l.sumodd();
		l.total();*/
		
		Prime p = new Prime(40);
		p.optimumprime();

	}

}
