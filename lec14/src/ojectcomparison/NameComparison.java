package ojectcomparison;
import java.util.*;

public class NameComparison implements Comparator<Object>{
	
	public int compare(Object obj1, Object obj2) {
		Student s1= (Student) obj1;
		Student s2= (Student) obj2;
		
		return s1.strName.compareTo(s2.strName);//compareTo used to compare using ASCII value
	}
	
	

}
