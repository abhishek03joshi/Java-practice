package ArrList;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Random;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List arraylistA = new ArrayList();
		List arraylistB = new ArrayList();
		
		for(int i=0;i<5;i++) {
			arraylistA.add(new Integer(i));//adding elements to arraylistA object
		}
		//adding elements to arraylistB object
		arraylistB.add("Beginner");
		arraylistB.add("java");
		arraylistB.add("Tutorial");
		arraylistB.add(".");
		arraylistB.add("com");
		arraylistB.add("java");
		arraylistB.add("Site");
		
		System.out.println("Using Iterator to retrieve ArrayList elements");
		System.out.println();
		Iterator i1 = arraylistA.iterator();
		System.out.println("Arraylist arraylist------------------------------------>");
		while(i1.hasNext()) {
			System.out.println(i1.next()+",");
		}
		System.out.println();
		System.out.println("ArrayListA arraylistA ---------------------------------->");
		for(int j=0;j<arraylistA.size();j++) {
			System.out.println(arraylistA.get(j)+",");
		}
		Iterator i2 = arraylistB.iterator();
		System.out.println("ArrayList arraylistB------------------------------------->");
		while(i2.hasNext()) {
			System.out.println(i2.next()+",");
		}
		System.out.println("");
		System.out.println();
		System.out.println("Using ListIterators to retrieve ArrayLIst elements");
		System.out.println();
		ListIterator li1 = arraylistA.listIterator();
		System.out.println("ArraylistA------------------------------------------------->");
		while(li1.hasNext()) {
			System.out.println(li1.next()+",");
		}
		System.out.println();		
		
		
		int index = arraylistB.indexOf("java");
		System.out.println("java is found at index"+index);
		int lastindex = arraylistB.lastIndexOf("java");
		System.out.println("java found at index: "+lastindex+" from last");
		System.out.println();
		
		List subList = arraylistA.subList(3, arraylistA.size());
		System.out.println("New sublist(arraylistA) from index 3 to "+arraylistA.size()+" : "+subList);
		System.out.println();
		
		System.out.println("Sorted arraylistA -------------------------------------------->");
		Collections.sort(arraylistA);
		System.out.println(arraylistA);
		System.out.println();
		
		
		System.out.println("Reverse arraylistA -------------------------------------------->");
		Collections.reverse(arraylistA);
		System.out.println(arraylistA);
		System.out.println();
		
		System.out.println("Check emptyness of arraylist");
		System.out.println("Is arraylistA is empty?"+arraylistA.isEmpty());
		System.out.println();
		
		System.out.println("Check quality of arraylist");
		ArrayList arraylistC = new ArrayList(arraylistA);//copying one arraylist to another arraylist
		System.out.println("arraylistA.equal(arraylistC)?"+arraylistA.equals(arraylistC));
		System.out.println();
		
		System.out.println("Shuffling");
		Collections.shuffle(arraylistA, new Random());
		System.out.println("Arraylist after shuffling its elements");
		i1 = arraylistA.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next()+",");
		}
		
		
		System.out.println("Convert arraylist to array");
		
		Object[] array = arraylistA.toArray();//size is defined automatically for the array.
		for(int i=0;i<array.length;i++) {
			System.out.println("Array Elements["+i+"] = "+array[i]);
		}
		System.out.println();
		System.out.println("Clearing Arraylist");
		arraylistA.clear();
		System.out.println("arraylistA after clearing :"+arraylistA);// since empty, the null elements are in square bracket and we don't need loop to print.
		System.out.println();

	}

}
