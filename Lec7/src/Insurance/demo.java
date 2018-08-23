package Insurance;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutoInsurance ai1 = new AutoInsurance(150, "Abhishek Joshi", "Mercedes Benz C class", 5);
		AutoInsurance ai2 = new AutoInsurance(175, "Van-Anh Truong", "Porsche Carrera GT", 5);
		ai1.apply(150, "Abhishek Joshi");
		ai1.coverage();
		ai1.display();
		
		ai2.apply(175, "Van-Anh Truong");
		ai2.coverage();
		ai2.display();
		
		
		HealthInsurance hi1 = new HealthInsurance(200, "Pradnya Joshi", 1, "Full",5);
		HealthInsurance hi2 = new HealthInsurance(200, "Nitin Joshi", 1, "Full",5);
		HealthInsurance hi3 = new HealthInsurance(200, "Abhishek Joshi", 1, "Partial",5);
		
		hi1.apply(200, "Pradnya Joshi");
		hi1.coverage();
		hi1.display();
		
		hi2.apply(200, "Nitin Joshi");
		hi2.coverage();
		hi2.display();
		
		hi3.apply(200, "Abhishek Joshi");
		hi3.coverage();
		hi3.display();

	}

}
