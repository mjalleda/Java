/* Description: In this class, we learn about Static Inner Class.
Static Innerclasses are not accessible from outside of the class. 
In this assignment, we learn 
 -  how to create static innerclass, its variables/methods & how to create object for this class both in static/instance outterclass methods
 -  how to call static innerclass variables/methods. inside static outterclass method & inside nonstic outterclass method
Remember: We have two types of innerclasses. Instance and static. We will study about static in later assignments, but here we learn about instance innerclass. */

package Assign1_fundamentalsThree;
import Assign1_fundamentalsThree.Exer17_InnerClass.Employee;
public class Exer17_StaticInnerClass {

	// 2. Creation of static Innerclass.
	static class Employee {
		static int sal = 100;
		static int interest = 10;
		public static int m1(int a, int b) {
			int c = a *b;
			return c;
		}
	}
	
	// 2. Accessing innerclass variables/methods in static outterclass method.
	// Since you are trying to call instance innerclass inside staticmethod, first you need to create an object for outterclass, later create an object for instanceinner class. 
	public static void main(String args[]) {
		// 2.1: No need to create an object for outterclass inorder to create an object for static innerclass.
		// StaticInnerClass Obj1 = new StaticInnerClass();
		// 2.2: Creating an object for static innerclass.
		Employee e1 = new Employee();
		//printing static inner class variables/methods from static outterclass.
		System.out.println("********* Printing Innerclass variables/methods from static Outterclass *************");
		System.out.println(e1);
		System.out.println(e1.interest);
		System.out.println(e1.sal);
		System.out.println(e1.m1(5,5));
		
		//2.3:  OR you can also call static innerclass variables/methods directly.
		System.out.println(Exer17_StaticInnerClass.Employee.interest);
		System.out.println(Exer17_StaticInnerClass.Employee.m1(5,5));
		
		//3.1: Inorder to call outterclass instance method m2(), we need to create an object for outterclass.
		Exer17_StaticInnerClass Obj2 = new Exer17_StaticInnerClass();
		Obj2.m2(5,5);
	}
	// 3: Accessing innerclass variables/methods in non static outerclass method.
	void m2(int a, int b) {
		// 3.2: Creating an object for static innerclass without help of outterclass. Since outterclass object is already created before calling this m2 method, so no need to put reference for otterclass while creating innerclass.
		Employee e2 = new Employee();
		// 3.3: printing static innerclass variables/methods from Instance outterclass.
		System.out.println("************ Printing Static Innerclass variables/methods from Instance Outterclass ***********");
		System.out.println(e2);
		System.out.println(e2.interest);
		System.out.println(e2.m1(5,5));
	}
}

