package day22_29july;
abstract class Amazon{
	abstract void login();//abs method
	abstract void registration();//abs method
}//Exposing to third organization. so internal logic is hidden    

public class Abstract_method extends Amazon {
	
	void login() {
		System.out.println("Abstract method");
		
	}
	
	void registration() {
		System.out.println("Abstract method");
		
	}
	 static void logout() //concrete method
	 {
			System.out.println("Concrete method");
	 }
	 static void resetpassword(){//concrete method 
			System.out.println("Concrete method");
	 }

	public static void main(String[] args) {
		logout();
		resetpassword();
		Abstract_method a1 = new Abstract_method();
		a1.registration();
		a1.login();

	}
	

}
