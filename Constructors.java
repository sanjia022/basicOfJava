package basicjavaprogram;

public class Constructors {
	
	//This is a constructor
	public  Constructors() {
		System.out.println("I am a constructor.");
	};
	
	Constructors(int a){
		System.out.println("I am a constuctor with the variation in argument.");
	}
	
	Constructors(String name){
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		//Constructors n1 = new Constructors();
		
		new Constructors();
		new Constructors(23);
		//Constructors n2 = new Constructors("SQL");
		
		new Constructors("I am a String data type");
		
		
		
	}
	

}
