package basicjavaprogram;

public class Constructor_Method {
	
	Constructor_Method(){
		System.out.println("I am a constructor without parameter.");
		
	}
	
	Constructor_Method(String a){
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		new Constructor_Method();
		new Constructor_Method("I am a constructor with parameter.");
	    new Constructor_Method("I am a constructor with parameter");
		
		
	
		
		
	}

}
