package javaprograms;

public class Nonstatic_method {
	void add() {
		int a = 23; 
		int g =  23; 
		int sum = a+g;String name = "Sanjia";
		System.out.println(name);
		System.out.println(sum);
	}
	void add1() {
		int a = 2; 
		int g =  23; 
		int sum = a+g;
		System.out.println(sum);
	}
	void add(int a , int b) {
		
		int sum = a+b;
		System.out.println(sum);
	}
	 static void add2(int a, int f) {
		
		int sum = a+f;
		System.out.println(sum);
	}
	 void add(int a , int b, int c) {
			
			int sum = a+b;
			System.out.println(sum);
		}
	 static void add2(int f) {
			
			int sum = f;
			System.out.println(sum);
		}
	public static void main(String[] args) {
		
		new Nonstatic_method().add();;
		
		add2(43,78);
		add2(23);
	}

}
