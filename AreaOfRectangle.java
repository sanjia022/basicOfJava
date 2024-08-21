package basicjavaprogram;

/*Assignment 20 Accept input from user and calculate Area of Rectangle formula (l*b)*/

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
System.out.println("Please enter lenght of the rectangle");
		
		Scanner scanner = new Scanner (System.in);
		float lenght = scanner.nextFloat();
		
		System.out.println("Please enter base of the rectangle");
		float base = scanner.nextFloat();
		float area = (lenght * base);
		
		System.out.println("The area of the rectangle is " + area);
		
		scanner.close();

	}

}
