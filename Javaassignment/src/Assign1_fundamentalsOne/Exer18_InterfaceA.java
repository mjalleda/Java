/* Description: Here, we lear,
  - How to call/use Interface classes by other interface class,
  - How to call Interface class by concrete class 
Relationship: Exer13_InterfaceA, Exer13_InterfaceB, Exer13_SubInterface are interfaces. Exer13_ClassImplementsInterfaceAInterfaceB is concreate class.
The class Exer13_ClassImplementsInterfaceAInterfaceB implements both Interfaces "InterfaceA, "InterfaceB" methods.

In this interface, You see
1: For variables, declaration and initialization should be done when you declare variable. By default variables are public final static type.
2: What Types of modifiers which are allowed for interface variables?
3: What Types of modifiers which are NOT allowed for interface variables?
4: What Types of modifiers which are allowed for interface methods ?
5: What Types of modifiers which are NOT allowed for interface methods ? */

package Assign1_fundamentalsOne;
public interface Exer18_InterfaceA {
	// 1.1 Variables declaration & initilization. 
	//int a; // 1.2 Initilization is must for interface variables. By default all variables will be public static final
	int a1 = 10; // It will take public static final 
	static int b = 10; // it will take public final along with static
	final int c = 10; // it will take public static along with final
	final static int d = 10;  //it iwll take public along with final sttic
	public static final int e=10; 
	
	//below variable types are not allowed like protected, private, strictfp, native.
	/* protected int f = 10;
	private int g = 10;
	strictfp int h = 10;
	native int i = 10; */
	
	// Methods will be only public abstract. So by default it will be public abstract. All other modifiers are not allowed.
	int  m1(int a, int b);  // it will take public abstract 
	abstract int m2(int d, int e); // it will tka epublic along with abstract
	public abstract int m3(int e, int f);
	
	//below are not allowed like protected, private, final, static, strictfp, native.
	/*protected int m4(int a, int b);
	private int m5(int a, int b);
	final int m6(int a, int b);
	static int m9(int a);
	strictfp int m7(int a);
	native int m8(int a); */
}
