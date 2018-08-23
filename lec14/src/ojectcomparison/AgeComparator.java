package ojectcomparison;
import java.util.*;

public class AgeComparator implements Comparator<Object>{

	//Object is a raw type of object
	public int compare( Object obj1, Object obj2) {
		Student s1= (Student) obj1;
		Student s2= (Student) obj2;
		
		if(s1.iAge==s2.iAge) {
			return 0;
		}
		else if(s1.iAge>s2.iAge) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
}
