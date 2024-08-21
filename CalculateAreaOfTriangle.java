package basicjavaprogram;

import java.util.Scanner;

/*Assignment 19 Accept input from user and calculate Area of Triangle(formula - (b*h)/2)
 */

public class CalculateAreaOfTriangle {

	public static void main(String[] args) {
        System.out.println("Please enter height of the triangle");
		
		Scanner scanner = new Scanner (System.in);
		float height = scanner.nextFloat();
		
		System.out.println("Please enter base of the triangle");
		float base = scanner.nextFloat();
		float area = (base*height)/2;
		System.out.println("The area of the triangle is " + area);
		
		scanner.close();

	}

}
