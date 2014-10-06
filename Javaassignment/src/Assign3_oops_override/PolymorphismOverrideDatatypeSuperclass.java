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

public class PolymorphismOverrideDatatypeSuperclass {
	// ********************************* //
	//1: Public method
	public int z1(int a, int b) {
		return 0;
	}
	
	// ********************************* //
	//2: Protected methods
	//2.1: first Protected method
	protected int protectedmet1(int a, int b) {
		return 0;
	}
	//2.2: second Protected method
	protected int protectedmet2(int a, int b) {
		return 0;
	}
	//2.3: third Protected method
	protected int protectedmet3(int a, int b) {
		return 0;
	}
	
	// ********************************* //
	//3: Default methods
	//3.1: first default method
	int defaultmet1(int a, int b) {
		return 0;
	}
	//3.2: second default method
	int defaultmet2(int a, int b) {
		return 0;
	}
	//3.2: third default method
	int defaultmet3(int a, int b) {
		return 0;
	}
	
	// ********************************* //
	//4: Private methods
	//4: Private method is not visible from outside of this class, so can't override private methods at all.
	private int z4(int a, int b) {
		return 0;
	}
	
	// ********************************* //
	//5.1: final & non-final methods
	final public  int finalmet(int a, int b) {
		return 0;
	}
	
	//5.2: final methods
	public int nonfinalmet(int a, int b) {
		return 0;
	}
	
	// ********************************* //
	//6: final methods
	static  public int staticmet(int a, int b) {
		return 0;
	}
	
	// ********************************* //
	//7: Synchronized & non-synchronized methods
	//7.1: Synchronized method
	synchronized  public int synchronizedmet(int a, int b) {
		return 0;
	}
	
	// ********************************* //
	//7.2: non_synchronized method
	public int non_synchronizedcmet(int a, int b) {
		return 0;
	}
}
