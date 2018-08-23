package inneroutter;

public class LocalInner2 {
	
	private int Data=30;
	
	void display() {
		class InnerLocal{
			void show() {
				System.out.print(Data);
			}
					
		}
		InnerLocal il = new InnerLocal();
		il.show();
	}
	
	public static void main(String [] args) {
		
		LocalInner2 li = new LocalInner2();
		li.display();
		
	}

}
