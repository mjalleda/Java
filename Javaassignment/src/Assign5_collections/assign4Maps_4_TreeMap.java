/* Description: This Class talks about Tree Map.
 Here, we need help of another class, which is: assign3And4_SubClass_Employee
 In this class, I wrote below programs:
Program 1: Adding pre & user defined values. Duplicate values are allowed & order in some sorting manner
Program 2.1: Comparing TreeMap when it have pre-defined values
Program 2.1: Comparing TreeMap when it have pre-defined values
Program 2.3: Sorting TreeMap when it has user-defined Objects/values
Program 5: HashSets methods: Most of its methods we lerned in LISTS, not learning anyhere */
package Assign5_collections;
import java.util.TreeMap;

import Assign7_Threads.Assign2_Threads_SynchronizedBlock_Employee;
public class assign4Maps_4_TreeMap {
		public static void main(String args[]) {
			System.out.println("***********************************************************************");
			System.out.println(" 		 TREE MAP");
			System.out.println("*********************************************************************** \n");
			
			TreeMap ht1 = new TreeMap();
			TreeMap ht2 = new TreeMap();
			TreeMap ht5 = new TreeMap();
			TreeMap ht6 = new TreeMap();
			assign3And4_SubClass_Employee e1 = new assign3And4_SubClass_Employee(1, "Mamta", 200);
			
			//Program 1: Adding different datatype values to hashtable including custom objects.
			System.out.println("***********************************************************************");
			System.out.println("Program 1: Adding pre & user defined values. Duplicate values are allowed & order in some sorting manner");
			
			ht1.put(10,10);					// Primitive integer
			ht1.put(20,'s'); 				// duplicate value 's' is not allowed for a different key
			ht1.put(30,null);				// Null allowed once
			//ht1.put(40,null); 			// duplicate value 's' is not allowed for a different key
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
			
			// Program 2.1: How to compare/sort TreeMap when it has pre-defined values (such as primitive, wrapper, String...)
			// Internally TreeMap uses Comparable method for sorting. Which means by default. Later uses, equals method for comparision.   
			System.out.println("***********************************************************************");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Program 2.1: Comparing TreeMap when it have pre-defined values");
			if (ht1.equals(ht2)) {
				System.out.println("HT1 equals to HT2");
			} else {
				System.out.println("HT1 is not equal to HT2"); //It will execute since both hashcodes are different.
			}
			// Interally equal methods based on hashcodes of two sets
			System.out.println("THS1 hashcode is: "+ht1.hashCode());
			System.out.println("THS2 hashcode is: "+ht2.hashCode());
			if (ht1.hashCode() == ht2.hashCode()) {
				System.out.println("ht1 hashcode is same as from ht2");
			} else {
				System.out.println("ht1 hashcode is different from ht2"); 
			}

			// Program 2.2: TreeMap has user-defined objects, Sort them by using Overrided Comparable method.
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Program 2.2: Sorting hashtable when it has user-defined Objects/values");
			TreeMap ht3 = new TreeMap();
			assign3And4_SubClass_Employee e31 = new assign3And4_SubClass_Employee(9, "M", 200);
			assign3And4_SubClass_Employee e41 = new assign3And4_SubClass_Employee(4, "Ma", 200);
			assign3And4_SubClass_Employee e51 = new assign3And4_SubClass_Employee(2, "Mam", 200);
			assign3And4_SubClass_Employee e61 = new assign3And4_SubClass_Employee(2, "Mamta", 200);
			ht3.put(10, e31);
			ht3.put(20, e41);
			ht3.put(10, e51);
			ht3.put(20, e61); // this will override on existing key 20
			System.out.println("Sorted TreeMap TS3 is : "+ht3); // sort then in Asc order + it doesnt allow duplicate values.
		
			// Program 2.3: TreeSet has user-defined objects, Sort them by using Overrided Comparator method. 
			// Below code is not working and it should work.
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Program 2.3: Sorting TreeMap when it has user-defined Objects/values");
			TreeMap ht4 = new TreeMap(new assign3AND4_Subclass_Mycomparator());
			assign3And4_SubClass_Employee e32 = new assign3And4_SubClass_Employee(9, "Mamta", 200);
			assign3And4_SubClass_Employee e42 = new assign3And4_SubClass_Employee(4, "Mamta", 200);
			assign3And4_SubClass_Employee e52 = new assign3And4_SubClass_Employee(2, "Mamta", 200);
			assign3And4_SubClass_Employee e62 = new assign3And4_SubClass_Employee(1, "Mamta", 200);
			ht4.put(100, e32);
			ht4.put(200, e42);
			ht4.put(300, e52);
			System.out.println("Sorted treeMap TS4 is: "+ht4);
			
			// Program 4: This is implemented in assign4_Hashtable_AllIterators 
			// Prgoarm 5: Some of its methods. 
			System.out.println("***********************************************************************");
			System.out.println("Program 5: HashSets methods: Most of its methods we lerned in LISTS, not learning anyhere");
		}

	}

