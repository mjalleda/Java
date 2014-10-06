/*  Description: Here, we use Collection Class Methods. 
We use them on Array List, Hash Set & hash Maps.
Create List, Set and Map and implement collection methods.
Collections have very good methods like, addall, copy, disjoin, fill, reverse, swap */
package Assign5_collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;

public class assign6_CollectionClass {
	public static void main(String args[]) {
		ArrayList AL = new ArrayList();
		ArrayList AL1 = new ArrayList(10);
		HashSet HS = new HashSet();
		HashMap HM = new HashMap();
		AL.add(40);
		AL.add(30);
		AL.add(20);
		AL.add(10);
		HS.add(40);
		HS.add(30);
		HS.add(20);
		HS.add(10);
		HM.put(3, 30);
		HM.put(4, 40);
		HM.put(2, 20);
		HM.put(1, 10);
		System.out.println("ArrayList AL have the following elements: "+AL);
		System.out.println("Set HS have the following elements: "+HS);
		System.out.println("Map HM have the following elements: "+HM);
		
		// For Lists
		// Sort Lists
		System.out.println("***********************************************");
		System.out.println("********** METHODS OF LISTS *******************");
		Collections.sort(AL);
		System.out.println("1: Sorting ArrayList elements : "+AL);
		// Binary serach for an element on Lists
		int a = Collections.binarySearch(AL, 30);
		System.out.println("2: Searching for an element on ArrayList: Is 30 availble on AL : "+a);
		// Reverse order of List.
		Collections.reverse(AL);
		System.out.println("3: Reverse order of ArrayList AL is : "+AL);
		// Copy all elements one list to another
		Collections.copy(AL, AL1);
		System.out.println("4: Copy all elementf is List to another list: "+AL1);
		// Swap one element with another element with their indexes.
		Collections.swap(AL, 1, 2);
		System.out.println("5: Swap one element with another element in arrayList: "+AL);
		// Replaces all of the elements with specified element.
		Collections.fill(AL, 10);
		System.out.println("6: Fill all elements in List with given element 10: "+AL);
		
		// For Sets
		//Which means Set s1 is serializable.
		System.out.println("***********************************************");
		System.out.println("********** METHODS OF SETS *******************");
		Set s1 = Collections.emptySet(); 
		System.out.println("1: Set s1 is immutable or serializable: "+s1);
		
		// For collections (means Lists and Sets)
		// add to Lists
		System.out.println("***********************************************");
		System.out.println("********** METHODS FOR BOTH LISTS  & SETS  ***");
		Collections.addAll(AL,50);
		System.out.println("1: Adding elements to lists: "+ AL);
		// add to sets
		Collections.addAll(HS,50);
		System.out.println("2: Adding elemetnts to sets: "+HS);
		//Do two Collections have any common elements, if so return true otherwise false. 
		boolean haveComEle= Collections.disjoint(AL, HS);
		System.out.println("3: Do collections have any common elemts: "+haveComEle);
}
}
