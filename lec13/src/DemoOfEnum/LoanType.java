package DemoOfEnum;


public enum LoanType {
	
	Auto(10.35f),Home(8.35f),Personal(10.5f),Business(9.5f); // these are just called elements. There is no day type
	
	private float Rate;
	
	float getRate() {
		return Rate;
	}
	
	LoanType(float Rate) {
		this.Rate=Rate;
	}
	
	
}
