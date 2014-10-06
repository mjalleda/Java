/* Description: This assignment talks about -
-- how to use API classes as arguments in methods
-- how to overload those methods */

package Assign3_OOPS;
public class PolymorphismOverload_of_APIClasses {
	//1.1: Passing Object api
	public static int m1(Object o) {
		System.out.println("Print object");
		return 0;
	}
	//1.2: Passing string api
	public static int m1(String a) {
		System.out.println("Print String");
		return 0;
	}
	
	public static void main(String[] args){
		PolymorphismOverload_of_APIClasses obj1 = new PolymorphismOverload_of_APIClasses();
		System.out.println(m1(obj1));		
		System.out.println(m1("laxmi"));
		System.out.println(m1(null)); // it prints string api, since String API is the lowest subAPI in the class. 
	}
}
