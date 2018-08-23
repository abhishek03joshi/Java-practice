package kingdom;

public class King extends Human {
	
	String title;
	String house;
	
	public King(String name, String gender, String religion, String title, String house) {		
		super(name,gender,religion);
		this.title=title;
		this.house=house;		
	}
	
	 public void voice() {
		 System.out.println("I am the king");
	 }
	
	 
	 public void walk() {
		 System.out.println("The king walks");
	 }
	 
	 public void showKing() {
		 showHuman();
		 System.out.println("Title :"+title);
		 System.out.println("House :"+house);
	 }
	
	

}
