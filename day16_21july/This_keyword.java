package day16_21july;



public class This_keyword {
	int age;
	String name;
	double salary;
	
	void details(int age, String name,double salary) {
		System.out.println("Students");
		this.age =age;
		this.name ="David";
		
	}

	public static void main(String[] args) {
		This_keyword t1 = new This_keyword();
		t1.details(12, "Manish", 12.123);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);

	}

}
