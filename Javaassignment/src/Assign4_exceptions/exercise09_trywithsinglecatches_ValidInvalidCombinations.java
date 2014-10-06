/* Description: Try, single catch & finally. Valid/invalid combinations.
1.1: Try doesn't exist by itself.
1.2: catch doesn't exist by itself.
1.3: finally doesn't exist by itself.
1.4: Valid combination: Try with final
1.5: Valid combination: Try with catch
1.6: Valid combination: Try, catch with finally
1.7: In-Valid combination: Catch with finally */

package Assign4_exceptions;
public class exercise09_trywithsinglecatches_ValidInvalidCombinations {
	public static void main(String args[]) {
	System.out.println("****************************************************");	
	System.out.println("scenario 1: finally executed when try has an exception");
	try {
		String s = "Mamta";
		s.charAt(10);
	} catch(Exception e) {
		System.out.println("Exception occured so catch block will execute");
	} finally {
		System.out.println("Finally executed in any case.");
	}
	
	System.out.println("****************************************************");
	//Scenario 2: finally executed when try doesn't have an exception 
	System.out.println("scenario 2: finally executed when try doesn't have an exception");
	try {
		String s = "Mamta";
		s.charAt(1);
	} catch(Exception e) {
		System.out.println("Exception is not occured, so catch block won't execute");
	} finally {
		System.out.println("Finally executed in any case.");	
	}

	//***********************************************************
	// 1.2: catch doesn't exist by itself.
	/* uncomment below code to get error.
	catch (Exception e) {
		System.out.println("None");
	}; */
	
	//***********************************************************
	//1.3: finally doesn't exist by itself.
	/* uncomment below code to get error.
	  finally {
	 
		System.out.println("None");
	} */
	
	//***********************************************************
	// 1.1: Try doesn't exist by itself.
	/* uncomment below code to get error. 
	 try {
		String s = "Mamta";
		s.charAt(10);
	} */ 
	
	//***********************************************************
	// 1.4: Validcombination: Try with final
	try {
		String s = "Mamta";
		s.charAt(10);
	}
	finally {
		System.out.println("None");
	}
	
	//***********************************************************
	// 1.5: Validcombination: Try with catch
	try {
		String s = "Mamta";
		s.charAt(10);
	}
	catch (Exception e) {
		System.out.println("None");
	}
	
	//***********************************************************
	// 1.6: Validcombination: Try, catch with finally
	try {
		String s = "Mamta";
		s.charAt(10);
	}
	catch (Exception e) {
		System.out.println("None");
	}
	finally {
		System.out.println("None");
	}
	
	//***********************************************************
	// 1.7: In-Validcombination: Catch with finally  
	/* //uncomment below code to get error.
	 * catch (Exception e) {
	 
		String s = "Mamta";
		s.charAt(10);
	}
	finally {
		System.out.println("None");
	} */
}
}

