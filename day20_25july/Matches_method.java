package day20_25july;

public class Matches_method {
	
	// Find out a given string start with r or not 

	public static void main(String[] args) {
		String a = "raiyan";
		System.out.println(a.matches("r(.*)"));
		System.out.println(a.matches("...."));
		System.out.println(a.matches("(.*)u"));
		System.out.println(a.matches("(.*)n(.*)"));
		String n = "Hello";
		String b = "World";
		System.out.println(n.concat(b));
		String str = "GroTechMinds";
		System.out.println(str.substring(4, 8));

	}

}
