/*Description: Catch ArthemeticException in catch block.*/

package Assign4_exceptions;
public class exercise01_trycatch_arthemeticone {
	static int i = 10;
	static int j = 20;
	
	//Main, calling m3 method. In order to look 
	public static void main(String args[]) {
		m1(10,0);
		System.out.println("after calling m2 method\n");
	}
	// capturing arthemetic exceptions.
	static int m1(int i, int j) {
	try { 
		int k = i/j;
	} catch (Exception e) {
		System.out.println ("Capturing arthemetic expression in catch block\n");	
		e.printStackTrace(); // printing how the exception looks like
	}
	return 1;
	}
	
}
