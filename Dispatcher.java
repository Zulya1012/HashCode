package hash;
import java.util.*;
public class Dispatcher {
	public static void main(String[] args) {
		Car c1 = new Car(5000, "Opel");
		Car c2 = new Car(7000, "Audi");
		Car c3 = new Car(9000, "BMW");
		HashMap<Car, String> hm = new HashMap();
		hm.put(c1,"Nick");
		hm.put(c2, "Mary");
		hm.put(c3,"Katy");
		Car find = new Car(0, "Audi");
		System.out.println(hm.get(find));
	}

}

class Car{
	int price;
	String model;
	Car(int price, String model){
		this.price = price;
		this.model = model;
	}
	public int hashCode() {
		return this.model.length() * 17;
	}
	public boolean equals(Object o) {
		return this.model.equals(((Car)o).model);
		
	}
}