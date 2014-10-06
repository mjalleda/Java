/* Description:  In this assignment we learn how to use difference types of Vector methods
// Learning Vector List methods. Not all but some. */
package Assign5_collections;

import java.util.List;
import java.util.Vector;

public class assign2Lists_Vector_SomeOfItsMethods {
	public static void main(String args[]) {
		Vector V1 = new Vector();
		List V2 = new Vector();
		
		//Method 1: Size
		System.out.println("******************************************************************");
		System.out.println("Print original values of V1 before exeucting a method on it:: "+V1);
		int a = V1.size();
		System.out.println("V1 doesnt have any values, so size should be 0:: "+a);
		
		//Method 2: add & addAll.  
		V1.add(0, 10); // Adding a value to index 0
		V1.add(1, 20); // Adding a value to index 1
		V1.add(2, 30); // Adding a value to index 2
		V1.add(3, 40); // Adding a value to index 3
		V1.add(4, 50); // Adding a value to index 4
		V2.addAll(V1); // V2 gets all values from V1.
		
		//Method 3: Clone...similar to Arraylist.
		//Method 4: Clear...similar to Arraylist.
		//Method 5: Contains...similar to Arraylist.
		//Method 6: Equals...similar to Arraylist.
			 
		//Method 7: Capacity
		System.out.println("******************************************************************");
		System.out.println("********** METHODS :: SIZE ***************************************");
		System.out.println("Print original values of V1 before exeucting a method on it:: "+V1);
		int a1 = V1.size();
		System.out.println("The length of V1 is:: "+a1);
		
		//Method 8: Copy into new Vector.
		System.out.println("******************************************************************");
		System.out.println("********** METHODS :: COPYINTO ***********************************");
		System.out.println("Print original values of V1 before exeucting a method on it:: "+V1);
		Object[] ObjArr1 = new Object[10]; // Created a new ObjectArray.
		V1.copyInto(ObjArr1); 
		System.out.println("Copying all values from V1 to Object ObjArr1:: "+ObjArr1);
		
		//Method 8: Element at Index, ensuring capacity.
		System.out.println("******************************************************************");
		System.out.println("********** METHODS :: elementAt, ensureCapacity ******************");
		System.out.println("Print original values of V1 before exeucting a method on it:: "+V1);
		System.out.println("Print original elements of V1 is:: "+V1);
		int a4 = (Integer) V1.elementAt(1);
		System.out.println("Print value from index 1 is :: "+a4);
		int a5 = V1.size();
		System.out.println("Print original size of V1 is:: "+a5);
		V1.ensureCapacity(10); //Increasing capacity from 5 yo 10.
		int a6 = V1.capacity();
		System.out.println("New increased capacity of V1 is:: "+a6);
		
		//Method 9: Find position for given value, Find position for a given value and start index at.
		System.out.println("********************************************************************");
		System.out.println("********** METHODS :: IndexOF, IndexOF at position  ****************");
		System.out.println("Print original values of V1 before exeucting a method on it:: "+V1);
		int a7 = V1.indexOf(50); //Find position for a given value
		System.out.println("Return position of a value 50 is:: "+a7);
		int a8 = V1.indexOf(50, 0); // Find position for a give value and start searching from given position. For ex: I want to start searching from at 100th position. 
		System.out.println("Return position of a value 50 is:: "+a8);
		
		//Method 10: Set, setElementAt, setSize, subList, toArray & toString
		System.out.println("*****************************************************************************************");
		System.out.println("*********  METHODS :: Set, setElementAt, setSize, subList, toArray & toString ***********");
		System.out.println("Print original values of V1 before exeucting a method on it:: "+V1);
		V1.set(4, 60); // setting a new element
		System.out.println("Set a new element to Vector V1:: "+V1);
		V1.setElementAt(70, 1); //Setting new element at existing position or a new position
		System.out.println("70 replaces at position 1:: "+V1);
		V1.setSize(20); // Setting new size to Vector
		System.out.println("Setting new size of V1 10 to 20:: "+V1.size());
		V2 = V1.subList(0, 2); // Making sublist from Vector
		System.out.println("New sublist of V1 is V2:: "+V2);
		Object[] arr1;
		arr1 = V1.toArray(); //Converting Vector to Array
		System.out.println("Converting Vector to Object Array arr1:: "+arr1);
		String s1 = V1.toString(); //Converting Vector to String
		System.out.println("Converting Vector to String S1:: "+s1);
		
	}
}
