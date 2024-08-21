package day28_07Aug;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClassUpCasting extends Object{

	
	public static void main(String[] args) {
		 Object a = new ClassUpCasting(); //up casting
          a.notify();//Only can use super class type method no matter child class have any method or not
          
          //Convert arrayList to List
          
          List b = new ArrayList();//implicit manner
           // up casting arrayList to Collection
          
         Collection c = new ArrayList();
  
         // up casting in explicit manner
         List b2 = (List)new ArrayList();
}
}