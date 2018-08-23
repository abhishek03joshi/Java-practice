package lec12;
import java.util.*;

public class HashMap2 {

	public static void main(String [] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Abhishek");
		hm.put(2, "Nitin");
		hm.put(3, "Pradnya");
		hm.put(5, "Pushpa");
		hm.put(4, "Arun");
		
		for(Map.Entry<Integer, String> en:hm.entrySet()) {
			System.out.println(en.getKey()+" , "+en.getValue());
		}
		System.out.println(hm);
	}
}
