package day21_28july;

import java.util.Arrays;

// Is the two string are anagram or not


public class Anagram_problem {

	public static void main(String[] args) {
		
		
		String name = "face";
		String name1 = "cafe";
		 if(name.length()!=name1.length()) {
			 System.out.println("The two words are not anagram");}
		 else {
			 char [] a1 = name.toCharArray();
			 char [] a2 = name1.toCharArray();
			 
			 
			 Arrays.sort(a1);
			 Arrays.sort(a2);
			 System.out.println(Arrays.toString(a2));
			 System.out.println(Arrays.toString(a1));
			 boolean answer = Arrays.equals(a1, a2);
			 System.out.println(answer);
			 
		 }
		 

	}

	}
	
