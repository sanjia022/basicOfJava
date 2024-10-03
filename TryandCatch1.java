package javaprograms;

import java.util.Scanner;

public class TryandCatch1 {
	
	static Scanner scanner = new Scanner(System.in);
	
	static void input() {
		System.out.println("Enter your name");
		String name = scanner.next();
		try {
		char a1 = name.charAt(10);
		System.out.println(a1);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("");
		}
	}
		

	public static void main(String[] args) {
		 input();

		scanner.close();
	}


}
