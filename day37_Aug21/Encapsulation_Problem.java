package day37_Aug21;


class Amazon { 
	private String username = "amreen@gmail.com";
	private String password = "sdfdsdsfds";
	
	public String getusername () {
		return username;
		
	}
public void setusername (String username) {
		this.username = username;
	}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
	
}
public class Encapsulation_Problem {

	public static void main(String[] args) {
		Amazon a1 = new Amazon();
		a1.setusername("sanjia@gmail.com");
		System.out.println(a1.getusername());

	}

}
