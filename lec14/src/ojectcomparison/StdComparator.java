package ojectcomparison;
import java.util.*;

public class StdComparator implements Comparator<Object>{
	
	public int compare(Object obj1, Object obj2) {
		
		Student s1 = (Student) obj1;
		Student s2 = (Student) obj2;
		
		if(s1.Std == s2.Std) {
			return 0;
		}
		else if (s1.Std > s2.Std) {
			return 1;
		}
		else {
			return -1;
		}		
		
	}

}
