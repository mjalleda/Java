/* Description: How to call Custom exceptions from different class. Here, we need to generate these two exceptions in Superclass and need to call them in subclass.
This is super class.
Relationship: exercise10_customExceptions_Superclass is calling two custom exceptions.
you are calling those two custom exceptions using throw keyword in superclass */
package Assign4_exceptions;
public class exercise10_customExceptions_Superclass {
	public static void main(String args[])
	{
		int m1 = m1(3,3);
		if(m1<85) {
			// creating a new reference c1 for customeexception 1
			exercise10_customeExceptions_Subclass1 c = new exercise10_customeExceptions_Subclass1("Pass");
			throw c; 
		} 
		else  if (m1>85){
			// creating a new reference c2 for customeexception 2
			exercise10_customeExceptions_Subclass2 c1 = new exercise10_customeExceptions_Subclass2("Pass");
			throw c1; 
		}	
		int m2 = m1(10,3);
	}
	
	static int m1(int a, int b) {
		System.out.println("Print m1 method");
		return 0;
	}
}