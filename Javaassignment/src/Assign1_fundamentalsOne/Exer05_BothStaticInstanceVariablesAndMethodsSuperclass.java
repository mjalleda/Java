/* Description: In this class, we created 
 - Static & Instance variables.
 - Static & Instance methods.

Relationships: Here, two .java classes are connected. Which are 
Package: com.sample.assign1_fundamentalsOne >> Exer05_BothStaticInstanceVariablesAndMethodsSubclass.java
Package: com.sample.assign1_fundamentalsOne >> Exer05_BothStaticInstanceVariablesAndMethodsSuperclass.java

1: declare/initialize/re-initialize static/instance variables. 
2: Call static & instance variables inside static method
3: call static & instance variables inside non-static/instance method
4: Directly call/instantiate both static and instance methods inside superclass. */
package Assign1_fundamentalsOne;
public class Exer05_BothStaticInstanceVariablesAndMethodsSuperclass {
	
	// 1: Declare & initialize static and instance variables.
	//1.1 : Declare & initialize static variables
	static int st1;
	static int st2=8;

	//1.2 : Declare & initialize instance variables
	int in1;
	int in2=200;

	// 2: call static & instance variables inside static method 	
	public static int main(int a) { 
		
		//2.1: Can create new static variables & re-initialize/use existing static variables.
		st2 = 90; // static can be  re-initialized
		//static int st3 = 5; // new static variables can't be created/declared at method level.
		
		//2.2: can't use existing instance variables in static method.
		//in2 = 300; // 
		
		//2.3: If you create instance variables inside any method, that will become local variables.
		int in3 = 200;
		return 0;
	}
	
	//3: call static & instance variables inside non-static/instance method
	int m12()
	{
		//3.1: static variables.
		st2 = 10; // existing static variables can be  re-initialized
		//static int st3 = 5; // new static variables can't be created/declared at method level.
		
		//3.2: existing instance variables can be re-initialized.
		in2 = 300; // 
		
		//3.3: If you create new instance variables inside any method, that will become local variables.
		int in4 = 200;
		return in4;
	}
	
	//4: Directly call/instantiate both static and instance methods inside superclass.
	int k = m12();
	int j = main(1);

}
