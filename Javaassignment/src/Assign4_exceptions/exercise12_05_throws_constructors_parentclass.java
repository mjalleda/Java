/* Description: How you define exceptions in childclass with overriding constructors. We need two classes for it.
Relationship: exer12_throws_constructors_parentclass is Parent & exercise12_throws_methodoverriding_ChildClass is child.
In below class, you will find programs for
1: Constructor with Checked Exception class
2: Constructor with Checked ArithmeticException class, whioch is child of Exception class.
3: Constructor with UnChecked RuntimeException class
4: Constructor with UnChecked ArithmeticException class, which is child of RuntimeException */

package Assign4_exceptions;
public class exercise12_05_throws_constructors_parentclass {
	//1: Constructor with Checked Exception class
	exercise12_05_throws_constructors_parentclass() throws Exception {
	}
	//2: Constructor with Checked ArithmeticException class, whioch is child of Exception class.
	exercise12_05_throws_constructors_parentclass(int a) throws ArithmeticException {
	}
	//3: Constructor with UnChecked RuntimeException class
	exercise12_05_throws_constructors_parentclass(int a, int b) throws RuntimeException {
	}
	//4: Constructor with UnChecked ArithmeticException class, which is child of RuntimeException
	exercise12_05_throws_constructors_parentclass(float a) throws ArrayIndexOutOfBoundsException {
	}
}
