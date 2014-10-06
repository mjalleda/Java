/* Description: How to call final variables/methods in a different class? 
 Relationship: RegularClassWithFinalMethodsA is super class. RegularClassCallingFinalMethodsB is subclass.
RegularClassWithFinalMethodsA have final methods. 
Example shows "When a concreate/Regular class (means below class) contained a final method and variables.
1: the subclass (means RegularClassCallingFinalMethodsB) can't override final methods when it extends superclass. 
2: the subclass (means RegularClassCallingFinalMethodsB) can't re-initialize final variables when it extends superclass and create object for superclass.

// What is the difference between classes "Exer13_FinalA" and "Exer13_RegularClassWithFinalMethodsA" 
// FinalA is final public class containing final methods/variables, RegularClassWithfFInalMethodsA is just a public class containing final methods/variables. */
package Assign1_fundamentalsOne;
public class Exer13_RegularClassWithFinalMethodsA {
	//Create final variables and methods. It applies to all final methods/variables. which are public, private, protected and default.
	final int a = 10;
	final public int RCWFM(int b, int c)
	{
		int d = b+c ;
		return d;
	}
	
}
