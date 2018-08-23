package Numbers;

public class Neon {
	
	int num;
	int sum;
	
	public Neon (int num) {
		this.num = num;
		this.sum = 0;
	}
	
	public void neon() {
		int square;
		int digit = 0;
		square = num*num;
		while(square > 0) {
			digit = square % 10;
			sum += digit;
			square /= 10;
		}
		
		if(sum == num) {
			System.out.println("Number is Neon");
		}
		else {
			System.out.println("Number is non-Neon");
		}
	}
	
	public void armstrong() {
		int digit = 0;
		int temp = num;		
		int cube = 0;
		int isum = 0;
		while (temp > 0) {
			digit = temp % 10;
			cube = digit* digit*digit;
			isum += cube;
			temp /= 10;
		}
		
		if(isum == num) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}
	}
		
	public void duck() {
		int temp = num;
		int digit = 0;
		int flag = 0;
		while(temp > 0) {
			digit = temp % 10;
			if (digit ==0) {
				flag = 1;
				break;
			}
		temp /= 10;	
		}
		if (flag == 1) {
			System.out.println("Number is a duck number");
		}
		else {
			System.out.println("Number is not a duck number");
		}
	}
	
	public void buzz() {
		if (num % 10 == 7 || num%7 == 0){
			System.out.println("Number is buzz number");
		}
		else {
			System.out.println("Number is non buzz number");
		}
	}
	
	public void fib() {
		int fnum = 0;
		int snum = 1;
		int fib = 0;
		
		System.out.println(fnum);
		System.out.println(snum);
		
		for(int i =0; i<8; i++) {
			fib = fnum + snum;
			System.out.println(fib);
			fnum = snum;
			snum = fib;
		}
	}
	
	public void automorphic() {
		int square = 0;
		String n;
		int length;
		int pow;
		int result = 0;
		
		square = num * num;
		
		n = num+"";//convert double to string
		
		length = n.length();
		pow = length;
		result = (int) (square % Math.pow(10, length));
		System.out.println(num+" "+square+" "+result);
		if(num == result) {
			System.out.println("Number is automorphic");
		}
		else {
			System.out.println("number is not automorphic");
		}
		
		
		
	}
	
	public void abhayauto() {
		int square = 0;
		int pow = 0;
		int rem = 0;
		int temp =0;
		square = num*num;
		temp =  square;
		while(square >0) {
			pow++;
			square /=10;
			
		}
		System.out.println(pow);
		rem = temp % (int)Math.pow(10,pow-1);
		if(rem == num) {
			System.out.println("Number is automorphic");
		}
		else {
			System.out.println("Number is not autmorphic");
		}
		
	}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Neon n = new Neon(9);
		n.neon();
		n.armstrong();
		
		
		Neon m = new Neon(5);
		m.neon();
		m.armstrong();
		
		Neon a = new Neon(153);
		a.neon();
		a.armstrong();
		a.duck();
		
		Neon d = new Neon(101);
		d.duck();*/
		
		Neon e = new Neon(376);
		e.buzz();
		e.automorphic();
		e.abhayauto();
		
		/*Neon g = new Neon(9);
		g.automorphic();
		g.abhayauto();*/
		
		/*Neon f = new Neon(177);
		f.buzz();
		f.fib();*/
		
		

	}

}
