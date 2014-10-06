/*  Description: How/What is the use of Abstrat class. I explained this by creating two classes. One is Abstract & another one is concrete class.
Relationships: Exer15_AbstractPublicA is abstract class and Exer15_ConcreateUseAbstractA is concreateclass. Where concerete class is implementing abstract methods.
Exer13_AbstractPublicA is a superclass, Exer13_ConcreateUseAbstractA is subclass. 
Both are in same package.
Note: Here, we are only practicing with public classes, but it will the same for default classes too. 

1: Abstract class should be a type of public or default. Below we created public abstract class.
2: Abstract variables are not allowed.
3: Body is not allowed in abstract methods.
4: Abstract method should be a type of public/protected/default they can't be just abstract. Implementation is not allowed in methods. 
5: Abstract methods can't be private/final/static - it gets an error. */
package Assign1_fundamentalsOne;
//1: Create public abstract class. 
public abstract class Exer15_AbstractPublicA {
	//2: Declaration of Abstract variables are not possible of anytype: - public, protected, default, private 
	// public abstract int c1=1; // It got an error illegal modifier. public abstract is now allowed.
	// protected abstract int c2; // It got an error illegal modifier. protected abstract is now allowed.
	// abstract int c3; // It got an error illegal modifier. default abstract is now allowed.
	// private abstract int c4; // It got an error illegal modifier. private abstract is now allowed.
	// abstract int c5 =10; // illegal modifier, variable should be type of pu, pro, def,pri, fi, sta, tran and vol.
	
	//3: ex: Abstract methods with body. It returned error body not allowed in abstract method. In any abstract method body is not allowed, it doesnt matter if abstract method is public, protected, private, default.
	//public abstract void m1(int c6, int c7) {
	//	return c8 = c6 + c7
	//}
	
	//4.1: Abstract method of type public.
	public abstract void a1(int c9, int c10); //No return type
	public abstract int a2(int c12, int c13); // return type
	
	//4.2: Abstract method of type protected.
	protected abstract void a3(int c14, int c15); //No return type
	protected abstract int a4(int c16, int c17); // return type
	
	//4.3: Abstract method of type default.
	abstract void a5(int c18, int c19); //No return type
	abstract int a6(int c20, int c21); // return type
	
	//5.1: Abstract method of type private is not allowed and returned illegal error.
	//private abstract void a7(int c22, int c23); //No return type
	//private abstract int a8(int c24, int c25); // return type
	
	//5.2: Abstract method of type final is not allowed and returned illegal error.
	//final abstract void a9(int c26, int c27); //No return type
	//final abstract int a10(int c28, int c29); // return type
	
	//5.3: Abstract method of type static is not allowed and returned illegal error.
	//static abstract void a11(int c9, int c10); //No return type
	//static abstract int a12(int c12, int c13); // return type
	static int abd = 100;
}
