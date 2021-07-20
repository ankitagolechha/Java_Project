package secondbaseclass;

import firstbaseclass.FirstBaseClass;

public class SecondBaseClass 
{
	FirstBaseClass obj= new FirstBaseClass();
	 public void printOtherBaseValue()
	 {
		 System.out.println("===============IN other PACKAGE same CLASS===============");
		 System.out.println("public value:"+obj.a);
	 	 //System.out.println("private value:"+b);<!--private value not accesed outside class--!>
	 	 //System.out.println("protected value:"+obj.c);
	 	// System.out.println("default value:"+obj.d);
		 
	 }
}
 
 
