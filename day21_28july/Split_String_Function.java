package day21_28july;

import java.util.Arrays;

public class Split_String_Function {

	public static void main(String[] args) {
		String name = "David Smith Arora";
		String[] name1 = name.split(" ");
		System.out.println(Arrays.toString(name1));
		
		//Split method with two parameters
		
		
		String[] name2 = name.split(" ", 2);// " " means space. so where first space it find it will split but in 
		//2 division of the whole string
		System.out.println(Arrays.toString(name2));
		
		String[] name3 = name.split(" ", 3);// " " means space. so where first space it find it will split but in 
		//3 division of the whole string
		System.out.println(Arrays.toString(name3));
		
		String[] name4 = name.split(" ", 1);// " " means space. so where first space it find it will split but in 
		//2 division of the whole string
		System.out.println(Arrays.toString(name4));

	}

}
