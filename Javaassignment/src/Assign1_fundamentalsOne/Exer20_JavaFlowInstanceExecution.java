/* Description:  In this class, we learn Java Flow when a class contained 
 - Instance Varibales,
 - Instance  Methods and 
 - Instance blocks. */
package Assign1_fundamentalsOne;
public class Exer20_JavaFlowInstanceExecution {
	//1.2 : Control goes to instance variables next
	int a =10;
	int b;
	
	//1.3 : Control goes to instance blocks later. Remember without object, control doesn't go to instance block.
	{
		System.out.println("1.1: From 1st instance block value a is:"+a);
		System.out.println("1.2: From 1st instance block value b is:"+b);
	}
	
	//1.3 : Control goes to 2nd instance blocks later.
	{
		System.out.println("2.1: From 2nd instance block value a is:"+a);
		System.out.println("2.2: From 2nd instance block, value b is:"+b);
	}
	
	// 1.4 : Control goes to constructor.
	public Exer20_JavaFlowInstanceExecution() {
		System.out.println("3: Construcotr block:");
	}
	
	//1.1 : Control goes to main method first.
	public static void main(String args[]) {
		Exer20_JavaFlowInstanceExecution obj1 = new Exer20_JavaFlowInstanceExecution();
		int a =20;
		int b = 1;
		System.out.println("4: Main method");
		System.out.println("5: From main block value a is:"+a);
		System.out.println("6: From main method, value a b is:"+b);
	 
	}
}




//2: Later, it goes to Instance variables and then get values.
//3: Then goes to instance block, it prints, a=6 & b=0, then 2nd instance block.
//4: Now, control goes to main and first it creates object and goes to constructor.
//5: Then goes to remaining main method.
// First instance variables > instance blocks > then constructor > Finally main.