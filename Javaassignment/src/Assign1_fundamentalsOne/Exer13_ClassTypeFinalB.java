/* Description: Here, we created two Final Class type classes. And we verify how to call variables & methods from those classes.
Relationships: Here, two .java classes are connected. Which are 
Package: com.sample.assign1_fundamentalsOne >> Exer13_ClassTypeFinalA.java
Package: com.sample.assign1_fundamentalsOne >> Exer13_ClassTypeFinalB.java
Both of these classes are Public Final classes.

In this class, we perform
1: Accessing final class, final variables and methods from FinalA class.
1.1: Try to get error "Final class can't be extended. that means, you can't override final methods and re-initialize final variables. 
1.2: But how to access final methods. You can create an object to finalclass and access them but can't override them. How to re-initialize final variables. Which is impossible not even possible with object.
*/
package Assign1_fundamentalsOne;
//1.1: It gives an error, the type FinalB can't be subclass of FinalA because finalA is type final which you can't extend.
//public final class FinalB extends FinalA {   
//}

public class Exer13_ClassTypeFinalB {
	public static void main(String args[])
	{
		
	//1.2.1: So we can't extend FinalA so we are creating object for FinalA to access final variables/methods.
	Exer13_ClassTypeFinalA finala = new Exer13_ClassTypeFinalA();
	
	// 1.2.2. Even if you access finalclass variables/methods by creating an object to it, you can't override/re-initialize them. The error finalfield can't be assigned.
	//finala.d1=100; //final pubic variable  
	//finala.d5=9;   //final protected variable
	//finala.d9=8;   //final default variable
	
	// 1.2.3. you can just access/call public, protected and default final methods with help of object.
	finala.p1(2,3); //final public method 
	finala.p2(4,5); //final protected method
	finala.p3(7,8); //final default method
	//finala.p4(10,12); // since p4 is private type, you cant access it.  
	
	// 1.2.4. Finalmethod can't be override.
	/* public int p1(int d2, int d3) {
		 int d4 = d2 * d3;
		 return d4;
		 } */ 
	} 
}
