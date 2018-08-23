package Number;

public class Square {
	
	int num;
	
	public Square(int num) {
		this.num=num;
	}
	
	public void isSquare() {
		int n = num/2;
		int flag=0;
		for (int i=1; i<=n;i++) {
			if(num==i*i) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println(num+" is a square num");
		}
		else {
			System.out.println(num+" is a non square num");
		}
	}

}
