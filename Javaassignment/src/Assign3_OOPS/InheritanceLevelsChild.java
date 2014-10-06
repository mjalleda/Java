/* Description: With Inhertiance concept, child class, and child's child (Grand Child) class can also access Parent's properties.
 To perform this action, I need three classes. 
 1: Parent: InheritanceLevelsParent
 2: Child : InheritanceLevelsChild
 3: GrandChild: InheritanceLevelsGrandChild
Relationships: 
- InheritanceLevelsParent is superclass, 
- InheritanceLevelsChild is subclass which is extending Parent class 
- Finally InheritanceLevelsGrandChild  which is extending child class.

Basically, In this child class, 
- I created object for both Parent's class & Child's class.
- With both Objects, I can access parent's methods.  */
package Assign3_OOPS;
public class InheritanceLevelsChild extends InheritanceLevelsParent {
	public static void main(String[] args) {
	
	// Creating objects for both parent & child
	InheritanceLevelsParent ParentObject = new InheritanceLevelsParent();
	InheritanceLevelsChild ChildObject = new InheritanceLevelsChild();
	
	// calling parent's instance methods by using both parent & child reference
	ParentObject.m1(10,20,30);
	ChildObject.m1(10,20,30);
	
	// calling parent's static methods  by using both parent & child reference
	ParentObject.m2(1,2);
	ChildObject.m2(1,2);
	}
	
	// creating static and instance methods in child.
	public static int m3(int a) {
		return 0;
	}
	public void m4(int a) {
	}
}
