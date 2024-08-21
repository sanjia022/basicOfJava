package day19_24july;


//in a array  of size of int data type, the value are 100; 200,330,400. Check if the given number is part of array or not 
public class Part_of_array_or_not {

	public static void main(String[] args) {
		int number[] = new int[4];
		number[0] = 100;
		number[1] = 200;
		number[2] = 45;
		number[3] = 400;
		int givenNumber = 45;
		
     for(int i= 0; i<number.length;i++) { 
    	 if(number[i] == givenNumber) {
    		 System.out.println("Given number is a part of the array");
    	 }
    	 else {
    		 System.out.println("Sorry not found");
    	 }
}
	}

}
