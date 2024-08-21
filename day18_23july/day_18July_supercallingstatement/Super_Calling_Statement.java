package day_18July_supercallingstatement;

class Parent{
	
	Parent(){
		
		System.out.println("I am parent constructor.");
		
	}
}

class Parent1 extends Parent{
	
	Parent1(int a){
		
		System.out.println("I am parent constructor with para.");
		
	}
}
public class Super_Calling_Statement extends Parent1{
	
	Super_Calling_Statement(){
		super(200);
	    System.out.println("I am Super_Calling_Statement constructor.");
		
	}

	public static void main(String[] args) {
		
		new Super_Calling_Statement();

	}

}
