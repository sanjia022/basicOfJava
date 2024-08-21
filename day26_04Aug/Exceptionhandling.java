package day26_04Aug;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling {
	/*int a = b/c can b comes from grand parent class and c comes from parent class. the answer is yes*/
	static Scanner scanner = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Enter your age");
		try {
			int age = scanner.nextInt();
		}
		catch(InputMismatchException a1) {
			System.out.println("Sorry, please enter your age in correct format");
			System.out.println("Enter your age");
			
		}
	
		System.out.println("Enter your first name");
		String name = scanner.next();
		System.out.println("You have enter your name" + name);
scanner.close();
	}

}
