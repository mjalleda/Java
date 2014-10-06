/* Description: How to increase visibility for access modifiers in Sub class? 
 To learn this, I need two classes. One is parent/super & child/sub class. 
 Where child extends parents class. 
 
Relationships: PolymorphismOverrideDatatypeSuperclass is parent and PolymorphismOverrideDatatypeSubclass is subclass
Rule: If superclass method has one accessmodifier, we can increase that accessmodifier/visibility for that method subclass.
1; Public - can be public in subclass
2: Protected - can be protected/public in subclass 
3: default - can be default/protected/public in subclass
4: Private - can't be visible from outside ofthe class so it can't override
5: Final - Final means final implementation, you can't override this method too
6: static - can be override
7: abstract - can be override (obviously you need to provide implementation).
8: Synchronized - can be overrided.

Note: With triangle (facing up) icon, left side of method represents this method is override.
In override concept, basically it executes referencetypeclass static methods not objecttypeclass static methods.
Even though a static method is already override, but compiler still executes reference type class method only. Why? because instance class usually created when object is created but static are called before object is crated. */ 
		


package Assign3_oops_override;
public class PolymorphismOverrideDatatypeSubclass extends PolymorphismOverrideDatatypeSuperclass {
	
	//*******************************  PUBLIC METHODS  ************************************************************ //
	//1: protected methods
	//1.1: Positive scenario: We can define the same level accessmodifier/visibility for override method, which is defined as public in superclass & in subclass.
	public int z1(int a, int b) {
		int c = a + b;
		return c;
	}
	//1.2: Error scenario: Since we can't reduce the visibility of overrided method, it gives an error. In superclass, this method is defined as public, so in subclass it should be public only.
	/*protected int z1(int a, int b) {
		int c = a + b;
		return c;
	}
	
	//1.3: Error scenario: Since we can't reduce the visibility of overrided method, it gives an error. In superclass, this method is defined as public, so in subclass it should be public only.
	 int z1(int a, int b) {
		int c = a + b;
		return c;
	} */
	
	//*******************************  PROTECTED METHODS  ************************************************************ //
	//2.1: Positive scenario: increasing accessmodifier/visibility for override method, which is defined as protected in superclass & pubic in subclass.
	public int protectedmet1(int a, int b) {
		int c = a *b;
		return c;
	}
	
	//2.2: Positive scenario: We can also define the same level accessmodifier/visibility for override method, which is defined as protected in superclass & in subclass.
	protected int protectedmet2(int a, int b) {
		int c = a % b;
		return c;
	}
	
	//2.3: Error scenario: Since we can't reduce the visibility of overrided method, it gives an error. In superclass, this method is defined as protected, so in subclass it should be public or protected, can't be default.
	/* int protectedmet3(int a, int b) {
		int c = a % b;
		return c;
	} */
	
	//*******************************  DEFAULT METHODS  ************************************************************ //
	//3.1: Positive scenario: increasing accessmodifier/visibility for override method, which is defined as default in superclass & pubic in subclass.
	public int defaultmet1(int a, int b) {
		int c = a - b;
		return c;
	}
	//3.2: Positive scenario: increasing accessmodifier/visibility for override method, which is defined as default in superclass & protected in subclass.
	protected int defaultmet2(int a, int b) {
		int c = a - b;
		return c;
	}
	//3.3: Positive scenario: we can also define the same level of accessmodifier/visibility for override method, which is defined as default in superclass & in subclass.
	int defaultmet3(int a, int b) {
		int c = a - b;
		return c;
	//Note: we can't define default parent methods as private subclass, since a private becomes a private class and it can't really worry about parent class, it treated as local method in the subclass
	}
	
	//*******************************  FINAL METHODS  ************************************************************ //
	//5.1: Error scenario: we can't override final methods.
	/* final public int finalmet(int a, int b) {
		int c = a - b;
		return c;
	} */
	
	//5.2: Positive scenario: A non final method can be declared as a final method in subclass, that means, it is the final implementation.
	final public int nonfinalmet(int a, int b) {
		int c = a - b;
		return c;
	}
	
	//*******************************  STATIC METHODS  ************************************************************ //
	//6.1: Positive scenario: we can override static methods.
	static public int staticmet(int a, int b) {
		int c = a - b;
		return c;
	} 
	
	//*******************************  SYNCHRONIZED METHODS  ************************************************************ //
	//7.1: Positive scenario: A synchronizedmethod can be declared as non-synchronized in subclass.
	synchronized public int synchronizedmet(int a, int b) {
		int c = a - b;
		return c;
	}
	
	//7.2: Positive scenario: A non_synchronizedmethod can be declared as synchronized in subclass.
	synchronized public int non_synchronizedmet(int a, int b) {
		int c = a - b;
		return c;
	}
	
	public static void main(String args[]) {
		// ***********************  EXECUTING STATIC METHODS ********************************//
		// In override concept, basically it executes referencetypeclass static methods not objecttypeclass static methods.
		// Eventhough a static method is overrided, but compiler still executes reference type class method only. Why? because instance class usually created when object is created but static are called before object is crated. 
		
		//1: reference type is parentclass & objecttype is parentclass
		PolymorphismOverrideDatatypeSuperclass Obj1 = new PolymorphismOverrideDatatypeSuperclass();
		int k1 = Obj1.staticmet(20,15); 
		System.out.println("It calls parent static method since reference type is parent: "+k1);
		
		//2: reference type is parentclass & objecttype is childclass
		PolymorphismOverrideDatatypeSuperclass Obj2 = new PolymorphismOverrideDatatypeSubclass();
		int k2 = Obj2.staticmet(20,15);
		System.out.println("It calls parent static method since reference type is parent: "+k2);
		
		//3: reference type is childclass & objecttype is childclass
		PolymorphismOverrideDatatypeSubclass Obj3 = new PolymorphismOverrideDatatypeSubclass();
		int k3 = Obj3.staticmet(20,15);
		System.out.println("It calls child static method since reference type is child  : "+k3);
	}
}
