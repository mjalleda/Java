/* Description:  Calling custom exception using throws.
We need two classes. Parent & Child. This is parent class. 
Relationship: exercise11_ThrowsWithThrow_Subclass has constructor & exercise11_ThrowsWithThrow_Superclass using this constructor.
*/
package Assign4_exceptions;
public class exercise11_03_ThrowsWithThrow_Subclass extends RuntimeException {
	
	exercise11_03_ThrowsWithThrow_Subclass(String s) {
		super(s);
		
	}

}
