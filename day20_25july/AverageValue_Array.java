package day20_25july;

public class AverageValue_Array {

	public static void main(String[] args) {
		int value[]= new int[4];
		value[0]= 17;
		value[1]= 35;
		value[2]= 81;
		value[3]= 42;
		int sum = 0;
		//double sum = 0; we can use double datatype to get the answer in decimal
		//int sum = value[0]+value[1]+value[2]+value[3];
		//int avg = sum/4;
		//System.out.println(avg);
		
		for(int i = 0 ; i < value.length; i++) {
			sum = sum + value[i];
		}
		int avg = sum/4;
			System.out.println(avg);
	}

}
