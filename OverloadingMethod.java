package basicjavaprogram;

public class OverloadingMethod {
	
	public static void add() {
		System.out.println("SQL is a database query language.");
		
	}
	public static void add(int a, long b) {
        long sum = a+b;
		System.out.println(sum);
	}
	public static void add(String name) {
		System.out.println("SQL is a database query language.");
	}
	
	void addition(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		
	}
	
public static void main(String[] args) {
	add(23, 23345);
	add();
	add("SQL is a database query language.");
	OverloadingMethod add1 = new OverloadingMethod();
	add1.addition(23, 45);
}
}
