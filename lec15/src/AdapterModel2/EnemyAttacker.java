//Client interface. The is the adapters job the make the new class compatible with this one. 

package AdapterModel2;

public interface EnemyAttacker {

	public void fireWeapon();
	
	public void driveForward();
	
	public void assignDriver(String DriverName);
}
