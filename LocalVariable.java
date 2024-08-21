package basicjavaprogram;

public class LocalVariable {
	public static void addition () {
		int a = 45; 
		int b = 23; 
		int sum;
		sum = a+b ;
		System.out.println(sum);
	}
	
	public void addition(int c, int d) {
		int total =  c+d;
		System.out.println(total);
		
	}
	public static void main(String[] args) {
		addition();
		LocalVariable n1 = new LocalVariable();
		n1.addition(12,47);
		
		
		
		
		
	}

}
