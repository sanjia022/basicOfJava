package day36_Aug18;
import java.lang.StringBuilder;
public class String_builder {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Welcome to ");
		//System.out.println(s1.append("home!"));
		System.out.println(s1);
		s1.insert(11, "my home.");
		System.out.println(s1);
		s1.delete(11, 14);
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("Apple watch");
		s2.substring(5);
		System.out.println(s2);
		
		StringBuilder s3 = new StringBuilder("flower is beautiful");
		s3.substring(0, 3);
		System.out.println(s3);
		
		StringBuilder s4 = new StringBuilder("Reverse");
		System.out.println(s4.reverse());
		
		
	}

}
