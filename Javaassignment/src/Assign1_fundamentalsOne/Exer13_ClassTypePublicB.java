/* Description: Here, we learn how to use access modifiers "Public, protected, default & private" in "Public" class.
Relationships: Here, three .java classes are connected. Which are 
Package: Assign1_fundamentalsOne >> Exer13_ClassTypePublicA.java
Package: Assign1_fundamentalsOne >> Exer13_ClassTypePublicB.java
Package: Assign1_fundamentalsTwo >> Exer13_ClassTypePublicC.java

PublicA is a superclass, PublicB & PublicC are subclasses. 
Where PublicA and PublicB are in same package and PublicC is in different package.

Here, we perform
1: Created a parent reference and accessing public, protected, default and private variables and methods from class PublicA.
Note1: you can't access if you create parent object outside main.
Note2: You can't access private variables and methods from outside of the class. */
package Assign1_fundamentalsOne;

public class Exer13_ClassTypePublicB {  // No need to use extend keyword, you can access pro and beh by object.
	//create parent reference outside main
	Exer13_ClassTypePublicA publicb = new Exer13_ClassTypePublicA(); 
	public static void main(String args[])  // You can put
	{		
	//2.1: accessing public methods and variables.
	//publicb. // see PublicA properties and behavior are not accessible if you create object outside main.
	Exer13_ClassTypePublicA publica1 = new Exer13_ClassTypePublicA();  // Creating parent reference again inside main method. you can create object outside main method but can't access superclass properties and behavior.System.out.println("Main is in subclass PublicB");
	publica1.m1();
	
	// 2.2. accessing protected methods and variables.
	publica1.a2=1; // a2 is accessible since it is protected type, so its available within the package.
	publica1.m2(); // m2 is accessible since it is protected type, so its available within the package.
	
	//2.3. accessing default methods and variables.
	publica1.a3 = 2; //default variable is available with in the package.
	publica1.m3(); //default method is available with in the package.
	
	// 2.4. accessing private methods and variables.
	//publica1.a4 = 200; // a4 is not visible since it is private in PublicA.
	//publica1.m4(); // m4 is not visible since it is private in PublicA.
	}
}
