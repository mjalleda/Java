/* Description: How to override methods when they have different "Return Types". To learn this, we need four classes.
 Parent & Child class. In parents class, we write multiple methods with differnt returntypes and later we can override them in child's class.
Relationships: 
1: PolymorphismOverrideReturntypesSuperclass is parent and PolymorphismOverrideReturntypesSubclass is subclass.
2: PolymorphismOverrideReturntypesSuperclassAnimal is superclass and PolymorphismOverrideReturntypesSuperclassMonkey is subclass. Using them as returntypes in these assignments.
Using animal as a returntype in superclass, monkey returntype in subclass.*/
package Assign3_oops_override;
public class PolymorphismOverrideReturntypesSuperclassAnimal {
	public int legs = 4;
	public Boolean flies = false;
	public boolean wings = false;

	public static void main(String args[]) {
		PolymorphismOverrideReturntypesSuperclassAnimal a = new PolymorphismOverrideReturntypesSuperclassAnimal();
	}
}
