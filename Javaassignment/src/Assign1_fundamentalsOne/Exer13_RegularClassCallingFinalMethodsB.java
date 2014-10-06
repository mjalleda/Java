/* Description: How to call final variables/methods in a different class? 
 Relationship: RegularClassWithFinalMethodsA is super class. RegularClassCallingFinalMethodsB is subclass.
RegularClassWithFinalMethodsA have final methods. 
Here, both super class and subclass are both not final classes, they are just public classes.
So, you can do both. Extends and create object.
But even though you can extends, but still you can't call final methods/variables by superclass name. If do so, then you can overrride them, so that is not the definition of final methods. 
1: It shows "A final variable can't re-initialized in sub classes.
2: It shows "A final method can't override in sub classes but can be accessed/called. */

package Assign1_fundamentalsOne;
//To produce error that you can't override final methods/variables, first you have to extend super class. Remember if superclass is a final class, you can't extend it so there is no way to override final methods/variables.
public class Exer13_RegularClassCallingFinalMethodsB extends Exer13_RegularClassWithFinalMethodsA {
	public static void main(String args[])
	{
	
	//1: To produce error that you can't override finalvariables, you have to create a object first.	
	Exer13_RegularClassWithFinalMethodsA RegularClassWithFinalMethodsa = new Exer13_RegularClassWithFinalMethodsA();
	// RegularClassWithFinalMethodsa.a;= 100; // can't re-intitialize final variables.
	
	//2.1: Try to override final methods which you can't.
	// public int RCWFM(int b, int c)  // Can't override final method RCWFM since it is final method.
	// {
		// int g = b +c +f;
		// return g;
	// }
	
	// 2.2: A final method can be called with object.
	RegularClassWithFinalMethodsa.RCWFM(1,2);  
	// 2.3: A final method can't be called with superclass name.
	//RegularClassWithFinalMethodsA. // It doesn't show final methods/variables.
	}
	
}
