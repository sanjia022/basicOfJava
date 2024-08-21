package day21_28july;

public class String_replace_method {
public static void main(String[] args) {
	
	// IN A STRING REPLACE capital letter WITH smaller letter
	String a = "David";
	System.out.println(a.replace("D", "d"));
	
	// in a given string remove all the space
	String name = "Manish Kumar Tiwari";
	System.out.println(name.replace(" ", ""));
	
	// In the given string remove all the capital letter
	
	String name1 = "Manish Kumar Tiwari";
	System.out.println(name1.replaceAll("[A-Z]", ""));// way to write alphabet A-Z
	
	// In the given string remove all the smaller letter
	System.out.println(name1.replaceAll("[a-z]", ""));
	
    //In the given string remove all the Numeric letter
       String a1 = "kv no 1";
     System.out.println(a1.replaceAll("[0-9]", ""));
}
}