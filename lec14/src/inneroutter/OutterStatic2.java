package inneroutter;

public class OutterStatic2 {

	
	static int Data=30;
	
	static class Outter{
		void display() {
			System.out.println(Data);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutterStatic2.Outter o = new OutterStatic2.Outter();
		
		o.display();

	}

}
