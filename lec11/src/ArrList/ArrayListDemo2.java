package ArrList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListDemo2 {
	
	public static void main(String [] args) {
		List arlisA = new ArrayList();
		List arlisB = new ArrayList();
		
		for (int i=0; i<5; i++) {
			arlisA.add(new Integer(i));
		}
		
		arlisB.add("Pradnya");
		arlisB.add("Nitin");
		arlisB.add("Abhishek");
		arlisB.add("Arun");
		arlisB.add("Pushpa");
		
		//Using iterators to retrieve array elements
		System.out.println("Using Iterator to retrieve ArrayList elements");
		System.out.println();
		Iterator i1 = arlisA.iterator();
		System.out.println("Arraylist arraylistA using iterators------------------------------------>");
		while (i1.hasNext()) {
			System.out.print(i1.next()+" , ");
		}
		//Using for loop to retrieve array A elements
		System.out.println();
		System.out.println("ArrayListA arraylistA using for loop---------------------------------->");
		
		for (int j=0;j<arlisA.size();j++) {
			System.out.print(arlisA.get(j)+" , ");
		}
		//Using iterators to retrieve array elements
		System.out.println();
		i1 = arlisB.iterator();
		System.out.println("Arraylist arraylistB using iterators------------------------------------>");
		while(i1.hasNext()) {
			System.out.print(i1.next()+" , ");
		}
		
		//using for loop to retrieve arraylist elements
		System.out.println();
		System.out.println("Arraylist arraylistB using for loops------------------------------------>");
		for (int k=0; k<arlisB.size(); k++) {
			System.out.print(arlisB.get(k) + " , ");
		}
		//using list iterator to retrieve arraylist elements
		System.out.println();
		System.out.println("ArrayListA using listiterators.........................................>");
		ListIterator li1 = arlisA.listIterator();
		while(li1.hasNext()) {
			System.out.print(li1.next()+ " , ");
		}
		//using listIterators for arraylistB
		li1=arlisB.listIterator();
		System.out.println();
		System.out.println("ArrayListB using listiterators.........................................>");
		while(li1.hasNext()) {
			System.out.print(li1.next()+" , ");
		}
		System.out.println();
		//Find index of elements. 
		int index = arlisB.indexOf("Abhishek");
		System.out.println("\"Abhishek\" is found at"+index);
		int index1 = arlisB.lastIndexOf("Abhishek");
		System.out.println("\"Abhishek\" is found at the index : "+index1+" from the end");
		System.out.println();
		
		//extract a sublist from a list.
		List arlisSub = arlisA.subList(3, arlisA.size());
		System.out.println("New sublist(arlisA) from index 3 to "+arlisA.size()+" : "+arlisSub);
		System.out.println();
		
		//sorted arraylistA
		System.out.println("Sorted arlisA..............................................................>");
		Collections.sort(arlisA);
		System.out.println(arlisA);
		
		//reverse arraylistB
		System.out.println("Reversed arlisB.........................................................>");
		Collections.reverse(arlisB);
		System.out.println(arlisB);
		
		//Copying one arraylist to another. 
		
		List arlisC = new ArrayList(arlisA);
		System.out.println("Is arlisC.equals(arlisA) ?"+arlisC.equals(arlisA));
		System.out.println();
		
		//List shuffling
		System.out.println("ArlisC before shuffling");
		Collections.shuffle(arlisC, new Random());
		System.out.println("ArlisC after shuffling");
		li1=arlisC.listIterator();
		while(li1.hasNext()) {
			System.out.print(li1.next()+" , ");
		}
		System.out.println(arlisC);
		
		System.out.println();
		System.out.println();
		//Convert a list to an array 
		
		Object[] arr = arlisC.toArray();//size of an array is defined automatically
		for (int i = 0; i<arr.length; i++) {
			System.out.println("Array element ["+i+"] is "+ arr[i]);
		}
		System.out.println();
		System.out.println("Clearing Arraylist");
		arlisA.clear();
		System.out.println("arlisA after clearing :"+arlisA);
		System.out.println();
	}
}
