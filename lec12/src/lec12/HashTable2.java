package lec12;
import java.util.*;

public class HashTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, Float> ht = new Hashtable<Integer, Float>();
		
		ht.put(0, 0.0f);
		ht.put(1, 1.1f);
		ht.put(2, 2.2f);
		ht.put(3, 3.3f);
		ht.put(4, 4.4f);
		
		for(Map.Entry<Integer, Float> en:ht.entrySet()) {
			System.out.println(en.getKey()+" , "+en.getValue());
			
		}
		System.out.println(ht);
		

	}

}
