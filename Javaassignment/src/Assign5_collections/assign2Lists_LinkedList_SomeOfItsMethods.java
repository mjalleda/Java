/* Description: In this assignment we learn how to use difference types of LinkedListmethods
Learning LinkedList methods. Not all but some. */
package Assign5_collections;
import java.util.LinkedList;
public class assign2Lists_LinkedList_SomeOfItsMethods {
	public static void main(String args[]) {
		LinkedList L1 = new LinkedList();
		LinkedList L2 = new LinkedList();
		LinkedList L3 = new LinkedList();
		LinkedList L4 = new LinkedList();
		LinkedList L5 = new LinkedList();
		LinkedList L6 = new LinkedList();
		LinkedList L7 = new LinkedList();
		LinkedList L8 = new LinkedList();
		
		//Method 1: Size
		System.out.println("******************************************************************");
		System.out.println("Print original values of L1 before exeucting a method on it:: "+L1);
		int a = L1.size();
		System.out.println("L1 doesnt have any values, so size should be 0:: "+a);
		
		//Method 2: add, addFirst, addLast & addAll.  
		L1.add(0, 20); // Adding a value to index 0
		L1.add(1, 30); // Adding a value to index 1
		L1.add(2, 40); // Adding a value to index 2
		L1.add(3, 50); // Adding a value to index 3
		L1.add(4, 60); // Adding a value to index 4
		L1.addFirst(10); // Adding a value to index 0
		L1.addLast(20); // Adding a value to LastIndex, here it is 5
		L2.addAll(L1); // L2 gets all values from L1.
		L3.addAll(L1); // L2 gets all values from L1.
		L4.addAll(L1); // L2 gets all values from L1.
		L5.addAll(L1); // L2 gets all values from L1.
		L6.addAll(L1); // L2 gets all values from L1.
		L7.addAll(L1); // L2 gets all values from L1.
		L8.addAll(L1); // L2 gets all values from L1.
		
		//Method 3: Clone...similar to Arraylist.
		//Method 4: Clear...similar to Arraylist.
		//Method 5: Contains...similar to Arraylist.
		//Method 6: Equals...similar to Arraylist.
		
		//Method 7: isEmpty.
		System.out.println("******************************************************************");
		System.out.println("Print original values of L1 before exeucting a method on it:: "+L1);
		boolean a3 = L1.isEmpty();
		System.out.println("Is L1 empty, not it is not. It has values:: "+a3); //It returns False, sicne L2 is not empty.
		
		//Method 8: remove
		System.out.println("******************************************************************");
		System.out.println("Print original values of L1 before exeucting a method on it:: "+L1);
		L1.remove(); //removes the first head of the list. Traverse from head to tail.
		System.out.println("Removing first head of the list, which means removing 10 from L1:: "+L1);
		
		//Method 9: remove with Index
		System.out.println("******************************************************************");
		System.out.println("Print original values of L2 before exeucting a method on it:: "+L2);
		L2.remove(2); //removes the value from given index
		System.out.println("Removing a value from Index 2, which means removing 30 from L2:: "+L2);
		
		//Method 10: Remove first value.
		System.out.println("******************************************************************");
		System.out.println("Print original values of L3 before exeucting a method on it:: "+L3);
		L3.removeFirst(); //removes the first head of the list. Traverse from head to tail.
		System.out.println("Removing first index value, which means removing 10 from L3:: "+L3);
		
		//Method 11: Remove first occurance of a value.
		System.out.println("******************************************************************");
		System.out.println("Print original values of L4 before exeucting a method on it:: "+L4);
		L4.removeFirstOccurrence(20); //remove the first occurance of value.If 20 found multiple times, then it remove the first occurance.
		System.out.println("20 exists two times, so removing first occurance of 20, which means removing index 1 values from L4:: "+L4);
		
		//Method 12: Removing last value from list.
		System.out.println("******************************************************************");
		System.out.println("Print original values of L5 before exeucting a method on it:: "+L5);
		L5.removeLast(); //remove last value from the list.
		System.out.println("Removing last index value, which means removing 20 from L5:: "+L5);
		
		//Method 13: Remove Last occurance of a value.
		System.out.println("******************************************************************");
		System.out.println("Print original values of L6 before exeucting a method on it:: "+L6);
		L6.removeLastOccurrence(20); //remove the last occurance of a value. If 20 found mulitple times, then it remove the last occurance.
		System.out.println("20 exists two times, so removing last occurance of 20, which means removing index 7 values from L6:: "+L6);
		
		//Method 14: Removing all values.
		System.out.println("******************************************************************");
		System.out.println("Print original values of L7 before exeucting a method on it:: "+L7);
		L7.removeAll(L7);
		System.out.println("Removing all values from L7, means making L7 empty:: "+L7);
		
		//Method 15: Get Index value 
		System.out.println("******************************************************************");
		System.out.println("Print original values of L8 before exeucting a method on it:: "+L8);
		int a1 = (Integer) L8.get(2);
		System.out.println("Returning/Getting index 2 value from  list L8:: "+a1);
		
		//Method 16: Get Index value 
		System.out.println("******************************************************************");
		System.out.println("Print original values of L8 before exeucting a method on it:: "+L8);
		int a2 =  (Integer) L8.getFirst();
		System.out.println("Returning/Getting first index value from  list L8:: "+a2);
		
		//Method 17: Get Index value 
		System.out.println("******************************************************************");
		System.out.println("Print original values of L8 before exeucting a method on it:: "+L8);
		int a31 =  (Integer) L8.getLast();
		System.out.println("Returning/Getting Last index value from  list L8:: "+a31);
	}
}
