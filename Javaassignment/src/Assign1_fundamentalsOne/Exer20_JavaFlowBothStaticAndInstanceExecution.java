/* Description:  In this class, we learn Java Flow when a class contains,,
 - Static & Instance variables,
 - Static & Instance blocks
 - Constructor & also a main method */
package Assign1_fundamentalsOne;
public class Exer20_JavaFlowBothStaticAndInstanceExecution {
	//6: Sixth, main methiod.
	public static void main(String args[]) {
		Exer20_JavaFlowBothStaticAndInstanceExecution obj1 = new Exer20_JavaFlowBothStaticAndInstanceExecution();
		System.out.println("4: main method");
	}
	
	//Instance variables and static variables.
	//1: First control goes to static variables
	static int a =10;
	static int b;
	//3: Third control goes to instance variables
	int c=100;
	int d;
	
	// 4: Forth control goes to instance block
	{
		System.out.println("2.1: Instance block, instance variable c is:"+c);
		System.out.println("2.2: Instance block, static variable d is:"+d);
		 
	}

	// 2: Second control goes to static blocks
	static {
		System.out.println("1.1: Static block. Static variable a is: "+a);
		System.out.println("1.2: Static block. Static variable b is: "+b);
		int c =80;
	}
	
	// 5: Firth control goes to constructor, it create object first then execute constructor.
	Exer20_JavaFlowBothStaticAndInstanceExecution() {
		System.out.println("3: Constructor block");
	}
	
}

//Flow:
// First, it goes to static variables > then static blocks
// later, it goes to instance variables > then instance blocks
// Then constructor, first it creates an object for constructor and tehn execute constructor.
// Finally main method.