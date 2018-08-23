package AdapterModel2;

public class testenemyattackers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnemyTank tank = new EnemyTank();
		
		EnemyRobot robotA = new EnemyRobot();
		
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(robotA);
		
		System.out.println("RobotA");
		
		robotA.reactToHuman("Paul");
		robotA.smashWithHands();
		robotA.walkForward();
		
		System.out.println();
		
		System.out.println("Enemy Tank");
		tank.assignDriver("Abhishek");
		tank.driveForward();
		tank.fireWeapon();
		
		System.out.println("The robot with adapter");
		robotAdapter.driveForward();
		robotAdapter.assignDriver("Joshi");
		robotAdapter.fireWeapon();
		
		

	}

}
