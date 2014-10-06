/* Description: Here, we learn about AnonymouseInnerClass
 Relationships: Exer17_AnonymousInnerClassA, Exer17_AnonymousInnerClassB and Exer17_AnonymousInnerClassC are three classes.
Here we learn: How to create anonymous classes & their purpose.
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
public class Exer17_AnonymousInnerClassB extends Exer17_AnonymousInnerClassA { 
	// You didnt extend classC but you can override ClassC methods by creating an anonymous class. 
	public static void main(String args[]) {
	Exer17_AnonymousInnerClassC Obj1 = new Exer17_AnonymousInnerClassC() { // Anonymous class takes AnonymousInnerClassC name only.  
	public int m3(int a, int b) {
		int d = a * b +10;
		return d;
	}
	public int m4(int a, int b) {
		int d = a - b +10;
		return d;
	}
	};
		System.out.println(Obj1.m3(10,10)); // We are calling this overrided method from this class.
		System.out.println(Obj1.m4(10,10)); // We are calling this overrided method from this class.
		System.out.println(Obj1.m5(10,10)); //With anonymous class, you can access all its class methods.
	}
	//Note: I am not coding 'how to extend ClassA methods' since we learned these in other assignments. Yes, we can override them since we used extend keyword for that class.
}
