/* Description: In this assignment we learn how to use difference types of ArrayListmethods
Learning methods of add, clone, clear, equals & contains.   */

package Assign5_collections;
import java.util.ArrayList;
import java.util.Collection;
public class assign2Lists_ArrayList_SomeOfItsMethods {
	public static void main(String args[]) {
	ArrayList a1 = new ArrayList();
	ArrayList a2 = new ArrayList();
	ArrayList a3 = new ArrayList();
	ArrayList a4 = new ArrayList();
	
	//Method 1: ADD
	a1.add(0, 00); //it takes 1st Index place
	a1.add(1, 10); //it takes 2nd Index place
	a1.add(2, 20); //it takes 3rd Index place
	a1.add(30); //basically it takes 4th index place
	System.out.println("We specified value index/position while adding:: "+a1);
	
	//Method 2: ADDALL
	a2.addAll(a1); // a2 gets all values of a1. 
	System.out.println("a2 gets all values of a1:: "+a2); //a2 gets all values of a1.
	
	//Method 3: CLONE to Object AND ArrayList typecasting.
	//To Object.
	Object aObject = a1.clone(); 
	boolean aOjectSameas_a1 = a1.equals(aObject);
	System.out.println("Cloned a1 into aObject:: "+aOjectSameas_a1); // It should return true. 
	//Array Typecasting
	a3 = (ArrayList) a1.clone(); //Cloning a1 into a3, which means a3 gets all values of a1. 
	boolean c = a1.equals(a3); // Comparing values of a1 & a3.
	System.out.println("Cloned a1 into arraylist a3:: "+c); // It should return true. 
	
	// Method 4: CONTAINS
	boolean temp31 = a3.contains(20); // Checking if 20 exist in arrayList a3
	System.out.println("Contains checks if given value exist in arraylist:: "+temp31); //It should be true.
	boolean temp32 = a3.contains(200); // Checking if 200 exist in arrayList a3
	System.out.println("Contains checks if given value exist in arraylist:: "+temp32); //It should be false.
	
	// Method 5: Clear
	a2.clear(); //Removing all values from a2. 
	System.out.println("Clear all values from a2:: "+a2); // it should become empty list.

	/*a2.addAll(temp);
	System.out.println(a2);*
	a2.addAll(5, temp);
	System.out.println(a2); */	
} 
}