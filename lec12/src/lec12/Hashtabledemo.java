package lec12;
import java.util.*;

public class Hashtabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(100,"Ravi");
		ht.put(200,"Vijay");
		ht.put(300,"Jay");
		ht.put(400,"Rahul");
		ht.put(500,"abc");
		ht.put(600,"a");
		ht.put(00,"aws");
		ht.put(0,"abc");
		
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" , "+m.getValue());			
		}

	}

}
