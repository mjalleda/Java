/*Description: Here, we learn how to declare and initialize Array, how to read values from array*/
package Assign1_fundamentalsOne;
import java.util.Arrays;
import sun.misc.Sort;
import java.math.*;
public class Exer06_ArraysDeclaration {
		public static void main(String[] args) {
			int [] a = new int[3];
			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			//System.out.println(""+a[]);
			//System.out.println("   "+ Arrays.sort(a));
			Arrays.sort(a);
			
			int i;
			int[] a1 = new int[5];
			a1[0] = 100;
			a1[1] = 200;
			a1[2] = 300;
			a1[3] = new Integer(400);
			//a1[5] = "Rajta";
			System.out.println(a1.length);		
		for (i=0; i<a1.length; i++) {
			System.out.println(a1[i]);

		}
		}
}
