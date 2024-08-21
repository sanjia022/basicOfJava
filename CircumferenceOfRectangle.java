package basicjavaprogram;
/*Assignment 23 Accept input from user and calculate Circumference of Rectangle formula 2*(a+b)*/

import java.util.Scanner;

public class CircumferenceOfRectangle {
	public static void main(String[] args) {
		
		
System.out.println("Please enter lenght of the rectangle");
		
		Scanner scanner = new Scanner (System.in);
		float lenght = scanner.nextFloat();
		
		System.out.println("Please enter base of the rectangle");
		float base = scanner.nextFloat();
		float circumference = 2*(lenght + base);
		
		System.out.println("The circumference of the rectangle is " + circumference);
		
		scanner.close();

		
	}

}
