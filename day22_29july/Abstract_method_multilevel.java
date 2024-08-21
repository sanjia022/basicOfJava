package day22_29july;

abstract class GrandParent//abstract class
	{abstract void add();
abstract void subs();
static void multi() {
	int a = 19; 
	int b =10; 
	System.out.println(a*b);
}
	
}
class parent extends GrandParent//concrete class
{
	static void div() {
		int a1 = 58;
		int g = 12;
		System.out.println(a1/g);
	}

	
	void add() {
		// TODO Auto-generated method stub
		
	}

	
	void subs() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Abstract_method_multilevel extends parent//concrete class  
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
