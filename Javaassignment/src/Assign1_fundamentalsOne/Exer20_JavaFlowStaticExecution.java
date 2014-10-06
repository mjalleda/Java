/* Description:  In this class, we learn Java Flow when a class contained 
 - Static Varibales,
 - Static  Methods and 
 - static blocks. */
package Assign1_fundamentalsOne;
public class Exer20_JavaFlowStaticExecution {	
	public static void main(String args[]) {	
		//1.4: Finally main method.
		Exer20_JavaFlowStaticExecution obj1 = new Exer20_JavaFlowStaticExecution();
		System.out.println("4: Main Method");
	}
	
	// 1.1: Declaration of static variables
	static int a = 6;
	static int b;
	
	// 1.2: declaration of static block
	static {
		System.out.println("1.1: First Static block");
		System.out.println("1.2: From First static block value a is:"+a);
		System.out.println("1.3: From First static block value b is:"+b);
	}
	
	static {
		System.out.println("2.1: Second Static block");
		System.out.println("2.2: From 2nd static block value a is:"+a);
		System.out.println("2.3: From 2nd static block value b is:"+b);
	}
	
	//1.3: Creation on constructor. In order to execute constructor it needs an object. so create object.
	public Exer20_JavaFlowStaticExecution() {
		System.out.println("3: Construcotr block:");
	}
}

//1: First control goes to 1.1, In memory it puts a =6 & b=0
//2: Later, it goes to static block, it prints, a=6 & b=0
//3: Now, control creates object and then executes constructor.
//4: Then executes main method.