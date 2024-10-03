package javaprograms;

class Youtube{
	public Youtube(String a , int f){
		System.out.println("Youtube Constructor");
	}
}

class Google extends Youtube {
	Google(){
		super("Ishita", 327); 
		System.out.println("Google Constructor");
		
	}
}
public class Super_Calling_Statement extends Google {
	
	Super_Calling_Statement(){
		System.out.println("Super_Calling_Statement");
	}
	
	public static void main(String[] args) {
		new Super_Calling_Statement();
	}

}
