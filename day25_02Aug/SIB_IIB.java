package day25_02Aug;


	
	public class SIB_IIB 
	{
		static    //SIB
		{
			System.out.println("SIB");
		}
		SIB_IIB()       //constructor
		{
			System.out.println("Constructor");
		}
		SIB_IIB(int a)       //constructor
		{
			System.out.println("Constructor 1");
		}
		{                    //IIB
			System.out.println("IIB");
		}
		{                    //IIB
			System.out.println("IIB 2");
		}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		new SIB_IIB();
		new SIB_IIB(1);
	}
	}

