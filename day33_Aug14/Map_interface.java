package day33_Aug14;

import java.util.HashMap;
import java.util.Map;

public class Map_interface {

	public static void main(String[] args) {
	Map<String,String> a1 	= new HashMap<String,String>();//upcasting
	a1.put("Student1", "David");
	a1.put("Student2", "Divya");
	a1.put("Student3", "Fayyaz");
	a1.put("Student4", "Zaina");
	a1.put("Student5", "Manish");
	
	System.out.println(a1);
	Map<String,Integer> a2 	= new HashMap<String,Integer>();
	
	a2.put("Rice", 50);// take object key and object value
	a2.put("Oil", 15);
	a2.put("Suger", 40);
	a2.put("Cookie", 5);
	a2.put("Salt", 50);
	System.out.println(a2);
	a1.clear();
	System.out.println(a1);
	boolean a3 = a1.isEmpty();
	System.out.println(a3);
	boolean a4 = a1.containsKey("rice");
	System.out.println(a4);
	boolean a5 = a1.containsValue("rice");
	System.out.println(a4);
	a1.put("Student6", "Anusha");
	//a1.putAll(a2);
	}

}
