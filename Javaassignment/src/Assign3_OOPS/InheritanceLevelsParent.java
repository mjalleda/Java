/* Description: With Inhertiance concept, child class, and child's child (Grand Child) class can also access Parent's properties.
 To perform this action, I need three classes. 
 1: Parent: InheritanceLevelsParent
 2: Child : InheritanceLevelsChild
 3: GrandChild: InheritanceLevelsGrandChild
Relationships: 
- InheritanceLevelsParent is superclass, 
- InheritanceLevelsChild is subclass which is extending Parent class 
- Finally InheritanceLevelsGrandChild  which is extending child class.

Basically, In this parent's class , we show 
- When Child extends parent, it inherits parent's class methods&behaviors. 
- When grandchild extends childclass, it inherits both classes(parent's &Child's) methods&behaviors.
- To, show this In this class I created two methods. One is instance & another one is static. */
package Assign3_OOPS;
public class InheritanceLevelsParent {
	// Create a instance method
	public int m1(int a, int b, int c) {
		int d = a +b +c;
		return d;
	}
	
	// Create a static method
	public static int m2(int a, int c) {
		int f = a +c ;
		return f;
	}
}
