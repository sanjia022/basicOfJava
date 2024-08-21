package day18_23july;

public class Plaindrome {

	public static void main(String[] args) {
		String input = "Manish" ;
		String output = "";
		
		 for(int i=input.length()-1; i>=0; i--) {
			 char c1 = input.charAt(i);
			 output = output + c1;
			
			 
		 }
		 System.out.println(output);
		 
		 if(input.equals(output)) {
			 System.out.println("It is a Plaindrome");
		 }
		 else {
			 System.out.println("Sorry! it is not a plaindrome");
		 }
	}

}
