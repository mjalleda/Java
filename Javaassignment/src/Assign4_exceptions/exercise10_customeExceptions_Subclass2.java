/* Description: How to call Custom exceptions from different class. Here, we need to generate these two exceptions in Superclass and need to call them in subclass.
This is sub class.
Relationship: exercise10_customExceptions_Superclass is calling two custom exceptions.
you are calling those two custom exceptions using throw keyword in superclass */
package Assign4_exceptions;
public class exercise10_customeExceptions_Subclass2 extends RuntimeException {
	
	exercise10_customeExceptions_Subclass2(String s) {
		super(s);
		System.out.println("Custome exception subclass2");
		
	}

}
