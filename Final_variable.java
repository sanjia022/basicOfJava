package basicjavaprogram;

public class Final_variable {
	
	static boolean a;
	int number = 90;
	
	public static void multiplication() {
		final int number = 87;
		int number1 = 45;
		int total = number * number1; 
		System.out.println("The result of this multiplication method is " + total);
		
	}
	
	public void multipliation(int a, int b) {
		
		final int total = a*b;
		System.out.println("The result of this parameterized multiplication method is " + total);
		
		
	}
	
	
	public static void main(String[] args) {
		multiplication();
		Final_variable n1 = new Final_variable();
		n1.multipliation(45,45);
	}

}
