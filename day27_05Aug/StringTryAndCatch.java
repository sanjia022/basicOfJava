package day27_05Aug;

import java.util.Scanner;

public class StringTryAndCatch {
	static Scanner scanner = new Scanner(System.in);
	
	static void name() {
		System.out.println("Please enter your name");
		String a = scanner.next();
		
		
		for(int i=0; i<a.length();i++) {
			char a1 = a.charAt(i);
			System.out.println(a1);
		}
	}

	public static void main(String[] args) {
		name();
		scanner.close();
	}


}
