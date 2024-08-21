package day25_02Aug;

public class Assert_Keyword {

	public static void main(String[] args) {
		int a = 10;
		assert a>5;
		System.out.println(a+100);
		
	

		String name = "sanjia";
		assert name.matches((".*a"));
		assert name.equals("Sanjia");
		assert name.equals("Sanjia"):("Sorry");
	}

}
