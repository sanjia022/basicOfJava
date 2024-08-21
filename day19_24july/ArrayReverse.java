package day19_24july;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int oldArray[] = new int[3];
		oldArray[0] = 45;
		oldArray[1] = 452;
		oldArray[2] = 422;
		
		// want to copy salary into manager salary
		int reverveArray[] = new int[3];
		
		/*reverveArray[2]= oldArray[0];
		reverveArray[1]= oldArray[1];
		reverveArray[0]= oldArray[2];*/
		
		//for(int i = 0,k = reverveArray.length -1; i<oldArray.length;i++,k--) 
		for(int i = 0,k = 2; i<oldArray.length;i++,k--) {
			
			reverveArray[k]= oldArray[i];
			
		}
		System.out.println(Arrays.toString(reverveArray));
		System.out.println(Arrays.toString(oldArray));

	}

}
