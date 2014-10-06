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
public class PolymorphismOverrideReturntypesSubclass extends PolymorphismOverrideReturntypesSuperclass {
	
	//1: You can decreases the returntypes in subclass. Objectreturntype can be declared as it's low levels String/Math
	//1.1: Override m1 method & declaring returntype as StringAPI - since StringAPI is lower than ObjectAPI 
	public String m1(int a, int b) {
		int c = a + b;
		return "none" ;
	}
	
	//1.2: Override m2 method & declaring returntype as MathAPI - since MathAPI is lower than ObjectAPI
	public Math m2(int a, int b) {
		int c =   a+b;
		return null;
	}
	
	//1.3: Override m5 method & declaring returntype as ObjectAPI - since same level/same class returntype.
	public Object m5(int a, int b) {
		int c =   a+b;
		return null;
	}
	
	//1.4: Override m3 method & declaring returntype as AnimalClass - since sameclass name is allowed
	 public PolymorphismOverrideReturntypesSuperclassAnimal m3(PolymorphismOverrideReturntypesSuperclassAnimal a) {
		 //System.out.println("This is child class");
		return null;
	}  
	
	//1.5: Override m4 method & declaring returntype as MonkeyClass - since MonkeyClass is lower than AnimalClass
	public PolymorphismOverrideReturntypesSuperclassMonkey m4(PolymorphismOverrideReturntypesSuperclassAnimal a) {
		//System.out.println("This is child class");
		return null;
	}
	
	public static void main(String args[]) {
		PolymorphismOverrideReturntypesSuperclass Obj1 = new PolymorphismOverrideReturntypesSuperclass();
		System.out.println(" ********************* PRINTING FROM SUPERCLASS **************************");
		System.out.println("Return objecttypeclass method, here it is superclass. Which is ObjectAPIClass  : "+Obj1.m1(10,20));
		System.out.println("Return objecttypeclass method, here it is superclass. Which is ObjectAPIClass  : "+Obj1.m2(10,20));
		System.out.println("Return objecttypeclass method, here it is superclass.Which is AnimalClass      : "+Obj1.m3(null));
		System.out.println("Return objecttypeclass method, here it is superclass.Which is AnimalClass      : "+Obj1.m4(null));
		
		System.out.println(" ********************* PRINTING FROM SUBCLASS **************************");
		PolymorphismOverrideReturntypesSuperclass Obj2 = new PolymorphismOverrideReturntypesSubclass();
		System.out.println("Return objecttypeclass method, here it is superclass. Which is ObjectAPIClass  : "+Obj2.m1(10,20));
		System.out.println("Return objecttypeclass method, here it is superclass. Which is ObjectAPIClass  : "+Obj2.m2(10,20));
		System.out.println("Return objecttypeclass method, here it is superclass.Which is AnimalClass      : "+Obj2.m3(null));
		System.out.println("Return objecttypeclass method, here it is superclass.Which is AnimalClass      : "+Obj2.m4(null));
		
	}
}
