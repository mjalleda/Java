/* Description: Here, we learn types iterators which are used in Maps
Type 1: Regular for loop
Type 2: By EntrySet - which returns Entries, Keys and Values.
Type 3: By KeySet   - which returns Keys and Values.
Type 4: By Values   - which returns Values. */

package Assign5_collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map.Entry;
import java.math.*;
public class assign4Maps_1_HashMap_AllIterators {
	public static void main(String args[]) {
	HashMap hm1 = new HashMap();
	LinkedHashMap LHM1 = new LinkedHashMap();
	hm1.put(2, "ABCDE");
	hm1.put(3, "ABCDEF");
	hm1.put(0, "ABC");
	hm1.put(1, "ABCD");
	LHM1.put(2, "ABCDE");
	LHM1.put(3, "ABCDEF");
	LHM1.put(0, "ABC");
	LHM1.put(1, "ABCD");
	System.out.println("Values of Hashmap is: " +hm1);
	System.out.println("Values of LinkedHashMap is: "+LHM1);
	int i;
	
	//Type 1: Regular For loop  .
	System.out.println("******************************************************");
	System.out.println("********* METHOD 1 : RegularForloop *****************");
	System.out.println("---------------");
	System.out.println("Getting only values");
	for(i=0 ; i<=hm1.size(); i++) {
		System.out.println("Retrieving values from HashMap are: "+hm1.get(i)); // Returning value for each key.		
	}
	for(i=0 ; i<=LHM1.size(); i++) {
		System.out.println("Retrieving values from LinkedHashMap are: "+ hm1.get(i)); // Returning value for each key.		
	}
	
	//Type 2: Returning Entries (Both key & value). Entry by entry.
	System.out.println("******************************************************");
	System.out.println("********* METHOD 2 : EntrySet & ITERATOR *****************");
	Set s1 = hm1.entrySet();      		// We are catching in Set s, because entrySet returns set of keys & values.
	Iterator it1 = s1.iterator(); 		// Using Iterator method on Set. 
	// 1: Return Sets
	System.out.println("---------------");
	System.out.println("Getting only Set/All Entries");
	while(it1.hasNext()) {        		// Iterating thru while method
		Entry e1 = (Entry) it1.next(); 		// next method returns only Entries means both key & value.  so e should be Entry type.
		System.out.println(e1);	// Getting only Set
	}
	// 2: Return Keys
	System.out.println("---------------");
	System.out.println("Getting only Keys");
	Iterator it11 = s1.iterator(); 		// Using Iterator method on Set.
	while(it11.hasNext()) {        		// Iterating thru while method
		Entry e11 = (Entry) it11.next(); 		// next method returns only Entries means both key & value.  so e should be Entry type.
		System.out.println(e11.getKey());  // Getting only Key
	}
	// 3: Return Values
	System.out.println("---------------");
	System.out.println("Getting only Values");
	Iterator it12 = s1.iterator(); 		// Using Iterator method on Set.
	while(it12.hasNext()) {        		// Iterating thru while method
		Entry e12 = (Entry) it12.next(); 		// next method returns only Entries means both key & value.  so e should be Entry type.
		System.out.println(e12.getValue());	// Getting only Value
	}
	
	
	//Type 3: Set of keys. Return Keys & value by iterating on SET.
	System.out.println("******************************************************");
	System.out.println("********* METHOD 3 : KEYSET & ITERATOR *****************");
	Set s2 = hm1.keySet();
	// 1: Return Keys
	Iterator it2 = s2.iterator();
	System.out.println("---------------");
	System.out.println("Returning Keys");
	while(it2.hasNext()) {
		Integer e2 = (Integer) it2.next();
		System.out.println(e2);	// Getting only keys
	}
	// 2: Return Values
	Iterator it3 = s2.iterator();
	System.out.println("---------------");
	System.out.println("Returning Values");
	while(it3.hasNext()) {
		Integer e3 = (Integer) it3.next();
		System.out.println(hm1.get(e3));	// Getting only values by using keys
	}
	
	//Type 4: Set of values. Return value by iterating keys.
	System.out.println("******************************************************");
	System.out.println("********* METHOD 4 : VALUES & ITERATOR *****************");
	Collection c1 = hm1.values();
	Iterator it4 = c1.iterator();
	System.out.println("Returning Values");
	while(it4.hasNext()) {
		String e4 = (String) it4.next(); 
		System.out.println((e4));	// Getting only values by Iterating on keys it4.
	}
}
}
