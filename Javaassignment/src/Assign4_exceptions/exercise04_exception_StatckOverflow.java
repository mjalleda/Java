// Generate: Generate StaticOverFlowException
package Assign4_exceptions;
public class exercise04_exception_StatckOverflow {

	public static void main(String args[]) {
		m1(10,5);
	}
	// ************ StaticOverFlowException  ******************//\
	// Basically m1 is calling m2 and m2 is calling m1, this is infinite loop, when stack becomes full it will return StatckOverFlowException.
	static void m1(int a, int b) {
		m2(10,5);
	}
	
	static void m2(int a, int b) {
		m1(10,5);
	}
}