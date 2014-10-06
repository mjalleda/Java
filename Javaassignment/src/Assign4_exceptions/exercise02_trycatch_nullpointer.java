/* Description: capture nullpointer exception in try catch block */

package Assign4_exceptions;
import Assign4_exceptions.exercise02_trycatch_nullpointer;
public class exercise02_trycatch_nullpointer {
	// Creating a reference for an object but object is not added to it yet.
	static exercise02_trycatch_nullpointer np;
	int i = 10;
	int j = 20;

	// Main
	public static void main(String args[]) {
		m1(10, 5);
		// capturing nullpointer exceptions.
		try {
			np.i = 100;
		} catch (Exception e) {
			System.out.println("can't intialize object since object creation was not done");
			// print the exception that you caught 
			e.printStackTrace();
		}
	}

	static void m1(int i, int j) {
		int k = i / j;
		if (k < 0) {
			// Here completing the creation of object.
			np = new exercise02_trycatch_nullpointer();
		}
	}
}
