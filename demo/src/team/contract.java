package team;

public class contract {
	
	private double salary;
	private double bonus;
	private int dur;
	
	
	void setSalary(double salary) {
		this.salary = salary;		
	}
	
	double getSalary() {
		return salary;
	}
	
	
	void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	double getBonus() {
		return bonus;
	}
	
	void setYear(int dur) {
		this.dur = dur;
	}
	
	int getYear() {
		return dur;
	}

}
