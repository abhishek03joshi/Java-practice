package CompositeModel1;

public class CompPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpComposite1 CEO = new EmpComposite1("Abhishek Joshi","CEO",1000000);
		EmpComposite1 SalesChief = new EmpComposite1("Franklin Scott","Sales Chief",400000);
		EmpComposite1 MarkChef = new EmpComposite1("Rupert Murdoch","Marketing Chief", 600000);
		EmpComposite1 CTO = new EmpComposite1("Ryan Scottsdale","CTO", 700000);
		EmpComposite1 SalesEx1 = new EmpComposite1("Edward Murphy", "Sales Executive", 200000);
		EmpComposite1 SalesEx2 = new EmpComposite1("Richard Stewart", "Sales Executive", 200000);
		EmpComposite1 BusDev1 = new EmpComposite1("Dale Stafford","BD Executive", 2500000);
		EmpComposite1 BusDev2 = new EmpComposite1("Alison Sheperd","BD Executive", 250000);
		EmpComposite1 BusDev3 = new EmpComposite1("Erica Brand", "BD Executive", 250000);
		EmpComposite1 ChiefAr1 = new EmpComposite1("Anjali Raman","Chief Architect", 2500000);
		EmpComposite1 ChiefAr2 = new EmpComposite1("Molly Dart","Chief Deployment Expert", 250000);
		EmpComposite1 ChiefAr3 = new EmpComposite1("Joshua Michaels", "Customer Product Delivery Expert", 250000);
		
		CEO.add(SalesChief);
		CEO.add(MarkChef);
		CEO.add(CTO);
		SalesChief.add(SalesEx1);
		SalesChief.add(SalesEx2);
		MarkChef.add(BusDev1);
		MarkChef.add(BusDev2);
		MarkChef.add(BusDev3);
		CTO.add(ChiefAr1);
		CTO.add(ChiefAr2);
		CTO.add(ChiefAr3);
		
		System.out.println(CEO);
		
		for(EmpComposite1 HeadEmpComposite : CEO.getSubordinates()) {
			System.out.println(HeadEmpComposite);
			for(EmpComposite1 EmpComposite : HeadEmpComposite.getSubordinates()) {
				System.out.println(EmpComposite);
			}
		}
		
	}

}
