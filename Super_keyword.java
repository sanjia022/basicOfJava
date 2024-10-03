package javaprograms;

import java.util.Scanner;
class add{
	
void addition() {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int a = n1.nextInt();
		System.out.println("Please enter the Second number");
		int b = n1.nextInt();
		int sum = a + b;
		System.out.println("The sum is "+ sum);
		n1.close();
	}
}

public class Super_keyword extends add{
	
	    void addition() {
	    super.addition();
		int a = 13;
		int b = 12;
		int total = a+b;
		System.out.println(total);
		
	}
public static void main(String[] args) {
	Super_keyword a1 = new Super_keyword();
	a1.addition();
}
	}
