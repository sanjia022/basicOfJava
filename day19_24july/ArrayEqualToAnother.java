package day19_24july;

import java.util.Arrays;

public class ArrayEqualToAnother {
	public static void main(String[] args) {
		
		// Find out the array are equal to each other or not
		int rollno[] = new int[4];
		int rollno1 [] = new int [4];
		rollno[0]= 90;
	    rollno[1]= 56;
	    rollno[2] = 12;
		rollno[3] = 40;
		rollno1[0]= 90;
	    rollno1[1]= 56;
	    rollno1[2] = 12;
		rollno1[3] = 40;
		boolean b1 = Arrays.equals(rollno, rollno1);
		
		System.out.println("The two arrays are equal or not: "+b1);
	}

}
