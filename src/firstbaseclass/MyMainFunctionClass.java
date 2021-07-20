package firstbaseclass;
import secondbaseclass.SecondBaseClass;
import secondbaseclass.secondDerivedClass;

public class MyMainFunctionClass {

	public static void main(String[] args) {
		FirstBaseClass obj=new FirstBaseClass();
		MyOtherClass obj1 = new MyOtherClass();
		MyDerivedClass obj2 = new MyDerivedClass();
		SecondBaseClass obj3 = new SecondBaseClass();
		secondDerivedClass obj4 = new secondDerivedClass();
		obj.printBaseValue();
		obj2.printDerivedValue();
		obj1.printOtherValue();
		obj3.printOtherBaseValue();
		obj4.printOtherDerivedValue();
	}

}
