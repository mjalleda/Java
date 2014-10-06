/* Description: What is the purpose of Multiplecatches.
Scenario1: Is password field blank ? If yes, return exception
Scenario2: Check if a/c has minimum balance other return exception\
In above two scenarios, we return some messages to user and extends the logic from there. */
package Assign4_exceptions;
public class exercise09_trymultiplecatches_purpose {

	public static void main(String args[]) {
		try {
			//Scenario1: Is password field blank ? If yes, return exception
			//Scenario2: Check if a/c has minimum balance other return exception
		} catch (ArithmeticException e) {
			System.out.println("Account minimum balance should be mainitianed");
			System.out.println("code to logout user or user stands at same page and tranasaction wont be happend");
		} catch (NullPointerException e1) {
			System.out.println("Password can't be blank, please enter password");
			// code to return this message.
		}
		
}
}
