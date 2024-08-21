package basicjavaprogram;

/*Assignment 21 Accept input from user and calculate Circumference of circle formula  2*pi*r*/

import java.util.Scanner;

public class CircumferenceOfCircle {
	final static float pi = 3.14f; 
	public static void main(String[] args) {
		System.out.println("Please enter radius of the circle");
		
		Scanner scanner = new Scanner (System.in);
		int radius = scanner.nextInt();
		
		
		float circumference = (2*pi*radius);
		
		System.out.println("The circumference of the circle is " + circumference);
		
		scanner.close();
	}
	
	



	
	

}
