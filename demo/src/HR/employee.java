
package HR;
import Sales.Customer;


public class employee {

	int id;
	String fName;
	String lName;
	String dept;
	String grade;
	Float salary;
	
	public Salary sal;
	
	public Performance per;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee obj = new employee();
		obj.id = 100; //assignment
		obj.fName = "Bob";
		obj.lName = "Smith";
		obj.dept = "Physics";
		obj.grade = "A";
		obj.salary = 10000.00f;
		
		//obj.show();//display all the values of the instance variables
		
		Customer cstm = new Customer();
		cstm.id = 500;
		cstm.fName = "jake";
		cstm.lName = "roberts";
		cstm.type = "Retail";
		cstm.contact = "9879456675";
		
		
		cstm.show();
		
		obj.putData();
		obj.show();
		
				
	}
	
	//Non-static method.
	public void putData() {
		
		sal = new Salary();
		//Beans contains getters and setter methods to manipulate data
		sal.setBasic(10000f);
		sal.setHra(5000f);
		sal.setLta(5000f);
		sal.setBonus(600f);
		
		per = new Performance();
		
		per.setAttendenceRating(3);
		per.setDeliveryRating(4);
		per.setYear(2018);
			
		
		
	}

	public void show() {
		System.out.println("Employee details :");
		System.out.println("ID "+id);
		System.out.println("fName "+fName);
		System.out.println("lName "+lName);
		System.out.println("dept "+dept);
		System.out.println("grade "+grade);
		System.out.println("salary "+salary);		
	
		System.out.println(sal.getBasic());
		System.out.println(sal.getHra());
		System.out.println(sal.getLta());
		System.out.println(sal.getBonus());
		
		
		System.out.println("Delivery rating "+per.getDeliveryRating());
		System.out.println("Attendence Rating "+per.getAttendenceRating());
		System.out.println("Year "+per.getYear());
	}
	
	
}
