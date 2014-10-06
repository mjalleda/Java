/* Description: Here, we learn how a java when a class extends another class. 
 Relationship: Exer20_JavaFlowBothStaticAndInstanceExecutionSuperclass is superclass & Exer20_JavaFlowBothStaticAndInstanceExecutionSubclass is subclass which is extending superclass. 
 
 In superclass, you will see
 - Creation of both variables (instance and static),
 - creation of  both blocks (static and instance), 
 - main method and constructor. */
package Assign1_fundamentalsOne;

public class Exer20_JavaFlowBothStaticAndInstanceExecutionSuperclass {
	
	//Instance variables and static variables.
	//1: First control goes to static variables
	static int a=10;
	static int b;
	//3: Third control goes to instance variables
	int c=100;
	int d;
	
	// 4: Forth control goes to instance block
	{
		System.out.println("3.1: Instance block from superclass, instance variable c is:"+c);
		System.out.println("3.2: Instance block from superclass, static variable d is:"+d);
		 
	}

	// 2: Second control goes to static blocks
	static {
		System.out.println("1.1: Static block from superclass. Static variable a is: "+a);
		System.out.println("1.2: Static block from superclass. Static variable b is: "+b);
		int c =80;
	}
	
	// 5: Firth control goes to constructor, it create object first then execute constructor.
	Exer20_JavaFlowBothStaticAndInstanceExecutionSuperclass() {
		System.out.println("4: Constructor block from superclass");
	}
	
}

//Flow:
// First, it goes to parent class and execute static variables > then static blocks
// later, it goes to child class and execute static variables > then static blocks
// later, it goes to parent class and run instance variables > then instance blocks
// Then parent constructor, first it creates an object for constructor and then execute constructor.
// later, child instance variables and child methods.
// Later, child constructors
// Finally main method.