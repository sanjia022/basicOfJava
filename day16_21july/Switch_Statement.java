package day16_21july;

import java.util.InputMismatchException;
import java.util.Scanner;

/*We need to determine a student's grade based on their score.
The grading scale is:
if score is 90 grade will be A
if score is 80 grade will be B
if score is 70 grade will be C
The program should handle invalid input and prompt the user to try again. if you want try to handle any exception for continuity of this program*/

public class Switch_Statement {

	public static void main(String[] args) {
		
		System.out.println("Please enter your score:");
		
		Scanner scanner = new Scanner(System.in);
		try{int score = scanner.nextInt();
		
	
		switch(score){
		case(90):System.out.println("Your grade is A");
		break;
		case(80):System.out.println("Your grade is B");
		break;
		case(70):System.out.println("Your grade is C");
		break;
		default:System.out.println("Please enter valid input of 90, 80 and 70");
		
		}
		}
		catch(InputMismatchException e) {
			System.out.println("Sorry! you have entered wrong input data.Please enter valid data");
		}
		
		
		
		scanner.close();
	}

}
