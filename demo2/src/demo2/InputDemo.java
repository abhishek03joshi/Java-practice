package demo2;
//import java.util.Scanner;//use only the classes needed for import

public class InputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		Person per = new Person();
		String namek;
		int agek;
		float salaryk;
		
		System.out.print("Please enter the name : ");
		namek = sc.next();
		per.setName(namek);
		
		System.out.print("Please enter the age :");
		agek=sc.nextInt();
		per.setAge(agek);
		
		System.out.print("Please enter the salary :");
		salaryk = sc.nextFloat();
		per.setSalary(salaryk);
		
		System.out.println("Name : "+per.getName());
		System.out.println("Age : "+per.getAge());
		System.out.println("Salary : "+per.getSalary());
		
		sc.close();*/
		
		//Reduce the number of lines in this method for optimum performance
		//objects and methodsare created to reduce the number of lines and to be reused again and again. That is the benefit of using object oriented programming. 
		/*Student stu = new Student();
		
		stu.input();
		stu.output();*/
		
		Teacher t = new Teacher();
		
		t.input();
		t.display();
		
		
	}
	
	
}
