package Inter;

public class Car implements iCar{
	
	int engine;
	int gear;
	int brake;
	int turn;
	
	public Car() {
		engine=0;
		gear=0;
		brake=1;
		turn=0;
	}
	
	public void start() {
		engine=1;
		brake=0;
	}
	public void stop() {
		engine=0;
		brake=1;
	}
	public void gearUp() {
		gear++;
	}
	public void gearDown() {
		gear--;
	}
	public void brake() {
		brake=1;
	}
	public void leftTurn() {
		turn = -1;
	}
	public void rightTurn() {
		turn = 1;
	}
	
	public void display() {
		
		if(engine ==0) {
			System.out.println("Car is OFF");
		}
		else if (engine ==1 && gear !=0){
			System.out.println("Car is running");
		}
		else if (engine ==1 && gear ==0) {
			System.out.println("Car just started");
			
		}
		else if (engine ==1 && gear !=0 && turn !=0) {
			System.out.println("Car is turning");
		}
		else if (engine ==1 && gear !=0 && turn ==0) {
			System.out.println("Car is not turning");
		}
		else{
			System.out.println("no defined state");
		}
	}

}
