package Integration;

public class Demo {

	public static void main(String[] args) {
		
		Address a = new Address();
		Employee e = new Employee();
		Salary s= new Salary();
		
		e.input(a);//Integration of class employee with the class address by passing the object of address as a param in the method of employees
		e.inputSal(s);//Integration of class employee with the class address by passing the object of Salary as a param in the method of employees
		e.output(a);
		e.salOutput(s);

	}

}
