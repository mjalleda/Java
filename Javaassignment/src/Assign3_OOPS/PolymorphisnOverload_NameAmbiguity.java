/* Description: Here we learn: NameAmbiguity of overloadmethods. 
Which means, we use same name of method and overloads it multiple times and how?*/
package Assign3_OOPS;

public class PolymorphisnOverload_NameAmbiguity {
	//1: A method
	public static int m1(int a, int b) {
		int c = a + b;
		System.out.println("A method with two int arguements");
		return 0;
	}
	
	//1.1: same method + different type of argument
	public int m1(int a, float b) {
		System.out.println("1.1: same method + different type of argument added");
		float c = a + b;
		return 0;
	}
	
	//1.2: same method & but arguments order changed. So there is no ambiguity
	public int m1(float a, int b) {
		System.out.println("1.2: same method & but arguments order changed. So there is no ambiguity");
		float c = a*b;
		return 0;
	}
	
	//1.3: same method & completely different arguments. So no ambiguity.
	public float m1(float a, float b) {
		float c = a +b;
		System.out.println("1.3: same method & completely different arguments. So no ambiguity.");
		return 0;
	}
	
	// ambiguity errors
	//1.4: Methodname is same, arugments are also same > but return type is different (but it doesn't matter if returntypes are different in methodoverload).
	/*public float m1(int a, int b) {  // Name ambiguity error since methodname is same arugments are also same.
	return c;
	}*/

	/* //1.5: Methodname is same, arguments are also same > In this case, there is no return type so it conflicts with one of return types.
	public void m1(int a, int b) {
		float c = a +b;
		
	}*/
	
	// 1.6: Same method name + number of arguments are increased.
	public int m1(int a, int b, int c) {
	int d = a+b+c;
	System.out.println("Same method name + number of arugments increased");
	return 0;
	}
	
	public static void main(String args[]) {
		PolymorphisnOverload_NameAmbiguity obj1 = new PolymorphisnOverload_NameAmbiguity();
		System.out.println(obj1.m1(5,5));
		System.out.println(obj1.m1(5,5.4f));
		System.out.println(obj1.m1(1.2f,5));
		System.out.println(obj1.m1(5.3f,5.4f));
	}
}
