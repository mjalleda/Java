/* Description: In this class, we learn: 
1: Declaration of primitive and Wrapper classes objects.
2: Difference between Primitive and wrapper classes. */

package Assign2_javalang;

public class Javalang_WrapperClass {
	//1: Declaration of primitive datatypes.
	public static void main(String args[]) {	 
		short s1 = 3;
		byte b1 = 3;
		int i1 = 10;
		char c1 = 'd';
		float f1 = 18f;
		double d1 = 13.88;
		long l1 = 330l;
		
		//2: Declaration of WrapperClasses.
		Short s2 = new Short(s1);
		Byte b2 = new Byte(b1);
		Integer i2 = new Integer(i1);  // OR Integer i3 = new Integer(90);
		Float f2 = new Float(f1);  // OR Float f3 = new Float(90.8f);
		Double d2 = new Double(d1); // OR Double d3 = new Double(90.99);
		Long l2 = new Long(l1); 	// OR Long l3 = new Long(39838389);
	
		//2: Difference between primitive and wrapper classes. You can't get wrapper class methods for primitive datatypes. 
		//s1. //Short s1 can't get methods.
		s2.byteValue(); //Where short object s2 get all methods like s2.getClass(); s2.compareTo(anotherShort);
		//i1. //Short i1 can't get methods.
		i2.getClass(); //Where short object s2 get all methods like i2.intValue(); i2.wait();
		// Same for others like byte, char, float, double and long.
	}
}
