/* Description: How to convert StringDatatype to Primitive && How to convert to Wrapper Type.
At high level, we can declare variables/objects string type, primitive type and wrapper classes type.
before java 1.5, you couldn't covert primitive --> wrapper & Wrapper --> to primitive. You had to use some methods for this covertion.
But with java 1.5, java can directly convert these, no need to use any special methods.

Before java 1.5: Total we have here 3 categories with 2 types each. They are
-- 1: String API --> Primitive & Primitve --> String API.
-- 2: Wrapper --> String API & String API --> Wrapper. 
-- 3: Primitive --> Wrapper & Wrapper --> Primitive.

With java 1.5,  So total we have here 2 categories with 2 types each. Since third one can directly do it. 
-- String API --> Primitive & Primitve --> String API.
//-- Wrapper --> String API & String API --> Wrapper.  */
package Assign2_javalang;
public class Javalang_StringToPrimitiveToWrapper {
	public static void main(String args[]) {
	// ############################################################# //
	//1: convertion: String API --> Primitive & Primitive --> String API.
	//1.1: First declarartion.
	String s1 = new String("100");
	int i1 = 100;		

	//1.2: String API --> Primitive. You can use parseInt, parseDouble, parseLong methods.
	int i12=Integer.parseInt(s1); //s2 is StringAPI object.
	System.out.println("1.1: StringAPI --> Priitive: "+i12); // that means a string variable containing integer value. //remember we cant covert integer value to some string value like abc, we are just putting int value in string variable type.
	
	//1.3: Primitive --> String API. You have to use only toString method.
	String s12= Integer.toString(i1); //i2 is primitive int type.
	System.out.println("1.2: primitive --> StringAPI: "+s12); // that means a string variable containing integer value. 
	// ############################################################# //
	
	// ############################################################# //
	//2: Wrapper --> String API & String API --> Wrapper.
	//2.1: First declarartion.
	String s2 = new String("100");
	Integer i2 = new Integer(200);
	
	//2.2: Wrapper --> String API. You have to use only toString method.
	String s22= Integer.toString(i2);  //i1 is Javalang_WrapperClass Integer object.
	System.out.println("2.1: Wrapper --> String API: "+s22); // that means a string variable containing wrapperclass integer value. 
	
	//2.3: String API --> Wrapper. You can use valueof.
	Integer i23 = Integer.valueOf(s2);
	System.out.println("2.2: String API --> Wrapper: "+i23); // that means a string variable containing wrapperclass integer value.
	// ############################################################# //
	
	// ############################################################# //
	//-- 3: Primitive --> Wrapper & Wrapper --> Primitive.
	//3.1: First declarartion.
	int i31 = 333;
	Integer i32 = new Integer(400);
	
	//3.2: Primitive --> Wrapper // Directly pass integer value in constructor.
	Integer i33 = new Integer(i31);  //
	System.out.println("3.1: Primitive --> Wrapper:"+i33); // that means a string variable containing wrapperclass integer value.
	//3.3: Wrapper --> Primitive
	Integer i34 = Integer.valueOf(i32); 
	System.out.println("3.2: Wrapper --> Primitive:"+i34);
	// ############################################################# //
	}
}