/* Description: Multiplecatches and valid/invalid combinations of try, catch and finally.
1.1: Validcombination:    Try + catch + catch.
1.2: Validcombination:    Try + catch + catch + finally.  
1.3: In-validcombination: Try + catch + finally + catch.
1.4: In-validcombination: Try + finally + catch + catch
1.5: In-validcombination: Try + finally + finally + catch */

package Assign4_exceptions;
public class exercise09_trywithmultiplecatches_ValidInvalidCombinations {

	public static void main(String args[]) {
		//****************************************************************************************************//
		// 							MULTIPLE CATCHES
		//****************************************************************************************************//
		// 1.1: Validcombination: Try + catch + catch.  
		try {
			int k = 10/0; // it should return arthemetic expression
			String s = "Mamta";
			s.charAt(10);  // it should return arthemetic expression
		} catch (ArithmeticException e) {
			System.out.println("Execute first catch for ArithmeticException");
		}  catch (NullPointerException e2 ) {
			System.out.println("Execute second catch for NullPointerException");
		}
		
		// 1.2: Validcombination: Try + catch + catch + finally.  
		try {
			int k = 10/0; // it should return arthemetic expression
			String s = "Mamta";
			s.charAt(10);  // it should return arthemetic expression
		} catch (ArithmeticException e) {
			System.out.println("Execute first catch for ArithmeticException");
		}  catch (NullPointerException e2 ) {
			System.out.println("Execute second catch for NullPointerException");
		}
		finally  {
		System.out.println("Execute finally if exception found/notfound.");
		}
		
		// 1.3: In-validcombination: Try + catch + finally + catch.  
		try {
			int k = 10/0; // it should return arthemetic expression
			String s = "Mamta";
			s.charAt(10);  // it should return arthemetic expression
		} catch (ArithmeticException e) {
			System.out.println("Execute first catch for ArithmeticException");
		}
		finally  {
		System.out.println("Execute finally if exception found/notfound.");
		}
		/* uncomment below code to get error.
		catch (NullPointerException e2 ) {
			System.out.println("Execute second catch for NullPointerException");
		} */
	
		// 1.4: In-validcombination: Try + finally + catch + catch  
		try {
			int k = 10/0; // it should return arthemetic expression
			String s = "Mamta";
			s.charAt(10);  // it should return arthemetic expression
		}  finally  {
			System.out.println("Execute finally if exception found/notfound.");
		} 
		/* uncomment below code to get error.
		catch (ArithmeticException e) {
			System.out.println("Execute first catch for ArithmeticException");
		}  
		catch (NullPointerException e2 ) {
			System.out.println("Execute second catch for NullPointerException");
		} */ 
		
		// 1.5: In-validcombination: Try + finally + finally + catch  
		try {
			int k = 10/0; // it should return arthemetic expression
			String s = "Mamta";
			s.charAt(10);  // it should return arthemetic expression
		}  
		/* uncomment below code to get error.
		 finally  {
			System.out.println("Execute finally if exception found/notfound.");
		} 
		finally  {
			System.out.println("Execute finally if exception found/notfound.");
		} */ 
		catch (ArithmeticException e) {
			System.out.println("Execute first catch for ArithmeticException");
		}  
		catch (NullPointerException e2 ) {
			System.out.println("Execute second catch for NullPointerException");
		}
}
}
