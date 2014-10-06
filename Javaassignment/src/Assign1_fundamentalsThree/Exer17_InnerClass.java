/* Description: In this class, we learn Inner Class.
Inner classes are not accessible from outside of the class. 
In this assignment, we learn 
 -  how to create inner class, its variables/methods & how to create object for this class both in static/instance outter class methods
 -  how to call inner class variables/methods. inside static outter class method & inside nonstaic outter class method */
//Remember: We have two types of inner classes. Instance and static. We will study about static in later assignments, but here we learn about instance inner class.
package Assign1_fundamentalsThree;

public class Exer17_InnerClass {

	// 1. Creation of Inner class.
	class Employee {
		int sal = 100;
		int interest = 10;
		public int m1(int a, int b) {
			int c = a *b;
			return c;
		}
	}
	// 2. Accessing innerclass variables/methods in static outterclass method.
	// Since you are trying to call instance innerclass inside staticmethod, first you need to create an object for outterclass, later create an object for instanceinner class. 
	public static void main(String args[]) {
		// 2.1: Create an object for outterclass.
		Exer17_InnerClass Obj1 = new Exer17_InnerClass();
		// 2.2: Creating an object for innerclass with help of outterclass.
		Employee e1 = Obj1.new Employee();
		//printing inner class variables/methods from static outterclass.
		System.out.println("********* Printing Innerclass variables/methods from static Outterclass *************");
		System.out.println(e1);
		System.out.println(e1.interest);
		System.out.println(e1.sal);
		System.out.println(e1.m1(5,5));
		Obj1.m2(5,5);
	}
	
	// 3: Accessing innerclass variables/methods in non static outerclass method.
	void m2(int a, int b) {
		// 3.1: Creating an object for innerclass without help of outterclass. Since outterclass object is already created before calling this m2 method, so no need to put reference for otterclass while creating innerclass.
		Employee e2 = new Employee();
		// 3.2: printing inner class variables/methods from Instance outterclass.
		System.out.println("************ Printing Innerclass variables/methods from Instance Outterclass ***********");
		System.out.println(e2);
		System.out.println(e2.interest);
		System.out.println(e2.m1(5,5));
	}
}
