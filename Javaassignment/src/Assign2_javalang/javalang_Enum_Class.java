/* Description: Create an object for ENUM  and how to use its values. 
 * Relationship: javalnag_Enum_Month.java & Javalang_Enum_Class.java 
 * In this class, created an object for class "Javalang_Enum_Month" */
package Assign2_javalang;
public class javalang_Enum_Class {
	public static void main(String[] args) {
		// Method 1: Get size of enum class and return all constants from enum class.
		System.out.println("********************************************");
		javalang_Enum_Month[] s = javalang_Enum_Month.values();
		for(int i=0;i<s.length;i++) {
			 System.out.println("The values from Enum class are : "+s[i]);
		}
		
		//Month 2: Get some constant into reference m.
		System.out.println("********************************************");
		javalang_Enum_Month m = javalang_Enum_Month.Feb;
		System.out.println("The reference m constant refers to : "+m);
		
		//Method 3: on reference run switch statment.
		System.out.println("********************************************");
		switch(m) {
		case Jan:
			System.out.println("Too Cold");
			break;
		case Feb:
			System.out.println("Too hot");
			break;
		case December:
			System.out.println("Very Very cold");
			break;
		}
}
}