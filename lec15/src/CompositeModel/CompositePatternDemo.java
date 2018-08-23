package CompositeModel;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpComposite CEO = new EmpComposite("John","CEO",30000);
		EmpComposite HeadSales = new EmpComposite("Robert","HeadSales",20000);
		EmpComposite HeadMarketing = new EmpComposite("Micheal","Head Marketing",20000);
		EmpComposite clerk1 = new EmpComposite("Laura","Marketing",10000);
		EmpComposite clerk2 = new EmpComposite("Bob","Marketing",10000);
		EmpComposite salesExecutive1 = new EmpComposite("Richard","Sales",10000);
		EmpComposite salesExecutive2 = new EmpComposite("Robert","Sales",10000);
		
		CEO.add(HeadSales);
		CEO.add(HeadMarketing);
		HeadSales.add(salesExecutive1);
		HeadSales.add(salesExecutive2);
		HeadMarketing.add(clerk1);
		HeadMarketing.add(clerk2);
		
		//print all the composites of the organization
		
		System.out.println(CEO);
		
		for(EmpComposite HeadEmpComposite : CEO.getSubordinates()) {
			System.out.println(HeadEmpComposite);
			for(EmpComposite EmpComposite : HeadEmpComposite.getSubordinates()) {
				System.out.println(EmpComposite);
			}
			
		}

	}

}
