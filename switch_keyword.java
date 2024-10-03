package javaprograms;

import java.util.Scanner;

public class switch_keyword {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter a n value");
	int value = scanner.nextInt();
	
	switch(value){
		case(1) : System.out.println("Print 1");
			    break;
		case(2) : System.out.println("Print 2");
	    break;
		case(3) : System.out.println("Print 3");
	    break;
	    default: 
	    	System.out.println("Print nothing");
	    	scanner.close();   
		
		
	}
		
		}
		
	
  
  

}
	



