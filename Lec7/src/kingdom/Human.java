package kingdom;

abstract public class Human {
	
	String name;
	String gender;
	String religion;
	
	public Human(String name, String gender, String religion) {
		System.out.println("Human constructor");
		this.name=name;
		this.gender=gender;
		this.religion=religion;
	}
	
	abstract public void voice();
	
	abstract public void walk();
	
	public void showHuman() {
		System.out.println("Name :"+name);
		System.out.println("Gender :"+gender);
		System.out.println("Religion :"+religion);
	}
	
	

}
