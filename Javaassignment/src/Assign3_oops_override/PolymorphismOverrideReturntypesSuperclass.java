/* Description: How to override methods when they have different "Return Types". To learn this, we need four classes.
 Parent & Child class. In parents class, we write multiple methods with differnt returntypes and later we can override them in child's class.
Relationships: 
1: PolymorphismOverrideReturntypesSuperclass is parent and PolymorphismOverrideReturntypesSubclass is subclass.
2: PolymorphismOverrideReturntypesSuperclassAnimal is superclass and PolymorphismOverrideReturntypesSuperclassMonkey is subclass. Using them as returntypes in these assignments.
Using animal as a returntype in superclass, monkey returntype in subclass.

1: In this  assignment we learn on "how to write return types for override methods in subclasss".
2: In parent's class, we are creating 2 methods each for ObjectAPI & Animal classes. 
3: Rule: If superclass method has one returntype, we can decrease that returntype for that method in subclass or we can also have same level of returntype.
4: For ex: String/Math API classes are a level below of OBJECTAPI class. So we can use either Object or String in Subclass.
5: But in child class, we are overriding them and providing different implementation. Remember override is, we can change signature (method + arguments (types/order/numberof) )
*/
package Assign3_oops_override;
public class PolymorphismOverrideReturntypesSuperclass {
	
	//1.1: Returntype of ObjectAPIClass - 1st method
	public Object m1(int a, int b) {
		int c = a + b;
		return c;
	}
	
	//1.2: Returntype of ObjectAPIClass  - 2nd method
	public Object m2(int a, int b) {
		int c = a + b;
		return c;
	}
	
	//1.3: Returntype of ObjectAPIClass  - 3rd method
	public Object m5(int a, int b) {
		int c = a + b;
		return c;
	}
	
	//2.1: Returntype of AnimalClass - 1st method
	public PolymorphismOverrideReturntypesSuperclassAnimal m3(PolymorphismOverrideReturntypesSuperclassAnimal a) {
		//System.out.println("This is parent class");
		return a;
	}
	
	//2.2: Returntype of AnimalClass - 2nd method
	public PolymorphismOverrideReturntypesSuperclassAnimal m4(PolymorphismOverrideReturntypesSuperclassAnimal a) {
		//System.out.println("This is parent class");
		return a;
	}
}
