package javaprograms;

import java.util.Scanner;

//IF Statement:All salespeople get a payment of $1000 a week.Salespeople who exceed 10 sales get an additional bonus of $250.

class Salary_Calculator{
	
	void SalaryCalculator() {
		int weekly_salary = 1000;
		int sales = 10; 
		int bonus = 250;
		Scanner s1 = new Scanner(System.in);
		System.out.println("How many sales you have made");
		int salesMade = s1.nextInt();
		if(salesMade>sales) {
			weekly_salary = weekly_salary + bonus;
			System.out.println("Your salary is " + weekly_salary);
			
		}
		else {
			System.out.println();
		}
		
		
		
		s1.close();
		
	}
}

public class Method_overriding extends Salary_Calculator {

	void SalaryCalculator() {
	super.SalaryCalculator();
	
		
	}
	public static void main(String[] args) {
		Method_overriding q = new Method_overriding();
		q.SalaryCalculator();
		
	}

}
