package ojectcomparison;
import java.util.*;

//every class that implements comparator should have a concrete comparator method.
public class RollNumCom implements Comparator<Object>{
	
	public int compare(Object obj1, Object obj2) {
		Student s1 = (Student) obj1;
		Student s2 = (Student) obj2;
		
		if (s1.iRollNO > s2.iRollNO) {
			
			return 1;
		}
		else {
			return -1;
		}
		
	}

}
