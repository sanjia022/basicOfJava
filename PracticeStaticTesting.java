package basicjavaprogram;

public class PracticeStaticTesting {
	
	public static void substraction() {
		int number1 = 100;
		int number2 = 94;
		int minus = number1 - number2;
		System.out.println(minus);
		
	}
	void division() {
		int num1 = 15;
		int num2 = 3;
		int modulus = num1 / num2;
		System.out.println(modulus);		
	}
	
	
public static void main(String[] args) {
	substraction();
	PracticeStaticTesting m1 = new PracticeStaticTesting();
	m1.division();
}
}
