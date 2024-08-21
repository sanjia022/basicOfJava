package basicjavaprogram;

import java.util.Scanner;

/*Assignment 18 Accept number from user and Write a program to check Number is even or odd by using if else statement 
  */


public class OddEvenChecker {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number");
		
		Scanner scanner = new Scanner (System.in);
		double number = scanner.nextDouble();
		
		
		if(number %2 ==0) {
			System.out.println("It is an even number");
		}
		else {
			System.out.println("It is odd number");
		}
		
		
		
		scanner.close();
		
		

	}

}
