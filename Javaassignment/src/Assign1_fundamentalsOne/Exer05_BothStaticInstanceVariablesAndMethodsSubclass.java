/* Description: In this class, we learn how to call 
 - Static & Instance variables from a different class.
 - Static & Instance methods from a different class.

Relationships: Here, two .java classes are connected. Which are 
Package: com.sample.assign1_fundamentalsOne >> Exer05_BothStaticInstanceVariablesAndMethodsSubclass.java
Package: com.sample.assign1_fundamentalsOne >> Exer05_BothStaticInstanceVariablesAndMethodsSuperclass.java

 Below, we see,
//1: In subclass, you can only call static variables with help of superclass name. This is not possible for instance variables. 
//2: In subclass, Call instance/non-static variables from superclass with help of object. 
//3: In subclass, you can only call static methods with help of superclass name. This is not possible for instance variables.
//4: In subclass, you can call both instance & static methods from superclass with help of object. */
package Assign1_fundamentalsOne;

public class Exer05_BothStaticInstanceVariablesAndMethodsSubclass {
	public static void main(String args[])
	{

	//1.1: Call static variables from superclass in subclass with help of superclass name.
	Exer05_BothStaticInstanceVariablesAndMethodsSuperclass.st2=100;
	//1.2: You can't call instance variable by classname and the error it returned is "//can't make static reference to non-static field." 
	//BothStaticInstanceVariablesAndMethodsSuperclass.in2 = 100; 

	//3.1: Call static methods from superclass in subclass with help of superclass name.
	Exer05_BothStaticInstanceVariablesAndMethodsSuperclass.main(2); // you can call static methods.
	//3.2.2You can't call instance methods by classname and the error it returned is "//can't make static reference to non-static field."
	//BothStaticInstanceVariablesAndMethodsSuperclass.m12();

	//2: In subclass, Call both static & instance variables from superclass with help of object.
	Exer05_BothStaticInstanceVariablesAndMethodsSuperclass obj1 = new Exer05_BothStaticInstanceVariablesAndMethodsSuperclass();
	//2.1: In subclass, Call both static variables from superclass with help of object.
	obj1.st2 = 99;
	//2.2: In subclass, Call instance variables from superclass with help of object.
	obj1.in2 = 100;
	
	//4: In subclass, you can call superclass's static & instance methods by object.
	obj1.main(5); // calling static method
	obj1.m12();  // calling instance method

}
}