package day_17July_method_overiding;

class Parent{
	void login() {
		System.out.println("log in with email address");
	}

}


public class Method_Overloading extends Parent{
	
	void login() {
		super.login();
		System.out.println("log in with Mobile no");
		super.login();
	}

	public static void main(String[] args) {
		Method_Overloading n1 = new Method_Overloading();
		n1.login();

	}

}
