package basicjavaprogram;
/*Assignment 17 Accept number from user and calculate Area of circle (formula πr square, PI=3.14f) */

import java.util.Scanner;

public class Assignment17 {
	final static float pi  = 3.14f;

	public static void main(String[] args) {
		
		
System.out.println("Please enter radius of the circle");
		
		Scanner scanner = new Scanner (System.in);
		int radius = scanner.nextInt();
		float area = pi * radius*radius;
		
		System.out.println("The area of the circle is " + area);
		
		scanner.close();
		

	}

}
