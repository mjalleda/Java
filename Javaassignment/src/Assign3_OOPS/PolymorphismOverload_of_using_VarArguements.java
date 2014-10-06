/* Description: Here, we will learn on how a method can be overload with variablearguements */
package Assign3_OOPS;
public class PolymorphismOverload_of_using_VarArguements {
	// Create a method and pass vararguments.
	public static int m1(int... a) {
		System.out.println("Print var args");
		return 0;
	}
	// Overload method by passing diff arguments.
	public static int m1(int b) {
		System.out.println("Print int");
		return 0;
	}
	public static void main(String[] args){
		System.out.println(m1(10,20,30));		
		System.out.println(m1(10));
	}
}
