//Description: How to create a ArithameticException 

package Assign4_exceptions;
public class exercise01_exception_arthemeticone {
	
	// *****************  ARTHEMETIC EXCEPTION ***********************//
	public static void main(String args[]) {
		int a = 10;
		int b = 0;
		System.out.println("Before exception occurs");
			if (a/b>0) {
				System.out.println("inside if loop");
			}
		// below line willn't print since control will stop when execution occurs. 	
		System.out.println("Before exception occurs");
	}
}
