package day18_23july;

import java.util.Arrays;

public class String_tocharArray {

	public static void main(String[] args) {
		
		String input = "sam";

		char[] c1 = input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		// how many are alphabet letter present in a given string
		String input1 = "kv no 1";
		char[] c2 = input1.toCharArray();
		System.out.println(Arrays.toString(c2));
		
		boolean answer = Character.isAlphabetic(c2[0]);
		boolean answer1 = Character.isAlphabetic(c2[1]);
		boolean answer2 = Character.isAlphabetic(c2[2]);
		System.out.println(answer);
		System.out.println(answer1);
		System.out.println(answer2);
		// need to use for loop instead of this
		for(int i = 0; i<input.length(); i++) {
			boolean answer3 = Character.isAlphabetic(c2[i]);
			System.out.println(answer3);
			
		}
		
		
		//how many are numeric letter present in a given string 
		System.out.println("Finding numeric");
		for(int i = 0; i<input1.length(); i++) {
			boolean answer3 = Character.isDigit(c2[i]);
			System.out.println(answer3);
			
		}
	
		
		//how many are spaces present in a given string
		System.out.println("Finding spaces");
		for(int i = 0; i<input1.length(); i++) {
			boolean answer3 = Character.isSpaceChar(c2[i]);
			System.out.println(answer3);
		//how many are special character present in a given string
			

	}
	}
}
