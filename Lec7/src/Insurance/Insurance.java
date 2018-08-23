package Insurance;

public abstract class Insurance {
	
	float amount;
	
	abstract public void coverage();
	
	public void apply(float amount, String name) {
		System.out.println("Insurance is calculated and applied");
	}

}
