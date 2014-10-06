/*  Description: How/What is the use of Abstrat class. I explained this by creating two classes. One is Abstract & another one is concrete class.
Relationships: Exer15_AbstractPublicA is abstract class and Exer15_ConcreateUseAbstractA is concreate class. Where concerete class is implementing abstract methods.
Exer13_AbstractPublicA is a superclass, Exer13_ConcreateUseAbstractA is subclass. 
Both are in same package.
Note: Here, we are only practicing with public classes, but it will the same for default classes too. 

The goal of this class to implement abstract methods, so while creating this class you need select abstract class 'AbstractPublicA' as a superclass
1: In subclass, a object can't be created for abstract class 
2: SO we can use extends for abstract class to implement abstract methods in subclass.
3: After implementing, they become regular/concreate methods, so you can call them directly with help of subclass object.
Note1: Can't call/instantiate abstract methods before implementing them. Usually we can't call abstract methods  since object is not allowed for it + you can also not use abstract class to call its methods. 
Note2: Can't do polymorphism. Usually methods can be override if method's have implementation in superclass
 but abstract class don't have implementation so these methods can't be override. */
package Assign1_fundamentalsOne;
//1: Try to create object for Abstract class. You can't. + It doesn't matter if u have extends or not. Error: Can't instatiate/create object for Abstractclass.
/* public class ConcreatePublicA  {
	 AbstractPublicA AbstractPublica = new AbstractPublicA(); // 	 
}*/
//2: Use extends to implement abstract methods.
public class Exer15_ConcreateUseAbstractA extends Exer15_AbstractPublicA {
	//2.1: Implementing public methods
	@Override
	public void a1(int c9, int c10) {
		// TODO Auto-generated method stub

	}
	@Override
	public int a2(int c12, int c13) {
		// TODO Auto-generated method stub
		int c = c12+c13; 
		return c; 
	}
	
	//2.2: Implementing protected methods
	@Override
	protected void a3(int c14, int c15) {
		// TODO Auto-generated method stub

	}
	@Override
	protected int a4(int c16, int c17) {
		// TODO Auto-generated method stub
		int c = c16+c17; 
		return c; 
	}

	//2.3: Implementing default methods
	@Override
	void a5(int c18, int c19) {
		// TODO Auto-generated method stub

	}
	@Override
	int a6(int c20, int c21) {
		// TODO Auto-generated method stub
		int c = c20+c21; 
		return c; 
	}

	// 3.1: After implementing, call them directly
	int k1 = a2(1,2); 
	// 3.2: After implementing, call them by subclass object. 
	public static void main(String args[]) { 
		Exer15_ConcreateUseAbstractA ConcreateUseAbstracta = new Exer15_ConcreateUseAbstractA();
		ConcreateUseAbstracta.a1(1,2);
	}
}
