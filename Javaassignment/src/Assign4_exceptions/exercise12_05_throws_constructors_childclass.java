/* Description: How you define exceptions in child class with overriding constructors.
We need two classes here: 
Relationship: exer12_throws_constructors_parentclass is Parent & exer12_throws_constructors_childclass is child.

Scenario1: With CheckedExceptions
If parent constructor has IOException 
 - Childconstructor can be ArithmeticException(samelevel)
 - Childconstructor can be ExceptionClass (parent level)
 - Childconstructor can not be EndOdFileException  (child level)

Scenario2: With UN-CheckedExceptions
If parent constructor has IndexOutOfBoundException 
- Childconstructor can be IndexOutOfBoundException(samelevel)
- Childconstructor can be RuntimeException Class (parent level)
 - Childconstructor can  be ArrayIndexOutOfBoundException(child level) */

package Assign4_exceptions;
public class exercise12_05_throws_constructors_childclass extends exercise12_05_throws_constructors_parentclass{

	//**********************************************//
	//	METHOD OVERRIDING WITH CHECKED EXCEPTIONS
	// It matters how you define in childclass with checked methods. It only allows samelevel or one level below.
	//**********************************************//
	// 1.1.1: Checked exceptions with samelevel=EXCEPTION CLASS
	exercise12_05_throws_constructors_childclass() throws Exception {
	}
	/* // 1.1.1: Checked exceptions with level one below=ArithmeticException Class
	exer12_throws_constructors_childclass(int a) throws ArithmeticException {
	} */
}
