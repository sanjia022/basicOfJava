package basicjavaprogram;
/*Assignment 24 Accept input from user and calculate area of trapezium(formula -> 1/2*(a+b)*h*/

import java.util.Scanner;

public class AreaOfTrapezium {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter side1  of the trapezium");
		float a = scanner.nextFloat();
		
		System.out.println("Please enter side2  of the trapezium");
		float b = scanner.nextFloat();
		
		System.out.println("Please enter height  of the trapezium");
		float h = scanner.nextFloat();
		
		float area = 1/2 *(a+b)*h;
		
		
		
		System.out.println("The area of the trepezium is " + area);
		
		scanner.close();


	}

}
