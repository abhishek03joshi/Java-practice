package lec12;
import java.util.*;

public class Hash_Map {
	public static void main (String args[]) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		
		hm.put(100, "Manish");
		hm.put(200, "Atit");
		hm.put(200, "Hhajf");
		hm.put(300, "Jack");
		hm.put(500, "Martin");
		hm.put(null, null);
		hm.put(null,"1");
		hm1.put(700, "Manoj");
		hm1.put(800, "Mitu");
		hm1.put(800, "M");
		hm1.put(null,null);
		hm1.put(null,"2");
		//hm.remove(null);
		hm.putAll(hm1);
		for(Map.Entry<Integer,String> m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());//Order is not maintained in a Hashmap and the value is always accessed using only a key
		}
		System.out.println(hm);
		System.out.println(hm1);
		
		
	}

}
