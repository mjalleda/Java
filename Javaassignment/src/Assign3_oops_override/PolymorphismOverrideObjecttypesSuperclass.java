/* Description: Override rules are different for each Object which you create. So lets learn those rules. For this, we need two class.
 * Parent class: PolymorphismOverrideObjecttypesSuperclass
 * Child Class; PolymorphismOverrideObjecttypesSubclass
Relationships: PolymorphismOverrideObjecttypesSuperclass is parent, PolymorphismOverrideObjecttypesSubclass is childclass which is extending parent class.
In these two classes, we are going to learn  that method can be override in subclass, override focus on Object & its creation.
In parent class, we are creating 4 methods with different access specifier and all return 0 only.
But in child class, we are overriding them and providing different implementation. Remember we can change signature (method + arguments (types/order/numberof) ) too */

package Assign3_oops_override;
public class PolymorphismOverrideObjecttypesSuperclass {
	//1: Public method
	public int m1(int a, int b) {
		return 0;
	}
	//2: Protected method
	protected int m2(int a, int b) {
		return 0;
	}
	//3: default method
	int m3(int a, int b) {
		return 0;
	}
	//4: Private method
	private int m4(int a, int b) {
		return 0;
	}
}

