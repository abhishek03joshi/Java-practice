package kingdom;

public class Knight extends Human{
	
	String weapon;
	String mount;
	
	public Knight(String name, String gender, String religion, String weapon, String mount) {
		super(name,gender,religion);
		this.weapon=weapon;
		this.mount=mount;		
		
	}
	
	public void voice() {
		 System.out.println("I am the knight");
	 }
	
	 
	 public void walk() {
		 System.out.println("The knight walks");
	 }
	 
	 
	 public void action() {
		 System.out.println("The knight fights using "+weapon+" and rides a "+mount);
	 }
		 
	 
	 public void showKnight() {
		 showHuman();
		 System.out.println("Weapon :"+weapon);
		 System.out.println("mounts :"+mount);
	 }
}
