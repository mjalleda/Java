/* Description: How you define exceptions in child class with overriding methods.
We need two class for this. 
Relationship: exercise12_throws_methodoverriding_ParentClass is Parent & exercise12_throws_methodoverriding_ChildClass is child.

In this class, I wrote programs for
1.1: Checked exceptions with EXCEPTION CLASS
1.2: Checked exceptions. ArithmeticException is child of Exception.
2.1: Unchecked exceptions.
 2.2: Unchecked exceptions. ArrayIndexOutOfBoundsException is child of RuntimeException */
	
package Assign4_exceptions;
public class exercise12_04_throws_methodoverriding_ParentClass {
	public static void main(String args[]) {
	}
	// 1.1: Checked exceptions with EXCEPTION CLASS
	void m1(int a, int b) throws Exception {
	}

	// 1.2: Checked exceptions. ArithmeticException is child of Exception.
	void m2(int a, int b) throws ArithmeticException {
	}

	// 2.1: Unchecked exceptions.
	void m3(int a, int b) throws RuntimeException {
	}
	
	// 2.2: Unchecked exceptions. ArrayIndexOutOfBoundsException is child of RuntimeException
	void m4(int a, int b) throws ArrayIndexOutOfBoundsException {
	}
}
