//* Description: Generate NumberFormatException */
package Assign4_exceptions;
public class exercise05_NumberFormatException {
	public static void main(String args[]) {
	// ************ NumberFormatException:  ******************//
	int y = Integer.parseInt("ten");
	System.out.println(y); // since it can't change the format, so it reutned NumberFormatException
	}
}
