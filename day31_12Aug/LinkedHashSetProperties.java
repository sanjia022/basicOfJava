package day31_12Aug;

import java.util.LinkedHashSet;

public class LinkedHashSetProperties {

	public static void main(String[] args) {
		LinkedHashSet c1 = new LinkedHashSet();
		c1.add(23);
		c1.add(23);
		c1.add(23);
		c1.add(23);
		c1.add("Dave");
		c1.add("Smith");
		c1.add("Smith");
		c1.add(null);
		c1.add(null);
		c1.add(null);
		c1.add(null);
		System.out.println(c1);

	}

}
