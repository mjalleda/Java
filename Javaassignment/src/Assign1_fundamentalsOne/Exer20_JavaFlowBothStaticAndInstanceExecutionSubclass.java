/* Description: Here, we learn how a java when a class extends another class. 
 Relationship: Exer20_JavaFlowBothStaticAndInstanceExecutionSuperclass is superclass & Exer20_JavaFlowBothStaticAndInstanceExecutionSubclass is subclass which is extending superclass. 
 
 In this sub class, you will see how java flow when this subclass created an Object for superclass.
 */
 package Assign1_fundamentalsOne;
public class Exer20_JavaFlowBothStaticAndInstanceExecutionSubclass extends Exer20_JavaFlowBothStaticAndInstanceExecutionSuperclass {
	//6: Sixth, main methiod.
	public static void main(String args[]) {
		Exer20_JavaFlowBothStaticAndInstanceExecutionSubclass obj1 = new Exer20_JavaFlowBothStaticAndInstanceExecutionSubclass();
		System.out.println("7: main method  from subclass");
	}
	
	//Instance variables and static variables.
	//1: First control goes to static variables
	static int a=20;
	static int b;
	//3: Third control goes to instance variables
	int c=200;
	int d;
	
	// 4: Forth control goes to instance block
	{
		System.out.println("5.1: Instance block from subclass, instance variable c is:"+c);
		System.out.println("5.2: Instance block  from subclass, static variable d is:"+d);
		 
	}

	// 2: Second control goes to static blocks
	static {
		System.out.println("2.1: Static block  from subclass. Static variable a is: "+a);
		System.out.println("2.2: Static block  from subclass. Static variable b is: "+b);
		int c =80;
	}
	
	// 5: Firth control goes to constructor, it create object first then execute constructor.
	Exer20_JavaFlowBothStaticAndInstanceExecutionSubclass() {
		System.out.println("6: Constructor block  from subclass");
	}

}
