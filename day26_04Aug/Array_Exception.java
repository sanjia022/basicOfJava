package day26_04Aug;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


/*Array size is 4 but enter 5 values ,handle it with try and catch */


public class Array_Exception {

	    public static void main(String[] args) {
	       
	        System.out.println("Enter the array size of 4:");
	        Scanner scanner = new Scanner(System.in);
	        
	      try {  
	    	  int[] num = new int[4]; 
	        for(int i = 0; i<num.length+1;i++) {
	         num[i] = scanner.nextInt();

	        }
	      }catch(ArrayIndexOutOfBoundsException e) {
	    	  System.out.println("You have exceed array size. Enter the right number");
	    	
	      }
	      catch(InputMismatchException e) {
	    	  System.out.println("You have entered wrong format. Please try again");
	    	
	      }
	     finally{
	    	  int[] num = new int[4];
	    	 for(int i = 0; i<num.length;i++) {
		         num[i] = scanner.nextInt();

		       }
	      System.out.println(Arrays.toString(num));
	      scanner.close();
	      }
	    }
	}
	

//ArrayIndexOutOfBoundsException