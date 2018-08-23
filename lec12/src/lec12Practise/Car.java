package lec12Practise;

public class Car {
	int modelNum;
	String manu;
	String model;
	String color;
	double price;
	
	public Car(int modelNum, String manu,String model,String color,	double price) {
		this.modelNum=modelNum;
		this.manu=manu;
		this.model=model;
		this.color=color;
		this.price=price;
	}
	
	
	public Car() {
		this.model=null;
		this.manu=null;   
		this.model=null; 
		this.color=null; 
		this.price=0; 
	}
	
}
