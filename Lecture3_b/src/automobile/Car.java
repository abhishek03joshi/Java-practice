package automobile;

public class Car {
	String make;
	String model;
	String year;
	String type;
	
	//default constructor
	public Car() {
		System.out.println("Default constructor");
		make = "Toyota";
		model = "Camry";
		year = "2008";
		type = "Manual";
	}
	
	public Car(String make, String model, String year, String type) {
		System.out.println("4 parameter constructor");
		this.make = make;
		this.model = model;
		this.year = year;
		this.type = type;
	}

	public Car(String make, String model, String year) {
		System.out.println("3 parameter constructor");
		this.make = make;
		this.model = model;
		this.year = year;
		this.type = "auto";
		
	}
	
	public Car(Car c) {
		System.out.println("Obj constructor");
		this.make = c.make;
		this.model = c.model;
		this.year = c.year;
		this.type = c.type;
	}
	
	public void show() {
		System.out.println("Make "+make);
		System.out.println("Model "+model);
		System.out.println("Year "+year);
		System.out.println("Type "+type);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		Car car1 = new Car("Chevy","Impala","2015","auto");
		Car car2 = new Car("VW","Passat","2013");
		Car car3 = new Car(car2);
		Car car4 = car2;
		
		/*System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.type);*/
		
		car3.show();		
		car.show();
		car1.show();
		car2.show();
		car4.show();
		
		
		

	}

}
