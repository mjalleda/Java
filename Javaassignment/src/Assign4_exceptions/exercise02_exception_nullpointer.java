/*Description: Generate NullPointer Exception*/
package Assign4_exceptions;
import Assign4_exceptions.exercise02_exception_nullpointer;
public class exercise02_exception_nullpointer {
	// just create a reference but don't add object to it)
	static exercise02_exception_nullpointer np;
	int k =0;
		// *****************  NULLPOINTER EXCEPTION ***********************//
	public static void main(String args[]) {
		int a = 100; 
			if (a < 2 ) {
				// now adding object to the reference, so object creation is successfully done now.
				np = new exercise02_exception_nullpointer();
			}
			// Since a is not < 2, so object willnot created and below line will throw nullpointer exception.
			np.k=100;
	}
}
