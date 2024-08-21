package day28_07Aug;

class ParentClass{
	static void add(){
		
	}
	static void add1() {
		
	}
    void add2() {
		
	}
    void add4() {
	
}
}

public class AssignmentUpandDownCasting extends ParentClass{
   static void sub(){
		
	}
	static void sub1() {
		
	}
    void sub2() {
		
	}
    void sub4() {
	
}
	

	public static void main(String[] args) {
		//UPcasting implicit way 
		ParentClass n1 = new AssignmentUpandDownCasting();
		n1.add2();
		//UPcasting explicit way
		ParentClass n2 = (ParentClass)new AssignmentUpandDownCasting();
        n2.add();
        
        AssignmentUpandDownCasting g0 = (AssignmentUpandDownCasting)new ParentClass();
        g0.sub2();
	}

}
