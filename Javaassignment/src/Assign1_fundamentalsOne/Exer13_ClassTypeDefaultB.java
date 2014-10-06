/* Description: Here, we learn how to use/access modifiers "Public, protected, default & private" in "Default" class.
Relationships: Here, three .java classes are connected. Which are 
Package: Assign1_fundamentalsOne >> Exer13_ClassTypeDefaultA.java
Package: Assign1_fundamentalsOne >> Exer13_ClassTypeDefaultB.java
Package: Assign1_fundamentalsTwo >> Exer13_ClassTypeDefaultC.java

DefaultA is a superclass, DefaultB & DefaultC are subclasses. 
Where DefaultA and DefaultB are in same package and DefaultC is in different package.

// 1: In this class, I created a parent reference and tried to access "public, protected, default and private variables and methods" from class DefaultA.
//Note1: you can't access if you create parent object outside of main.
//Note2: You can't access private variables and methods from class DefaultA. */
package Assign1_fundamentalsOne;

//1.1: With in same package, create one more default class and access 'DefaultA' variables/methods.
class Exer13_ClassTypeDefaultB {
	
	public static void main(String args[])
	{
	//1.2create a parent reference to superclass DefaultA 
	Exer13_ClassTypeDefaultA defaulta1  = new Exer13_ClassTypeDefaultA();
	
	//2.1: Access public variables from class DefaultA
	defaulta1.b1 = 2;
	defaulta1.n1();
	
	//2.2: Access protected variables from class DefaultA
	defaulta1.b2 = 2;
	defaulta1.n2();
	
	//2.3: Access default variables from class DefaultA
	defaulta1.b3 = 2;
	defaulta1.n3();
	
	//2.4: Access private variables from class DefaultA
	//defaulta1.b4 = 2; // b4 is not visible since it is private in DefaultA.
	//defaulta1.n4(); // n4 is not visible since it is private in DefaultA.
	}
}