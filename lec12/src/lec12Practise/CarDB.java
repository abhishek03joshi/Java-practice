package lec12Practise;
import java.util.Hashtable;
import java.util.Map;

public class CarDB {
	
	public void CarMap() {
	Car c1 = new Car(100,"Toyota","Camry","Jet Black",22000);
	Car c2 = new Car(200,"Honda","Accord","Black",20000);
	Car c3 = new Car(300,"Merecedes-Benz","C-Class","Grey",50000);
	Car c4 = new Car(400,"BMW","3 Series","Blue",45000);
	
	Hashtable<Integer, Car> ht = new Hashtable<Integer, Car>();
	ht.put(c1.modelNum, c1);
	ht.put(c2.modelNum, c2);
	ht.put(c3.modelNum, c3);
	ht.put(c4.modelNum, c4);
	
	Car c = new Car();
	
	for(Map.Entry<Integer, Car> en:ht.entrySet()) {
		
		c=en.getValue();
		System.out.println("Model number is : "+c.modelNum);
		System.out.println("Company name is : "+c.manu);
		System.out.println("Model number is : "+c.model);
		System.out.println("Car color is : "+c.color);
		System.out.println("Car price is : "+c.price);
		System.out.println();
		
	}
	
}

}
