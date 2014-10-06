//Assignment: What happens when throw is there and not there.
//You can't execute both scenarios at one time, commentout one each time and execute.
//Calling custom exception using throws.

//Relationship: exercise11_ThrowsWithThrow_Subclass has constructor & exercise11_ThrowsWithThrow_Superclass using this constructor.

package Assign4_exceptions;
public class exercise11_03_CustomException extends RuntimeException {
	
	exercise11_03_CustomException(String s) {
		super(s);
		System.out.println("Custom excpetion from subclass");
		
	}

}
