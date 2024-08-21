package day27_05Aug;

public class StringTryAndCatch1 {
	public static void main(String[] args) {
		String a ="Sanjia";
		
		try {
		char a1 = a.charAt(6);
		System.out.println(a1);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Please enter correct index");
		}
		finally {
			char a1 = a.charAt(3);
			System.out.println(a1);
		}
	}

}
