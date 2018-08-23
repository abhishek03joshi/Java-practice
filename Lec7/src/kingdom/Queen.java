package kingdom;

public class Queen extends Human {
	
	String title;
	String house;
	
	public Queen(String name, String gender, String religion, String title, String house) {		
		super(name,gender,religion);
		this.title=title;
		this.house=house;		
	}
	
	 public void voice() {
		 System.out.println("I am the queen");
	 }
	
	 
	 public void walk() {
		 System.out.println("The queen walks");
	 }
	 
	 public void showQueen() {
		 showHuman();
		 System.out.println("Title :"+title);
		 System.out.println("House :"+house);
	 }

}
