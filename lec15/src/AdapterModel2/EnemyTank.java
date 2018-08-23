//EnemyTank implements the EnemyAttacker perfectly. Our job is to make classes with different methods from EnemyAttacker.java 
//interface compatible with it.
package AdapterModel2;
import java.util.Random;


public class EnemyTank implements EnemyAttacker{
	
	Random rnd = new Random();
	
	public void fireWeapon() {
		int attackDamage = rnd.nextInt(10)+1;
		
		System.out.println("Enemy tank does "+attackDamage+" damage");
	}
	
	public void driveForward() {
		int movement = rnd.nextInt(5)+1;
		
		System.out.println("Enemy tank moves "+movement+" spaces");
	}
	
	public void assignDriver(String driverName) {
		System.out.println(driverName+" is driving the tank");
	}

}
