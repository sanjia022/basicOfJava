package javaprograms;

public class This_keyword {
	int age;
	double salary;
	String name;
	
	void details(int age, double salary, String name) {
		this.age = age;
		this.salary = salary; 
		this.name = name ;
		
	}

	public static void main(String[] args) {
		This_keyword n1 = new This_keyword();
		n1.details(23,4556.98,"s");// if we dont give any value to the variable, as a global variable it will give default value
		System.out.println(n1.age);
		

	}

}
