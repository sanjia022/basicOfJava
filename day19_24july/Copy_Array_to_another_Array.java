package day19_24july;
//How to copy of an array to another Array

import java.util.Arrays;

public class Copy_Array_to_another_Array {
	
	
	public static void main(String[] args) {
		double salary[] = new double[3];
		salary[0] = 452.12;
		salary[1] = 4542.12;
		salary[2] = 4122.12;
		
		// want to copy salary into manager salary
		double Msalary[] = new double[3];
		Msalary[0]=salary[0];
		Msalary[1]=salary[1];
		Msalary[2]=salary[2];
		System.out.println(Arrays.toString(Msalary));
		//but it is good to use for loop instead of it  
		for(int i= 0; i<salary.length;i++) {
			Msalary[i]=salary[i];//logic for coping an array another 
		}
		System.out.println(Arrays.toString(Msalary));
		
	}
}

