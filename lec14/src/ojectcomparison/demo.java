package ojectcomparison;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flag;
		AgeComparator ac = new AgeComparator();
		Student s1 = new Student(10,"Allan",32,5,'B');
		Student s2 = new Student(11,"John",33,4,'C');
		flag=ac.compare(s1, s2);
		
		System.out.println("Flag is : "+flag);
		
		NameComparison nc = new NameComparison();
				
		flag=nc.compare(s1, s2);
		if(flag==0) {
			System.out.println("Names are equal");
		}
		else if(flag==1) {
			System.out.println("S1 name is bigger than S2 name");
		}
		else {
			System.out.println("S2 name is bigger than S1 name");
		}
		
		RollNumCom rnc = new RollNumCom();
		
		flag=rnc.compare(s1, s2);
		if(flag == 1) {
			System.out.println("S1 is greater than S2");
		}
		else {
			System.out.println("S2 is greater than S1");
		}
		
		StdComparator sd = new StdComparator();
		flag=sd.compare(s1, s2);
		System.out.println("Flag is "+flag);
		if(flag == 0) {
			System.out.println("S1 is equal to S2");
		}
		else if (flag == 1) {
			System.out.println("S1 is greater than S2");
		}
		else {
			System.out.println("S1 is less than S2");
		}
		
		
		DivComparator dc = new DivComparator();
		flag=dc.compare(s1, s2);
		
		if(flag == 0) {
			System.out.println("S1 is equal to S2");
		}
		else if (flag == 1) {
			System.out.println("S1 is greater than S2");
		}
		else {
			System.out.println("S1 is less than S2");
		}
		
	}

}
