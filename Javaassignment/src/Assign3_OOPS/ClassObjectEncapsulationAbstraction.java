/*   Description: Here, we learn about Class, Object, Abstration & Encapsulation.
 Class: Class is nothing but a blueprint, it represents a house, person, animal. 
Object: Is an actual refernece for all variables/methods in memory.
Abstraction: Hiding variables/methods/implementation of a class is called Abstraction, means everything should be defined as private.
Encapsulation. If all variables/methods in a class are declared as private, that class is called tightly encapsulated. */
package Assign3_OOPS;
public class ClassObjectEncapsulationAbstraction { // this class is an abstraction class and it is fully encapsulated since you used only private access modifier for all variables/methods.
	public static void main(String args[]) {
		m1(5);
		ClassObjectEncapsulationAbstraction obj1 = new ClassObjectEncapsulationAbstraction();
	}
	
	//static method.
	static private int b;
	static private void m1(int x) {
		x = 120;
		b = 99;
	}
	
	//Instance methods
	private int a;
	private int m2(int b, int c) {
		a = b+c;
		return 0;
	}
}
