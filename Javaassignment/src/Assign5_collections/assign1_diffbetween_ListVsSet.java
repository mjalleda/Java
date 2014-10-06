/* Description: In this assignment we learn difference between List(using ArrayList) VS Set(using HashSet) 
And how to print Collections in different manner ( three different types: Using regular for loop, using object, using Iterator.
List: Can take duplicates, can take multiple null values. It prints in the same order as you intialized.
Set: Can't take duplciates, can't take more than one nullvalue, it prints in the random order. */

//**************************  CODING STARTS *****************************//
package Assign5_collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
public class assign1_diffbetween_ListVsSet {

	public static void main(String args[]) {
	// Any datatype values are allowed like Wrapper, primitive, Float, another class object. But you have to declare as Object only.
	System.out.println("***********************************************");
	System.out.println("************** LIST (Using ArrayList) *********");
	ArrayList arr1 = new ArrayList(2);
	arr1.add("Laxmi");
	arr1.add("Laxmi"); //duplicate values are allowed.
	arr1.add(3);
	arr1.add(3); 	   // duplicate values are allowed.
	arr1.add(30.10);	
	arr1.add(null);    // More than one null is allowed and compiler prints all of them.
	arr1.add(null);
	arr1.add(null);
	
	// Print using regular for loop 
	System.out.println("The size of ListArray is: "+ arr1.size());
	int j;
	// Printing type 1:  using regular for loop
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	for (j=0; j<arr1.size(); j++) {
		System.out.println("Printtype 1: By using regular forloop: "+ arr1.get(j)); //it prints in the same order as you intilized.
	}
	// Printing type 2:  using Obj
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	for (Object Obj:arr1) {
		System.out.println("Printtype 2: By using Object type: "+ Obj); //it prints in the same order as you intilized.
	}
	// Printing type 3:  using Iterator method
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	Iterator it1 = arr1.iterator();
	while(it1.hasNext()) {
		System.out.println("Printtype 3: By using iterator method: "+ it1.next());  //it prints in the same order as you intilized.
	}	
	
	//Set 
	System.out.println("***********************************************");
	System.out.println("************** SET (Using HashSet) ************");
	HashSet hs = new HashSet();
	hs.add("Laxmi");
	hs.add("Laxmi"); //duplicate values are allowed at coding time but not allowed at compilation time.
	hs.add(3);
	hs.add(3); 	     //duplicate values are allowed at coding time but not allowed at compilation time.
	hs.add(30.10);	
	hs.add(null);    // more than null values are allowed at coding time, but complier prints only one null.
	hs.add(null);
	hs.add(null);
	int k;
	System.out.println("HashSet size is : "+ hs.size());
	
	// Printing type 1:  Directly calling HashSet
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("Printtype 1: Calling directly: "+ hs); //it prints in the same order as you intilized.
	
	// Printing type 2:  using Obj
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	for (Object Obj1:hs) {
		System.out.println("Printtype 2: By usinbg object is: "+ Obj1); //it prints in the same order as you intilized.
	}
	// Printing type 3:  using Iterator method
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	Iterator it = hs.iterator();
	while(it.hasNext()) {
		System.out.println("Printtype 3: by using iteratormethod: "+ it.next());  //it prints in the same order as you intilized.
	}
	System.out.println("***********************************************");
}
}