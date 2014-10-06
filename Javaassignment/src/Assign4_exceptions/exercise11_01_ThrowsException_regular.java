//Description: How to use "Throws"
package Assign4_exceptions;
public class exercise11_01_ThrowsException_regular  {
	// 1: Any exceptions occured in mainmethod, JVM should handle since it is calling main method.
	public static void main(String args[]) throws Exception{
		//calling m1() method
		m1(12,3);
	}
	// 2: Any exceptions occured in m1() method, its caller(mainmethod) should handle
	static void m1(int a, int b) throws Exception {
		int k = 10/4;
		//calling m2() method
		m2(10,4);
	}
	// 3: Any exceptions occured in m2() method, its caller(m1() method) should handle.
	static void m2(int a, int b) throws Exception {
		int k = 10/0;
	}
}
