package basicjavaprogram;

import java.util.Scanner;

public class Calling_Static_Method1 {
	
	public static void addition() {
		System.out.println("Please enter the first number?");
		Scanner scanner = new Scanner(System.in);
		int first_number = scanner.nextInt();
		
		System.out.println("Please enter the second number?");
		int second_number = scanner.nextInt();
		
		int sum = first_number + second_number;
		
		System.out.println("The total is " + sum  + ".");
		scanner.close();
		 
	}
	public static void main(String[] args) {
		addition();
		
	}

}
