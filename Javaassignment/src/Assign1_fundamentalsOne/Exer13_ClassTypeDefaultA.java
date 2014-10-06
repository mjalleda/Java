/* Description: Here, we learn how to use/access modifiers "Public, protected, default & private" in "Default" class.
Relationships: Here, three .java classes are connected. Which are 
Package: Assign1_fundamentalsOne >> Exer13_ClassTypeDefaultA.java
Package: Assign1_fundamentalsOne >> Exer13_ClassTypeDefaultB.java
Package: Assign1_fundamentalsTwo >> Exer13_ClassTypeDefaultC.java

DefaultA is a superclass, DefaultB & DefaultC are subclasses. 
Where DefaultA and DefaultB are in same package and DefaultC is in different package.

In this class, 
1: This class is created as a default class
2: In this class, created "public, protected, default and private" variables and methods too. */
package Assign1_fundamentalsOne;
//1: A default class creation
class Exer13_ClassTypeDefaultA {
	// 2.1: Declaration of public variables and methods
	public int b1=2;;
	public void n1()
	{
		System.out.println("This is default super class A & public method");
	}
	
	// 2.2: Declaration of protected variables and methods
	protected int b2=5;
	protected void n2()
	{
		System.out.println("This is default super class A & protected method");
	}
	
	// 2.3: Declaration of default variables and methods
	int b3=5;
	void n3()
	{
		System.out.println("This is default super class A & default method");
	}
	
	// 2.4: Declaration of privates variables and methods
	private int b4=5;
	private void n4()
	{
		System.out.println("This is default super class A & private method");
	}
}
