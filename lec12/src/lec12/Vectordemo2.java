package lec12;

import java.util.Vector;

public class Vectordemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vc1= new Vector<String>();
		vc1.add("Abhishek");
		vc1.add("Joshi");
		vc1.add("is");
		vc1.add("the");
		vc1.add("Greatest");
		vc1.add("!");
		
		for(int i=0;i<vc1.size();i++) {
			System.out.println("The element in ["+i+"] position is "+vc1.get(i));
		}
		System.out.println(vc1);

	}

}
