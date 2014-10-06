/* Description: Here we learn, the  difference between Inheritance and Object. For this, we need to create three files.
InheritanceAndObjectDiffSuper.java, InheritanceAndObjectDiffSub1.java & InheritanceAndObjectDiffSub2.java
- InheritanceAndObjectDiffSuper is a parent class 
- InheritanceAndObjectDiffSub1 is a child class, which is extending parent
- And InheritanceAndObjectDiffSub2.java is a child class, which is not extending parent nor child.
In this class, we are creating a method m1() only. 

In this sub class, we do 
1: we extend with Super class and perform Method overloading with polymorphism.
2: Later, by creating child object, we can access Super class methods too. */
package Assign3_OOPS;
public class InheritanceAndObjectDiffSub1 extends InheritanceAndObjectDiffSuper{
	//method overloaing in subclass is possible with extends.
	public static int m1(int a, int b) { 
		int c = a*b;
		System.out.println("Print Sub1 method");
		return c;
	}
	public static void main(String args[]) {
	// Creating both references.
	InheritanceAndObjectDiffSuper ParentRef = new InheritanceAndObjectDiffSuper();
	InheritanceAndObjectDiffSub1 Sub1Ref = new InheritanceAndObjectDiffSub1();
	
	// Access parent's and Sub1's reference by using Sub1 reference. 
	int z = Sub1Ref.m1(1,1,1);
	System.out.println(z);
	int z1 = Sub1Ref.m1(1,1);
	System.out.println(z1);
	}
}
