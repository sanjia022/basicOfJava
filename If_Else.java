package basicjavaprogram;

import java.util.Scanner;

/*Assignment 14 
WAP if age is greater than or equals to 18 then you can vote
else you can not vote
 * */

public class If_Else {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter your age");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age >= 18) {
			System.out.println("You can vote.");
			
		}
		else {
			System.out.println("Sorry! you cant vote.");
		}
		scanner.close();
		
		
	}

}
