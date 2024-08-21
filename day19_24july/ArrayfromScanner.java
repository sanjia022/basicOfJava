package day19_24july;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayfromScanner {
	public static void main(String[] args) {
		int rollno[] = new int[3];
		Scanner n1 = new Scanner(System.in);
       // rollno[0] = n1.nextInt();
       // rollno[1] = n1.nextInt();
       // rollno[2] = n1.nextInt(); 
    
		//we need to for loop instead of this 
		
		for(int i = 0; i<rollno.length; i++) {
			rollno[i] = n1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		
		String name [] = new String[3];
		//name[0] = n1.next();
		//name[1] = n1.next();
		//name[2] = n1.next();
		for(int i = 0; i<name.length;i++) {
			name[i] = n1.next();
		}
		System.out.println(Arrays.toString(name));
		n1.close();
	}

}
