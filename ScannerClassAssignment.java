package basicjavaprogram;

import java.util.Scanner;

/*Assignment 16 Accept two numbers from user and perform all the Arithmetic operations(+, *, /, %) */

public class ScannerClassAssignment {
	
	public static void add(int a, int b) {
		System.out.println();
	}
	public static void main(String[] args) {
		
		System.out.println("Please enter the first number");
		
		Scanner scanner = new Scanner (System.in);
		int number1 = scanner.nextInt();
		System.out.println("Please enter the second number");
		int number2 = scanner.nextInt();
		int addition = number1 + number2;
		int multiply = number1 * number2;
		int division = number1 / number2;
		int modulus = number2 % number2;
		System.out.println("The addition of the two number is " + addition );
		System.out.println("The multiplication of the two number is " + multiply );
		System.out.println("The division of the two number is " + division );
		System.out.println("The modulus of the two number is " + modulus );
		scanner.close();
		
	}

}
