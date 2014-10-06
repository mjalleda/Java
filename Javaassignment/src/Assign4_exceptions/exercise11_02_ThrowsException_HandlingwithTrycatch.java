//Description: How to handle throws with Try&Catch block

package Assign4_exceptions;
public class exercise11_02_ThrowsException_HandlingwithTrycatch {
	// 1: Any exceptions occured in mainmethod, JVM should handle since it is calling main method.
	public static void main(String args[]) throws Exception {
		//calling m1() method
		try {
			m1(12,3);
		} catch (Exception e) {
			System.out.println("Handle exceptions here");
		}
		m3(309,33);
	}
	// 2: Any exceptions occured in m1() method, its caller(mainmethod) should handle
	static void m1(int a, int b) throws Exception {
		//calling m2() method
		m2(10,4);
	}
	// 3: Any exceptions occured in m2() method, its caller(m1() method) should handle.
	static void m2(int a, int b) throws Exception {
		int k = 10/0;
	}
	// 4: A regualr m4 method
	static void m3(int a, int b) throws Exception {
		int k = 10/8;
		System.out.println("Please print this since main handled exceptions");
	}
}
