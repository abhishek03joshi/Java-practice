package inneroutter;
//Used to declare a non-static class in a method and then call the method for inner class in the outter class
public class Localnner1 {
	
	private int iData=30;
	
	void display() {
		class Local{
			void msg() {
				System.out.println("Data is "+iData);
			}		
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Localnner1 ln = new Localnner1();
		ln.display();

	}

}
