package firstbaseclass;
public class  FirstBaseClass
{
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=40;
    public void printBaseValue()
	{
    	System.out.println("===============IN SAME PACKAGE BASE CLASS=============");
		System.out.println("public value:"+a);
		System.out.println("private value:"+b);
		System.out.println("protected value:"+c);
		System.out.println("default value:"+d);
	}
}

class MyDerivedClass extends FirstBaseClass
{
	 public void printDerivedValue()
	 {
		 System.out.println("================IN SAME PACKAGE DERIVED CLASS===========");
		 System.out.println("public value:"+a);
	 	 //System.out.println("private value:"+b);<!--private value not accesed outside class--!>
	 	 System.out.println("protected value:"+c);
	 	 System.out.println("default value:"+d);
		 
	 }
}

class MyOtherClass 
{
	FirstBaseClass obj=new FirstBaseClass();
	 public void printOtherValue()
	 {
		 System.out.println("===============IN SAME PACKAGE OTHER CLASS===============");
		 System.out.println("public value:"+obj.a);
	 	 //System.out.println("private value:"+b);<!--private value not accesed outside class--!>
	 	 System.out.println("protected value:"+obj.c);
	 	 System.out.println("default value:"+obj.d);
		 
	 }
}


