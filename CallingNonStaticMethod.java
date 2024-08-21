package basicjavaprogram;

public class CallingNonStaticMethod {
	
	public static void printingline() {
		String line1 = "Sky is blue.";
		String line2 = "Sky is beautiful.";
		System.out.println(line1 + " " + line2);
	}
	
	public void substraction() {
		int number1 = 90;
		int number2 = 45;
		int value = number1 - number2;
		System.out.println(value);
	}
	
	void multiplication() {
		int a = 23;
		int b = 2;
		int multiply = a * b;
		System.out.println(multiply);
		
	}
	public static void main(String[] args) {
		printingline();
		CallingNonStaticMethod sub1 = new CallingNonStaticMethod();
		sub1.substraction();
		sub1.multiplication();
		
		
	}

}
