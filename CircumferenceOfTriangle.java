package basicjavaprogram;
/*Assignment 22 Accept input from user and calculate Circumference of Triangle formula a+b+c*/

import java.util.Scanner;

public class CircumferenceOfTriangle {
	public static void main(String[] args) {
		
System.out.println("Please enter side1 of the triangle");
		
		Scanner scanner = new Scanner (System.in);
		float side1 = scanner.nextFloat();
		
System.out.println("Please enter side2 of the triangle");
		
		
		float side2 = scanner.nextFloat();
		
System.out.println("Please enter side3 of the triangle");
	
		float side3 = scanner.nextFloat();
		
		float circumference = (side1 + side2 + side3);
		
		System.out.println("The circumference of the triangle is " + circumference);
		
		scanner.close();

		
	}

}
