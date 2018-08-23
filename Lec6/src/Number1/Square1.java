package Number1;

public class Square1 {
	double num;
	int i=0;
	
	public Square1(int num) {
		this.num=num;
	}

	public void isSquare() {
		double temp;
		temp = num*num;
		if(temp == num) {
			i=1;
		}
		
		if (i ==1) {
			System.out.println(num+" is a square num");
		}
		else {
			System.out.println(num+" is not a square num");
		}
	}
}
