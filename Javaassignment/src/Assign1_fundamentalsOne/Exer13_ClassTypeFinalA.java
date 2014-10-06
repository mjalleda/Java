/* Description: Here, we created two Final Class type classes. And we verify how to call variables & methods from those classes.
Relationships: 
Relationships: Here, two .java classes are connected. Which are 
Package: com.sample.assign1_fundamentalsOne >> Exer13_ClassTypeFinalA.java
Package: com.sample.assign1_fundamentalsOne >> Exer13_ClassTypeFinalB.java

FinalA is final public class. FinalB also a  final public class. In this class, we perform
1: Accessing final class, final variables and methods.
1.1: Try to get error "Final class can't be extended. that means, you can't override final methods and re-initialize final variables. 
1.2: But how to access final methods. You can create an object to finalclass and access them but can't override them. How to re-initialize final variables. Which is impossible not even possible with object.
*/

package Assign1_fundamentalsOne;

final public  class Exer13_ClassTypeFinalA {
	// Try to extend it this in sub class
	// try to override these methods..
	
	// public variables and methods
	final public int d1=7;
	final public int p1(int d2, int d3)
	{
		int d4 = d2 + d3;
		return d4;
	}
	
	// protected variables and methods
	final protected int d5 = 100;
	final protected int p2(int d6, int d7)
	{
		int d8 = d6 * d7;
		return d8;
	}
	
	// default variables and methods
	final int d9 = 100;
	final int p3(int d10, int d11)
	{
		int d12 = d10 * d11;
		return d12;
	}
	
	//private variables and methods
	final private int d13 = 100;
	final private int p4(int d14, int d15)
	{
		int d16 = d14 * d15;
		return d16;
	}
}
