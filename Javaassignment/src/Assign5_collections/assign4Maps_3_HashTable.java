/* Description: Here we learn about HasTable:
 For this, we need help of ther class, which is: assign3And4_SubClass_Employee
 In this class, I wrote below programs.
Program 1: Adding pre & user defined values. Order is not preserved and Duplicate values are allowed print
Program 2.1: Comparing HashTable when it have pre-defined values
Program 2.2: Sorting hashtable when it has user-defined Objects/values
Program 2.3: Sorting Hashtable when it has user-defined Objects/values
Program 5: HashSets methods: Most of its methods we lerned in LISTS, not learning any where"*/

package Assign5_collections;
import java.util.Hashtable;

import Assign7_Threads.Assign2_Threads_SynchronizedBlock_Employee;
public class assign4Maps_3_HashTable {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		System.out.println("***********************************************************************");
		System.out.println(" 		 HASH TABLE");
		System.out.println("*********************************************************************** \n");
		
		Hashtable ht1 = new Hashtable();
		Hashtable ht2 = new Hashtable();
		Hashtable ht5 = new Hashtable();
		Hashtable ht6 = new Hashtable();
		assign3And4_SubClass_Employee e1 = new assign3And4_SubClass_Employee(1, "Mamta", 200);
		
		//Program 1: Adding different datatype values to hashtable including custom objects.
		System.out.println("***********************************************************************");
		System.out.println("Program 1: Adding pre & user defined values. Order is not preserved and Duplicate values are allowed print");
		
		ht1.put(10,10);					// Primitive integer
		ht1.put(20,'s'); 				// duplicate value 's' is not allowed for a different key
		//ht1.put(30,null);				// Null is not allowed.
		//ht1.put(40,null); 				// duplicate value 's' is not allowed for a different key
		ht1.put(50,new Integer(100));	// Wrapper Integer
		ht1.put(60,10.8f); 				// Primitive float
		ht1.put(70,"Mamta");   			// String
		ht1.put(80,'s');				// Primitive char
		ht1.put(90,new Float(23.3f));  	// Wrapper float 
		ht1.put(100,e1);				// Custom/userdefined object
		ht1.put(10,1000);				// duplicate key is not allowed, so new value '1000' will overwriteen on key 10
		ht1.put(20,2000);				// duplicate key is not allowed, so new value '2000' will overwriteen on key 20
		ht2.put(510,500);
		ht2.put(210,200);
		ht2.put(110,100);
		ht2.put(310,300);
		ht2.put(410,400);
		System.out.println(ht1); 		// Sort them in some order & Duplicate values get overrided.
		System.out.println(ht2); 		// Sort them in some order & Duplicate values get overrided.
		
		// Program 2.1: How to compare/sort Hashtable when it has pre-defined values (such as primitive, wrapper, String...)
		// Internally Hashtable uses Comparable method for sorting. Which means by default. Later uses, equals method for comparision.   
		System.out.println("***********************************************************************");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Program 2.1: Comparing HashTable when it have pre-defined values");
		if (ht1.equals(ht2)) {
			System.out.println("HT1 equals to HT2");
		} else {
			System.out.println("HT1 is not equal to HT2"); //It will execute since both hascodes are different.
		}
		// Interally equal methods based on hashcodes of two sets
		System.out.println("THS1 hashcode is: "+ht1.hashCode());
		System.out.println("THS2 hashcode is: "+ht2.hashCode());
		if (ht1.hashCode() == ht2.hashCode()) {
			System.out.println("ht1 hashcode is same as from ht2");
		} else {
			System.out.println("ht1 hashcode is different from ht2"); 
		}

		// Program 2.2: Hashtable has user-defined objects, Sort them by using Overrided Comparable method.
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Program 2.2: Sorting hashtable when it has user-defined Objects/values");
		Hashtable ht3 = new Hashtable();
		assign3And4_SubClass_Employee e31 = new assign3And4_SubClass_Employee(9, "M", 200);
		assign3And4_SubClass_Employee e41 = new assign3And4_SubClass_Employee(4, "Ma", 200);
		assign3And4_SubClass_Employee e51 = new assign3And4_SubClass_Employee(2, "Mam", 200);
		assign3And4_SubClass_Employee e61 = new assign3And4_SubClass_Employee(2, "Mamta", 200);
		ht3.put(10, e31);
		ht3.put(20, e41);
		ht3.put(10, e51);
		ht3.put(20, e61); // this will override on existing key 20
		System.out.println("Sorted Hashtable TS3 is : "+ht3); // sort then in Asc order + it doesnt allow duplicate values.
		
		// Program 2.3: TreeSet has user-defined objects, Sort them by using Overrided Comparator method. 
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Program 2.3: Sorting Hashtable when it has user-defined Objects/values");
		
		
		// Below code is not valid since Comparator doesn't work on Hashtable.
		/*Hashtable ht4 = new Hashtable(new assign3AND4_Subclass_Mycomparator());
		assign3And4_SubClass_Employee e32 = new assign3And4_SubClass_Employee(9, "Mamta", 200);
		assign3And4_SubClass_Employee e42 = new assign3And4_SubClass_Employee(4, "Mamta", 200);
		assign3And4_SubClass_Employee e52 = new assign3And4_SubClass_Employee(2, "Mamta", 200);
		assign3And4_SubClass_Employee e62 = new assign3And4_SubClass_Employee(2, "Mamta", 200);
		ht4.put(10,e32);
		ht4.put(20,e42);
		ht4.put(30, e52);
		ht4.put(40, e62);
		System.out.println("Sorted treeSet TS4 is: "+ht4);*/
		
		// Program 4: This is implemented in assign4_Hashtable_AllIterators 
		// Prgoarm 5: Some of its methods. 
		System.out.println("***********************************************************************");
		System.out.println("Program 5: HashSets methods: Most of its methods we lerned in LISTS, not learning anyhere");
	}

}
