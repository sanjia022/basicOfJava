package day16_21july;

import java.util.Scanner;

public class Switch_Key {

	

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter a value");
		int value = s1.nextInt();
		
		switch (value) {
		case(1): System.out.println("Chrome Browser");
		break;
		case(2): System.out.println("Firefox Browser");
		break;
		case(3): System.out.println("Safari Browser");
		break;
		default:
			System.out.println("Wrong entry");
		}
		s1.close();

	}

}
