/* Description: Here, we learn how to use access modifiers "Public, protected, default & private" in "Public" class.
Relationships: Here, three .java classes are connected. Which are 
Package: Assign1_fundamentalsOne >> Exer13_ClassTypePublicA.java
Package: Assign1_fundamentalsOne >> Exer13_ClassTypePublicB.java
Package: Assign1_fundamentalsTwo >> Exer13_ClassTypePublicC.java

PublicA is a superclass, PublicB & PublicC are subclasses. 
Where PublicA and PublicB are in same package and PublicC is in different package.

Here, we are perform,
1: Created a parent reference and trying to access public, protected, default and private variables and methods from class PublicA.
Note1: you can't access if you create parent object outside main.
Note2: You can't access default & private variables and methods. */

package Assign1_fundamentalsTwo;
//1. In order to access to Packag1 public class, its methods and properties, we need import that class/package first.
import Assign1_fundamentalsOne.*;
public class Exer13_ClassTypePubliC extends Exer13_ClassTypePublicA{ 

	public static void main(String args[])
	{
	Exer13_ClassTypePublicA publica2 = new Exer13_ClassTypePublicA();
	System.out.println("It is printing from package2:");
	
	// 2.1: accessing public variable and method from Different package by importing the class/package.
	publica2.a1 = 300;
	publica2.m1();
	
	// 2.2: Accessing protected variable/method from diff package by parent reference
	// publica2.a2 = 2; // This gives error since parent reference can't be used to access protected variable.
	// publica2.m2();  // This gives error since parent reference can't be used to access protected variable.
	
	// 2.2: Accessing protected variable/method from diff package by child reference 
	Exer13_ClassTypePubliC obj2 = new Exer13_ClassTypePubliC(); // Creating a child reference.
	obj2.a2 = 5; // Protected variable can be accessed in diff package by child reference.
	obj2.m2(); // Protected method can be accessible in diff package by child reference.
	System.out.println("converting to something:"+obj2.a2);
	
	// 2.3: accessing default variable and method from Different package by importing the class/package.
	// publica2.a3 = 3; // Since a3 is default type in class PublicA, so it is not accessible in different package. 
	// publica2.m3(); // Since m3 is default type in class PublicA, so it is not accessible in different package.
	
	// 2.4: Accessing private variable/method from diff package.
	// publica2.a4 = 3000; // Since a4 is private type in class PublicA, so it is not accessible in different package.
	// publica2.m4(); // Since m4 is private type in class PublicA, so it is not accessible from outside the class.
	}
}
