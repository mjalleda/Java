/* Description: Generate StringIndexOutOfBoundsException */
package Assign4_exceptions;
public class exercise08_StringIndexOutOfBoundException {
	public static void main(String args[]) {
	// ************ StringIndexOutOfBoundsException:  ******************//
	String s = "mamta"; // s has only 5 characters
	System.out.println(s.charAt(222)); // but you are asking for 222 nd character
	}
}
