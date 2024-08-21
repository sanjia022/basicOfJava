package day28_07Aug;



public class WideningPrimitiveTypeCasting {

	public static void main(String[] args) {
		// converting int to double data type
		
		int a = 100; 
		double b = a;// implicit way to do widening primitive type casting
		System.out.println(b);
		
		// explicit way to call widening primitive type casting
		
		double c = (double)a;
		System.out.println(c);
		
		// convert age in byte to short data type
        byte age = 92;
        short age1 = age;
        System.out.println(age1);
	}

}
