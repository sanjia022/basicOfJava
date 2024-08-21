package day_18july_thiscallingstatement;

public class This_Calling_Statement {
	
	This_Calling_Statement(int a){
		System.out.println("Parameterized constructor with double int type");
	}
	This_Calling_Statement(double b){
		this(1);
		System.out.println("Parameterized constructor with double data type");
	}
	This_Calling_Statement(){
		this(2.12);
		System.out.println("Non parametarized constuctor");
		
	}

	public static void main(String[] args) {
		new This_Calling_Statement();

	}

}
