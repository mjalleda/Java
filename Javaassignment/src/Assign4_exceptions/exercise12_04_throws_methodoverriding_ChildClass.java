/* Description: How you define exceptions in child class with overriding methods.
We need two class for this. 
Relationship: exercise12_throws_methodoverriding_ParentClass is Parent & exercise12_throws_methodoverriding_ChildClass is child.

In this class, I wrote programs for
1.1: Checked exceptions with EXCEPTION CLASS
1.2: Checked exceptions. ArithmeticException is child of Exception.
2.1: Unchecked exceptions.
 2.2: Unchecked exceptions. ArrayIndexOutOfBoundsException is child of RuntimeException */

package Assign4_exceptions;
public class exercise12_04_throws_methodoverriding_ChildClass extends exercise12_04_throws_methodoverriding_ParentClass{
	
	//**********************************************//
	//	METHOD OVERRIDING WITH CHECKED EXCEPTIONS
	// It matters how you define in childclass with checked methods. It only allows samelevel or one level below.
	//**********************************************//
	// 1.1.1: Checked exceptions with samelevel=EXCEPTION CLASS
	void m1(int a, int b) throws Exception {
	}
	// 1.1.1: Checked exceptions with level one below=ArithmeticException Class
	void m1(int a, float b) throws ArithmeticException {
	}

	// 1.2.1: Checked exceptions with same level=ArithmeticException Class
	void m2(int a, float b) throws ArithmeticException {
	}
	
	// Scenario 2.1: In-valid: The below will return error. Uncomment, you will find compilerexception
	// 1.2.2: Checked exceptions with level one above=Exception Class
	/* void m2(int a, int b) throws Exception {
	} */
	
	//**********************************************//
	//  		METHOD OVERRIDING WITH UNCHECKED EXCEPTIONS 
	// It doesn't mattere how you define in childclass with unchecked methods.
	//**********************************************//
	// 2.1.1: UnChecked exceptions with samelevel=RuntimeException CLASS
	void m3(int a, int b) throws RuntimeException {
	}
	// 2.1.2: UnChecked exceptions with levelbelow=ArrayIndexOutOfBoundsException CLASS
	void m3(int a, float b) throws ArrayIndexOutOfBoundsException {
	}
	
	// When Parentclass method has unchecked childexception.
	// 2.2.1: Checked exceptions with samelevel one below=ArrayIndexOutOfBoundsException Class
	void m4(int a, int b) throws ArrayIndexOutOfBoundsException {
	}
	// 2.2.2: Checked exceptions with samelevel one abive=Exception Class
	void m4(int a, float b) throws Exception {
	}
}
