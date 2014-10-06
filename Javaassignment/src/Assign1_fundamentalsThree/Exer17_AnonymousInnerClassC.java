/* Description: Here, we learn about AnonymouseInnerClass
Relationships: Exer17_AnonymousInnerClassA, Exer17_AnonymousInnerClassB and Exer17_AnonymousInnerClassC are three classes.
Here we learn: How to create anonymous classes & thier purpose.
Why Anonymous classes were introduced: In older versions of java, it doesn’t allow to extend multipleclasses, we can’t override methods without extending their classes.
So, java introduced Anonymous InnerClass. With this class, you no need to extend a class but you can override that class methods. Lets take an example. 
You have three classes ClassA, ClassB and ClassC. 
-	ClassB extends ClassA for somereasons
-	ClassA can’t extend ClassC since multipleclasses can’t be extended in java
-	But ClassB wants to override ClassC methods. 
Old versions of java - It was not possible.
Newer versions of java: 
-	In classB, you can create a Anonymous class for ClassC & can extends ClassC methods insdie AnonymousClass. */ 
package Assign1_fundamentalsThree;
public class Exer17_AnonymousInnerClassC {
	// First method
	public int m3(int a, int b) {
		int c = a +b;
		return c;
	}
	
	// Second method
	int m4(int a, int b) {
		int c = a +b;
		return c;
	}
	
	// Second method
	int m5(int a, int b) {
		int c = a +b;
		return c;
	}

}
