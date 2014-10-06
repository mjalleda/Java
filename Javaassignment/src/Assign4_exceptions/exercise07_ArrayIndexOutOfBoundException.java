/*  Description: Generate ArrayIndexOutOfBoundsException */
package Assign4_exceptions;
public class exercise07_ArrayIndexOutOfBoundException {
	public static void main(String args[]) {
	// ************ ArrayIndexOutOfBoundsException:  ******************//
	int[] a= new int [3];
	a[0]=20;
	a[1]=30;
	a[2]=40;
	System.out.println(a[3]); // This will leads to ArrayOutofBoundException since the length is 0 to 2 only
}
}