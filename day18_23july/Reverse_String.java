package day18_23july;

import java.util.Arrays;

public class Reverse_String {

	public static void main(String[] args) {
		 String input = "ratul";
		 String output = "";
		 
		 char c1 = input.charAt(4);
		 char c2 = input.charAt(3);
		 char c3 = input.charAt(2);
		 char c4 = input.charAt(1);
		 char c5 = input.charAt(0);
		 //instead of writing like this, we can write a for loop
		 
		 
		 for(int i= 4; i>=0; i--) {
			 char c12= input.charAt(i);
			 output = output + c12;
			 //System.out.println(c12);
			 //System.out.print(c12);
			
		 }
		 System.out.println(output);
	}

}
