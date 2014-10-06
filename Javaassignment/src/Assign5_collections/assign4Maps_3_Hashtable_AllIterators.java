package Assign5_collections;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
public class assign4Maps_3_Hashtable_AllIterators {
	public static void main(String args[]) {
		Hashtable HT1 = new Hashtable();
		HT1.put(0, "ABC");
		HT1.put(1, "ABCD");
		HT1.put(2, "ABCDE");
		HT1.put(3, "ABCDEF");
		System.out.println("Values of LinkedHashMap is: "+HT1);
		int i;
		
		//Type 1: Regular For loop  .
		System.out.println("******************************************************");
		System.out.println("********* METHOD 1 : RegularForloop *****************");
		System.out.println("---------------");
		System.out.println("Retrieve values with for loop");
		for(i=0 ; i<=HT1.size(); i++) {
			System.out.println("Retrieving values from LinkedHashMap are: "+ HT1.get(i)); // Returning value for each key.		
		}
		
		//Type 2: Returning Entries (Both key & value). Entry by entry.
		System.out.println("******************************************************");
		System.out.println("********* METHOD 2 : EntrySet & ITERATOR *****************");
		Set s1 = HT1.entrySet();      		// We are catching in Set s, because entrySet returns set of keys & values.
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
		Set s2 = HT1.keySet();
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
			System.out.println(HT1.get(e3));	// Getting only values by using keys
		}
		
		//Type 4: Set of values. Return value by iterating keys.
		System.out.println("******************************************************");
		System.out.println("********* METHOD 4 : VALUES & ITERATOR *****************");
		Collection c1 = HT1.values();
		Iterator it4 = c1.iterator();
		System.out.println("Returning Values");
		while(it4.hasNext()) {
			String e4 = (String) it4.next(); 
			System.out.println((e4));	// Getting only values by Iterating on keys it4.
		}
	}
}
