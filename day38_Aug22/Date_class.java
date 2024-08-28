package day38_Aug22;

import java.util.Date;
public class Date_class extends Object {

	public static void main(String[] args) {
		
		Date a1 = new Date();
		System.out.println(a1.getTime());
		Date a2 = new Date(a1.getTime());
         System.out.println(a2);
         String time = a2.toString();
         String month = time.substring(4, 7);
         System.out.println(month);
         String date= time.substring(8, 10);
         System.out.println(date);
         String year= time.substring(time.length()-4);
         System.out.println(year);
         
         String dateformat = date.concat(month).concat(year);
         System.out.println(dateformat);
         String dateformat1  = date.concat(" ").concat(month).concat(" ").concat(year);
         System.out.println(dateformat1);
	}

}
