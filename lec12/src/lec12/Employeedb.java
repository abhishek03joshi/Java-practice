package lec12;
import java.util.HashMap;
import java.util.Map;

public class Employeedb {
	public void employeeMap() {
		Map<Integer, Employee> Employees = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee(1,"Mark","Admin","9000");
		Employee e2 = new Employee(2,"John","HR","6000");
		Employee e3 = new Employee(3,"Wills","Sales","7000");
		Employee e4 = new Employee(4,"Patrick","XYZ","9000");
		
		Employees.put(e1.id, e1);
		Employees.put(e2.id, e2);
		Employees.put(e3.id, e3);
		Employees.put(e4.id, e4);
		
		Employee obj = new Employee();
		
		System.out.println("\nEmployee listing is \n");
		
		for(Map.Entry<Integer, Employee> entry:Employees.entrySet()) {
			obj=(entry.getValue());//extracting the object that is stored as a value
			System.out.println();
			System.out.println("Id : "+obj.id);
			System.out.println("Name :"+obj.Name);
			System.out.println("Department :"+obj.Department);
			System.out.println("Salary :"+obj.Salary);
			System.out.println();
		}
		
	}

}
