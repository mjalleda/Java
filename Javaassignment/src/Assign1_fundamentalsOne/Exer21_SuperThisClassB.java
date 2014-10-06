/* Description: How to use "Super" &"This" . I explained this with help of two classes.
Relationship:Exer13_SuperThisClassA is superclass & Exer13_SuperThisClassB is subclass.
Goal is to print both superclass& subclass methods by super & this keyword in subclass.  */

package Assign1_fundamentalsOne;
public class Exer21_SuperThisClassB extends Exer21_SuperThisClassA {
	public int a = 100;
	public int b = 200;
	
	public static int m1(int a) {
		System.out.println("print subclass instance class");
		return 0;
	}
	public int m2(int b) {
		System.out.println("print subclass static class");
		return 0;
	}
	public static void main(String args[]) {
		Exer21_SuperThisClassA Obj1 = new Exer21_SuperThisClassA();
		Exer21_SuperThisClassB Obj2 = new Exer21_SuperThisClassB();
	}
	{
		//Use Super and print from superclass
		System.out.println("-------------------------------------------");
		System.out.println("Static variable from superclass: "+super.b);
		System.out.println("Instance variable from superclass: "+super.a);
		System.out.println(super.m1(4));
		System.out.println(super.m2(6));
		System.out.println("-------------------------------------------");
		// Use THIS and print from sameclass
		System.out.println("Instance variable from superclass: "+this.a);
		System.out.println("Static variable from superclass: "+this.b);
		System.out.println(this.m1(6));
		System.out.println(this.m2(10));
		System.out.println("-------------------------------------------");
	}
}
