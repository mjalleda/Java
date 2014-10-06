/*Description: Throw custom exception using try & catch block. Without throws keyword.
Relationship. 
- You can find this in below code.
 - wrote custom exception in exercise11_03_ThrowsWithThrow_Subclass */

package Assign4_exceptions;
public class exercise11_03_Throw_withTryCatchBlcok_withoutThrows_Superclass {
	public static void main(String args[]) {
		try {
			int i =11;
			if(i>10) {
				exercise11_03_ThrowsWithThrow_Subclass Obj = new exercise11_03_ThrowsWithThrow_Subclass("Pass some value");
				throw Obj;	
			}
			  
		} catch (Exception e) {
			System.out.println("Catch exception without throws in superclass");
		}
	}
}
