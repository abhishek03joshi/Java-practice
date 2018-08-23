//This is an adaptee. This adaptee sends method calls, to objects that use the EnemyAttacker interface, to the right methods defined
//in enemy robot.

package AdapterModel2;
import java.util.Random;

public class EnemyRobot {

	Random gen = new Random();
	
	public void smashWithHands() {
		int attackdamage = gen.nextInt(10)+1;
		System.out.println("Enemy robot causes"+attackdamage+" damage with its hands");
	}
	
	public void walkForward() {
		int movement = gen.nextInt(5)+1;
		
		System.out.println("Enemy robot walks forward "+movement+" feet");
	}
	
	public void reactToHuman(String driverName) {
		System.out.println("Robot tramps on "+driverName);
	}
	
}
