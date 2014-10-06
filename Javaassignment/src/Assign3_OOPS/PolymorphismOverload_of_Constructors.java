/* Description: Basically, here we learn on how to overload a constructor. */

package Assign3_OOPS;

public class PolymorphismOverload_of_Constructors {
	//Original constructor
	PolymorphismOverload_of_Constructors() {
		System.out.println("1.1: regular constructor");
	}
	
	//overload constructor by passing an argument
	PolymorphismOverload_of_Constructors(int a) {
		System.out.println("1.2: Constructor with int a");
	}
	
	//overload constructor by passing a diff argument
	PolymorphismOverload_of_Constructors(float b) {
		System.out.println("1.3: Constructor with float b");
	}
	
	//overload constructor by passing a diff number of arguments
	PolymorphismOverload_of_Constructors(int a, float b) {
		System.out.println("1.4: Constructor with both int a, float b");
	}
	
	public static void main(String[] args) {
		PolymorphismOverload_of_Constructors Obj1 = new PolymorphismOverload_of_Constructors();
		System.out.println(Obj1);
		
		PolymorphismOverload_of_Constructors Obj2 = new PolymorphismOverload_of_Constructors(5);
		System.out.println(Obj2);
		
		PolymorphismOverload_of_Constructors Obj3 = new PolymorphismOverload_of_Constructors(1.4f);
		System.out.println(Obj3);
		
		PolymorphismOverload_of_Constructors Obj4 = new PolymorphismOverload_of_Constructors(1,2.3f);
		System.out.println(Obj4);
		
	}
}
