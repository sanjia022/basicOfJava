package basicjavaprogram;

public class GlobalVariable {
	
	static int a = 12;
	
	static int b;
	int numbers_of_the_days_in_month = 30;
	
	
	

	public static void main(String[] args) {
		
		System.out.println(a);
		a = 54;// update the local variable
		System.out.println(a);//will print the updates local variable
		GlobalVariable n1 = new GlobalVariable();// calling a non static method by creating an object
		System.out.println(n1.numbers_of_the_days_in_month);
		n1.numbers_of_the_days_in_month = 20;//Update the global variable
		System.out.println(n1.numbers_of_the_days_in_month);
	
	

	}

}
