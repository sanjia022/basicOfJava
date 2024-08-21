package day21_28july;

public class Contain_String_Method {

	public static void main(String[] args) {
		String a = "David Smith";
		boolean answer = a.contains("Smith");
		
		if(answer == true) {
			System.out.println("The word contain Smith ");
		}
		else{System.out.println("The word does not contain Smith");
		}
	}

}
