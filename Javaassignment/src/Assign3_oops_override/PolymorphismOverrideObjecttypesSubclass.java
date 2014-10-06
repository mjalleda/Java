/* Description: Override rules are different for each Object which you create. So lets learn those rules. For this, we need two class.
 * Parent class: PolymorphismOverrideObjecttypesSuperclass
 * Child Class; PolymorphismOverrideObjecttypesSubclass
Relationships: PolymorphismOverrideObjecttypesSuperclass is parent, PolymorphismOverrideObjecttypesSubclass is childclass which is extending parent class.
In these two classes, we are going to learn  that method can be override in subclass, override focus on Object & its creation.
In parent class, we are creating 4 methods with different access specifier and all return 0 only.
But in child class, we are overriding them and providing different implementation. Remember we can change signature (method + arguments (types/order/numberof) ) too */
package Assign3_oops_override;
public class PolymorphismOverrideObjecttypesSubclass extends PolymorphismOverrideObjecttypesSuperclass {
	//1: Public method
	public int m1(int a, int b) {
		int c = a + b;
		return c;
	}
	//2: Protected method
	protected int m2(int a, int b) {
		int c = a *b;
		return c;
	}
	//3: default method
	int m3(int a, int b) {
		int c = a - b;
		return c;
	}
	//4: Private method
	private int  m4(int a, int b) {
		int c = a/b;
		return c;
	}
	
	public static void main(String args[]) {
		PolymorphismOverrideObjecttypesSubclass Obj1  = new PolymorphismOverrideObjecttypesSubclass();
		System.out.println("******************************************************");
		System.out.println("In this object both reference & Object type is subclass only. Since override looks for Object type, it executes subclass methods only. ");
		System.out.println("This should print public subclass method    : "+Obj1.m1(10, 5));
		System.out.println("This should print protected subclass method : "+Obj1.m2(10, 5));
		System.out.println("This should print default subclass method   : "+Obj1.m3(10, 5));
		System.out.println("This should print private subclass method   : "+Obj1.m4(10, 5));
		
		PolymorphismOverrideObjecttypesSuperclass Obj2  = new PolymorphismOverrideObjecttypesSubclass();
		System.out.println("******************************************************");
		System.out.println("This object is very interested where reference is parentclass and object is subclass. Since override looks for Object type, it executes subclass methods only. Remember complier looks for superclass methods but runtime executes subclass methods. Hence you can't access superclass private/final methods.");
		System.out.println("This should print public subclass method    : "+Obj2.m1(10, 5));
		System.out.println("This should print protected subclass method : "+Obj2.m2(10, 5));
		System.out.println("This should print default subclass method   : "+Obj2.m3(10, 5));
		//System.out.println("Since private superclass is not accessible, it is not printable : "+Obj2.m4(10, 5));
		
		PolymorphismOverrideObjecttypesSuperclass Obj3  = new PolymorphismOverrideObjecttypesSuperclass();
		System.out.println("******************************************************");
		System.out.println("In this object both reference & Object type is parentclass only. Since override looks for Object type, it executes subclass methods only. ");
		System.out.println("This should print public superclass method    : "+Obj3.m1(10, 5));
		System.out.println("This should print protected superclass method : "+Obj3.m2(10, 5));
		System.out.println("This should print default superclass method   : "+Obj3.m3(10, 5));
		//System.out.println("Since private superclass is not accessible, it is not printable : "+Obj3.m4(10, 5));
		System.out.println("******************************************************");
		}
	
}
