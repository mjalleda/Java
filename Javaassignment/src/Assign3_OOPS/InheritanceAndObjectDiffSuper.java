/* Description: Here we learn, the  difference between Inheritance and Object. For this, we need to create three files.
InheritanceAndObjectDiffSuper.java, InheritanceAndObjectDiffSub1.java & InheritanceAndObjectDiffSub2.java
- InheritanceAndObjectDiffSuper is a parent class 
- InheritanceAndObjectDiffSub1 is a child class, which is extending parent
- And InheritanceAndObjectDiffSub2.java is a child class, which is not extending parent nor child.
In this class, we are creating a method m1() only. */

package Assign3_OOPS;
public class InheritanceAndObjectDiffSuper {
	// create static and instance methods
	public int m1(int a, int b, int c) {
		int d = a+b;
		System.out.println("Print parent method");
		return d;
	}
	public static void m2(int x, int y) {
		int c = x-y;
	}
}