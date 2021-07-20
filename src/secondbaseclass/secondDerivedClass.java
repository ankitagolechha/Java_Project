package secondbaseclass;

public class secondDerivedClass extends SecondBaseClass
{
	public void printOtherDerivedValue()
	 {
		 System.out.println("===============IN other PACKAGE derived CLASS===============");
		 System.out.println("public value:"+obj.a);
	 	 //System.out.println("private value:"+b);<!--private value not accesed outside class--!>
	 	// System.out.println("protected value:"+obj.c);
	 	// System.out.println("default value:"+obj.d);
		 
	 }
}