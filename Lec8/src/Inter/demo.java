package Inter;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*iTV objTV = new TV(); //Create object of type TV to pass it to an object of its Interface iTV. The reference is stored in interface. 
		
		objTV.off();
		objTV.on();
		objTV.volumeUp();
		objTV.volumeUp();
		objTV.volumeUp();
		objTV.channelUp();
		
		TV obj = (TV) objTV;//Type casting the object to the type of TV class to access the method display.
		
		obj.display();*/
		
		iCar c= new Car();
		
		c.start();
		c.gearUp();
		c.gearUp();
		c.leftTurn();
		
		Car objc = (Car) c;
		
		objc.display();
		
		

	}

}
