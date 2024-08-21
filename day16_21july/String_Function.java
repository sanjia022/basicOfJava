package day16_21july;

public class String_Function {

	public static void main(String[] args) {
		//String a1 = new String("David");
		String a = "David";
		String a1 = "ManishKumarTiwari";
		System.out.println(a.length());
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf('d'));
		//System.out.println(a.toLowerCase("david"));
		System.out.println(a.substring(1));
		System.out.println(a.substring(0, 2));
		System.out.println(a1.substring(0, 6));
		System.out.println(a1.substring(6, 11));
		System.out.println(a1.substring(11));

	}

}
