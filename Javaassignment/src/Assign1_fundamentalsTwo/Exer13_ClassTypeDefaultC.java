/* Description: Here, we learn how to use/access modifiers "Public, protected, default & private" in "Default" class.
Relationships: Here, three .java classes are connected. Which are 
Package: Assign1_fundamentalsOne >> Exer13_ClassTypeDefaultA.java
Package: Assign1_fundamentalsOne >> Exer13_ClassTypeDefaultB.java
Package: Assign1_fundamentalsTwo >> Exer13_ClassTypeDefaultC.java

DefaultA is a superclass, DefaultB & DefaultC are subclasses. 
Where DefaultA and DefaultB are in same package and DefaultC is in different package.

// 1: In this class, I created a parent reference and tried to access "public, protected, default and private variables and methods" from class DefaultA.
//Even though if you import the superclass package, you can't access any variables/methods from that class. Since superclass is not a public class, it is default class. */
package Assign1_fundamentalsTwo;
import Assign1_fundamentalsOne.*;
class Exer13_ClassTypeDefaultC  {
	public static void main(String args[]) {
	//If superclass is a default class, then you can't access any.
	// Exer13_DefaultA Obj = new Exer13_DefaultA(); // You can't create parent reference. 
	Exer13_ClassTypeDefaultC obj1 = new Exer13_ClassTypeDefaultC(); 
	//obj1. // You can't even access any variables by child reference.
	}
}
