/* Description: Throw custom exception using throws keyword. Without catching in trycatch block.
Relationship. Wrote this in below & wrote custom exception in exercise11_03_ThrowsWithThrow_Subclass */

package Assign4_exceptions;
public class exercise11_03_Throw_withThrows_withoutTryCatchBlock_Superclass {	
		
	public static void main(String args[]) throws Exception {
		System.out.println("Main method doesn't want handle exception so returned to JVM");
		exercise11_03_Throw_withThrows_withoutTryCatchBlock_Superclass.m1(10);
	}
	
	static void m1(int a) throws Exception {
	int i =11;
	if(i>10) {
		System.out.println("m1 method doesn't want handle exception so returned to main method");
		exercise11_03_CustomException Obj1 = new exercise11_03_CustomException("Pass some value");
		throw Obj1;	
		
	}
	}
}


