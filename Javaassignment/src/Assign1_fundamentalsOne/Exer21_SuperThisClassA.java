/* Description: How to use "Super" &"This" . I explained this with help of two classes.
Relationship:Exer13_SuperThisClassA is superclass & Exer13_SuperThisClassB is subclass.
Goal is to print both superclass& subclass methods by super & this keyword in subclass.  */

package Assign1_fundamentalsOne;
public class Exer21_SuperThisClassA {
	public int a = 10;
	public static int b = 20;
	
	public static int m1(int a) {
		System.out.println("print superclass instance class");
		return 0;
	}
	public int m2(int b) {
		System.out.println("print superclass static class");
		return 0;
	}
}
