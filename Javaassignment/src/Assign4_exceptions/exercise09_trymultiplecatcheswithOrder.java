/* Description: Ordering of multiple catches.
1.1 Valid Ordering: Same level exceptions can be defined in multiplecatches.	ArithmeticException & NullPointerExceptions can be defined at samelevel.
1.2 Valid Ordering: Co-variant relationship can be defined. Which is child(NullPointerExceptions) & parent(Exception) relationship
1.3 In-Valid Ordering: parent(Exception) & child(NullPointerExceptions) relationship can't be defined.. 
Order: Either same level OR Co-variant relationship (child-parent relationship) can be defined. */

package Assign4_exceptions;
public class exercise09_trymultiplecatcheswithOrder {
	public static void main(String args[]) {
	//1.1 Valid Ordering: Same level exceptions can be defined in multiplecatches.	ArithmeticException & NullPointerExceptions can be defined at samelevel.
	try {
		int k = 10/0; // it should return arthemetic expression
		String s = "Mamta";
		s.charAt(10);  // it should return arthemetic expression
	} catch (ArithmeticException e) {
		System.out.println("Execute first catch for ArithmeticException");
	}  catch (NullPointerException e2 ) {
		System.out.println("Execute second catch for NullPointerException");
	}
	
	//1.2 Valid Ordering: Co-variant relationship can be defined. Which is child(NullPointerExceptions) & parent(Exception) relationship.
	try {
		int k = 10/0; // it should return arthemetic expression
		String s = "Mamta";
		s.charAt(10);  // it should return arthemetic expression
	} catch (NullPointerException e) {   // Child relationship.
		System.out.println("Execute first catch for ArithmeticException");
	}  catch (Exception e2 )// parent level relationship.  
	{ 
		System.out.println("Execute second catch for NullPointerException");
	}
	
	//1.3 In-Valid Ordering: parent(Exception) & child(NullPointerExceptions) relationship can't be defined..
	try {
		int k = 10/0; // it should return arthemetic expression
		String s = "Mamta";
		s.charAt(10);  // it should return arthemetic expression
	}  catch (Exception e2 )// parent level relationship.  
	{ 
		System.out.println("Execute second catch for NullPointerException");
	}   
	//uncomment below code to get error.
	/* catch (NullPointerException e) {   // Child relationship.
		System.out.println("Execute first catch for ArithmeticException");
	} */  
}
}