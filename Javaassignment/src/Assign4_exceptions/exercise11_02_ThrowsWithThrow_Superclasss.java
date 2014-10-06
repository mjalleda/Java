/* Description:  Calling custom exception using throws.
Below, there are two scenarios, you can't execute both scenarios at one time, comment out one each time and execute.
Calling custom exception using throws.
We need two classes. Parent & Child. This is parent class. 
Relationship: exercise11_ThrowsWithThrow_Subclass has constructor & exercise11_ThrowsWithThrow_Superclass using this constructor.
*/
package Assign4_exceptions;
public class exercise11_02_ThrowsWithThrow_Superclasss {

	public static void main(String args[]) {
		m1(30,0);
		m2(30,0);
	}
	//Scenario1: Here we are still returning custom exception but throw
	// Result: Even you still call customexception, arithameticexception will be returned since you are not throwing reference c. 
	static void m1(int a, int b) throws exercise11_03_CustomException {
		if(b==0) {
		exercise11_03_CustomException c = new exercise11_03_CustomException("pass");
		}
		int k = a/b;
	}
	
	//Scenario2: Here we are still returning custom exception but throw
	// Result: Since you are throwing reference c, it will execute customeexception not arithametic.
	static void m2(int a, int b) throws exercise11_03_CustomException {	
	if(b==0) {
		exercise11_03_CustomException c = new exercise11_03_CustomException("pass");
		System.out.println("1: \n");
		c.printStackTrace();
		System.out.println("2: \n");
		c.getMessage();
		System.out.println("3: \n");
		c.toString();
		throw c;
		}
		//int k =a/b;
	}
}
