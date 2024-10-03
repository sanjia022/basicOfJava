package javaprograms;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {
		
		
		//how many are alphabet letter present in a given string
		String name = "Sanjia1";
		char[] a1= name.toCharArray();
		System.out.println(Arrays.toString(a1));
		
		boolean answer = Character.isAlphabetic(0);	
		System.out.println(answer);
		
		for(int i= 0; i<name.length(); i++) {
			boolean answer1 = Character.isAlphabetic(a1[i]);	
			System.out.println(answer1);
		}
		
        //how many are spaces present in a given string
		System.out.println("Finding space");
		for(int i = 0; i<name.length();i++) {
         boolean answer1 =  Character.isSpaceChar(a1[i]);
         System.out.println(answer1);
		}
		
		//how many are numeric letter present in a given string 
		
		System.out.println("Finding Numeric");
		for(int i=0; i<name.length();i++) {
			boolean answer1 = Character.isDigit(a1[i]);
			System.out.println(answer1);
		}
	}

}
