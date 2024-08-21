package day31_12Aug;

import java.util.LinkedList;
import java.util.Stack;

public class Stack_class_properties {

	public static void main(String[] args) {
		Stack c1 = new Stack();
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
		c1.pop();// remove last object
		
		System.out.println(c1);
		System.out.println(c1.peek());//fetch the last object without removing it
		c1.push(45);
		System.out.println(c1);

	}

}
