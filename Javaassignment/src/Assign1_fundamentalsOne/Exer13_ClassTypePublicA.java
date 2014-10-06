/* Description: Here, we learn how to use access modifiers "Public, protected, default & private" in "Public" class.
Relationships: Here, three .java classes are connected. Which are 
Package: Assign1_fundamentalsOne >> Exer13_ClassTypePublicA.java
Package: Assign1_fundamentalsOne >> Exer13_ClassTypePublicB.java
Package: Assign1_fundamentalsTwo >> Exer13_ClassTypePublicC.java

PublicA is a superclass, PublicB & PublicC are subclasses. 
Where PublicA and PublicB are in same package and PublicC is in different package.

In this class, we perform
1: publicA is a Public Class type
2: Here we create public, protected, default and private variables and methods. */

package Assign1_fundamentalsOne;
//1: Creation of public class.
public class Exer13_ClassTypePublicA {
	
	//2.1: Declaration/implementation of public variable and method
	public int a1=1;
	public void m1()
	{
		System.out.println("Value printing from PublicA: "+a1);
	}
	
	//2.2: Declaration/implementation of protected variable and method
	protected int a2 = 1;
	protected void m2()
	{
		System.out.println("This is protected method from PublicA");
	}
	//2.3: Declaration/implementation of default variable and method
	int a3 = 100;
	void m3()
	{
		System.out.println("This is default method from PublicA");
	}
	
	//2.4: Declaration/implementation of private variable and method
	private int a4;
	private void m4()
	{
		System.out.println("This is private method from PublicA");
	}
}
