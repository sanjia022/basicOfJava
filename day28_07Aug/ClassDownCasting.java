package day28_07Aug;

class parentClass1{
	
}

public class ClassDownCasting extends parentClass1{

	public static void main(String[] args) {
	parentClass1 a =	new ClassDownCasting();//up casting
	ClassDownCasting c =(ClassDownCasting) a;//down casting
	//we can get access of both child and parent class properties by using the given reference variable in down casting 
	}

}
