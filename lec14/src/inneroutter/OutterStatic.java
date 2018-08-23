package inneroutter;

public class OutterStatic {
	
	static int iData=30;
	
	static class Inner{
		void msg() {
			System.out.print("The data is "+iData);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutterStatic.Inner os = new OutterStatic.Inner();
		os.msg();

	}

}
