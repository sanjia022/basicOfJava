package basicjavaprogram;

public class Calling_Nonstatic_Method1 {
	
	
	void addition() {
		int num1 = 12;
		int num2 = 45;
		int sum = num1 + num2;
		System.out.println("The total number is " + sum);
		
	}
	
	void addition(int a, int b ) {
		
		int sum = a + b;
		System.out.println("The total number is " + sum);
		
	}
	
	static void substraction() {
		int number1 = 12; 
		int number2 = 67;
		int sum = number1 - number2;
		System.out.println("The result is " + sum);
		
	}
	
	void modulas() {
		int number1 = 125; 
		int number2 = 5;
		int modulus = number1 % number2;
		System.out.println("The result is " + modulus);
		
	}

	public static void main(String[] args) {
		
		Calling_Nonstatic_Method1 n1 = new Calling_Nonstatic_Method1();
		n1.addition();
		n1.addition(12, 45);
		n1.modulas();
		substraction();
	}

}
