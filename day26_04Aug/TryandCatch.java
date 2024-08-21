package day26_04Aug;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryandCatch {
	static Scanner scanner = new Scanner (System.in);

	public static void main(String[] args) {
		try {
		System.out.println("Please enter a  value");
		int w = scanner.nextInt();
		System.out.println("Please enter another value");
		int q = scanner.nextInt();
		int div = w/q;
		System.out.println(div);
		}
		catch(ArithmeticException e) {
			System.out.println("Handled the exception");
		}
		catch(InputMismatchException ex) {
			System.out.println("InputMismatchException handle here please");
		}
		scanner.close();

	}

}
