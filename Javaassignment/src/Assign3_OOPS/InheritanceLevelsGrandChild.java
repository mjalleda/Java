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
- This class only extended Child's class but it could access both (Parent's & Child's) methods. */


package Assign3_OOPS;

public class InheritanceLevelsGrandChild extends InheritanceLevelsChild {
	public static void main(String[] args) {
		// Creating objects for all three parent, child and grandchild
		InheritanceLevelsParent ParentObject = new InheritanceLevelsParent();
		InheritanceLevelsChild ChildObject = new InheritanceLevelsChild();
		InheritanceLevelsGrandChild GrandChild = new InheritanceLevelsGrandChild();
		
		//calling parent's static methods by using all three parent's, child's and grandchild's objects.
		ParentObject.m1(10,20,30);
		ChildObject.m1(10,30,40);
		GrandChild.m1(10,20,30);
		
		//calling parent's instance methods by using all three parent's, child's and grandchild's objects.
		ParentObject.m2(3,3);
		ChildObject.m2(1,2);
		GrandChild.m2(1,2);
		
		//calling child's static methods by using both child's and grandchild's object.
		ChildObject.m3(3);
		GrandChild.m3(3);
		
		//calling grandchild's instance methods by using both child's and grandchild's object. 
		ChildObject.m4(7);
		GrandChild.m4(8);
	}
}
