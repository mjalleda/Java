/* Description: Here we learn, the  difference between Inheritance and Object. For this, we need to create three files.
InheritanceAndObjectDiffSuper.java, InheritanceAndObjectDiffSub1.java & InheritanceAndObjectDiffSub2.java
- InheritanceAndObjectDiffSuper is a parent class 
- InheritanceAndObjectDiffSub1 is a child class, which is extending parent
- And InheritanceAndObjectDiffSub2.java is a child class, which is not extending parent nor child.
In this class, we are creating a method m1() only. 

In this sub class, we do 
1: we are NOT extending Super class, so we can't perform Method overloading with polymorphism.
2: Later, we crated a child object but we can't access Super class methods too. */

package Assign3_OOPS;
// don't extend parent and Sub, which are InheritanceAndObjectDiffSuper and InheritanceAndObjectDiffSub
public class InheritanceAndObjectDiffSub2 {
	//method overloaing in subclass is not possible without extends. That means, this is just a local method for sub2class.
	public static int m1(int a, int b, int c, int d) { 
		int e = a*b;
		System.out.println("Print Sub2 method");
		return e;
	}

	public static void main(String[] args) {
		// creating references for parent, sub1 and sub2
		InheritanceAndObjectDiffSuper ParentObj = new InheritanceAndObjectDiffSuper();
		InheritanceAndObjectDiffSub1 Sub1Ref = new InheritanceAndObjectDiffSub1();
		InheritanceAndObjectDiffSub2 Sub2Ref = new InheritanceAndObjectDiffSub2();

		// With Sub2 reference you can't access parent/sub1 methods since you didnt do extends/inheritance.
		int zz2 = Sub2Ref.m1(1,1,1,1); 
		System.out.println(zz2);
		// You can access parents/sub1 methods by using parent/sub1 reference not by sub2 reference since you are not using extends here.
	}
}
