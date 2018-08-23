package team;
import java.util.Scanner;

public class player {
	
	Scanner sc = new Scanner(System.in);
	
	private String fullName;
	private String height;
	private String weight;
	private int age;
	private String position;
	
	void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	String getFullName() {
		return fullName;
	}
	
	
	void setHeight(String height) {
		this.height = height;
	}

	String getHeight() {
		return height;
	}
	
	void setWeight(String weight) {
		this.weight=weight;		
	}
	
	String getWeight() {
		return weight;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
	
	void setPos(String position) {
		this.position = position;
	}
	
	String getPos() {
		return position;
	}
	
	public void showBio(player obj) {
		
		System.out.println("The full name is :"+obj.getFullName());
		System.out.println("The height is :"+obj.getHeight());
		System.out.println("The weight is :"+obj.getWeight());		;
		System.out.println("The age is :"+obj.getAge());
		System.out.println("The position is :"+obj.getPos());
		System.out.println();
	}
	
	public void showContract(contract obj) {
		System.out.println("Annual Contract amount is :"+obj.getSalary());
		System.out.println("Bonus amount is :"+obj.getBonus());
		System.out.println("The time "+obj.getYear());
	}
	
	public void setBio(player obj) {
		
		System.out.print("Enter the full name of player without space :");
		obj.setFullName(sc.next());
		System.out.print("Enter the height of the player :");
		obj.setHeight(sc.next());
		System.out.print("Enter the weight of the player :");
		obj.setWeight(sc.next());		
		System.out.print("Enter the position of the player :");
		obj.setPos(sc.next());
		System.out.print("Enter the age of the player :");
		obj.setAge(sc.nextInt());
	}
	
	public void setFinance(contract obj) {
		System.out.print("Please enter annual contract amount :");
		obj.setSalary(sc.nextDouble());
		System.out.println("Please enter bonus amount if any :");
		obj.setBonus(sc.nextDouble());
		System.out.println("Please enter time of contract in years :");
		obj.setYear(sc.nextInt());		
		
	}
	
	
}
