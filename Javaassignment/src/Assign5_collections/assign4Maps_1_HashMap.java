/* Description:  Here we learn about HashMaps.
 * To learn this, we need three classes.
Relationship: assign4Maps_1_HashMap & assign3And4_SubClass_Employee, assign4Maps_1_HashMap_AllIterators are related. 
assign3And4_SubClass_Employee has Employee constructor, overrided equals and hashcode methods.
assign4Maps_1_HashMap_AllIterators has programs for below point 4.
In this class, I wrote 5 programs:
Program 1: How to add same & different datatype values, Order is not preserved. Duplicate keys are not allowed but values are allowed.. 
Program 2: How to compare when maps having pre-defined/primitive/wrapper values 
Program 3: How to compare when maps having custom/userdefined values by overriding Equals & hashcode methods.
Program 4. How to work with Iterators
Program 5: Execute some of its methods.

//Note: By default HashSets and HashMap uses Equals methods for comparision and then remove duplicates. This happens when you add values to sets and maps.
*/

package Assign5_collections;
import java.util.HashMap;
import java.util.Iterator;
public class assign4Maps_1_HashMap {
	public static void main(String args[]) {
		System.out.println("***********************************************************************");
		System.out.println(" 		 HASH Maps");
		System.out.println("*********************************************************************** \n");
		
		HashMap hm1 = new HashMap();
		HashMap hm2 = new HashMap();
		HashMap hm3 = new HashMap();
		HashMap hm4 = new HashMap();
		HashMap hm5 = new HashMap();
		HashMap hm6 = new HashMap();
		assign3And4_SubClass_Employee e1 = new assign3And4_SubClass_Employee(1, "Mamta", 200);
		
		//Program 1: Adding different datatype values to hashmap including custom objects.
		System.out.println("***********************************************************************");
		System.out.println("Program 1: Adding pre & user defined values. Order is not preserved and Duplicate values are allowed print");
		
		hm1.put(10,10);					// Primitive integer
		hm1.put(20,'s'); 				// duplicate value 's' is not allowed for a different key
		hm1.put(30,null);				// Null
		hm1.put(40,null); 				// duplicate value 's' is not allowed for a different key
		hm1.put(50,new Integer(100));	// Wrapper Integer
		hm1.put(60,10.8f); 				// Primitive float
		hm1.put(70,"Mamta");   			// String
		hm1.put(80,'s');				// Primitive char
		hm1.put(90,new Float(23.3f));  	// Wrapper float 
		hm1.put(100,e1);				// Custom/userdefined object
		hm1.put(10,1000);				// duplicate key is not allowed, so new value '1000' will overwriteen on key 10
		hm1.put(20,2000);				// duplicate key is not allowed, so new value '2000' will overwriteen on key 20
		hm2.putAll(hm1);
		hm2.put(110,100);
		System.out.println(hm1); 		// Order is not preserved & Duplicate values doesnt print.
		System.out.println(hm2); 

		//Type 2: How to compare maps when they have pre-defined values (such as primitive, wrapper, String...)
		// Basically we use, Equal methods 
		System.out.println("***********************************************************************");
		System.out.println("Program 2: Comparing maps when they pre-defined values ");
		if (hm1.equals(hm2)) {
			System.out.println("Hashmap HM1 equals to hashmap HM2");
		} else {
			System.out.println("Hashmap MH1 is not equal to hashmap HM2"); //It will execute since both hascodes are different.
		}
		// Interally equal methods based on hashcode on two sets
		System.out.println("HM1 hashcode is: "+hm1.hashCode());
		System.out.println("HM2 hashcode is: "+hm2.hashCode());
		if (hm1.hashCode() == hm2.hashCode()) {
			System.out.println("HM1 hashcode is same as from HM2");
		} else {
			System.out.println("HM1 hashcode is different from HM2"); 
		}
		

		// Type 3: How to compare Maps when they have custom objects. Equals & Hashcode are overrided in assign3_EmployeeSubclass
		System.out.println("***********************************************************************");
		System.out.println("Program 3: Comparing Maps when they have custom objects ");
		assign3And4_SubClass_Employee e11 = new assign3And4_SubClass_Employee(1, "Mamta", 200);
		assign3And4_SubClass_Employee e12 = new assign3And4_SubClass_Employee(3, "Mamta", 200);
		hm3.put(10,e11);
		hm4.put(20,e12);
		System.out.println("HM3 has custom Objects, which are: "+hm3); // Doesn't have duplicate values.
		System.out.println("HM4 has custom Objects, which are: "+hm4); // Doesn't have duplicate values.
		System.out.println("Is HS3 Equal to HS4: "+hm3.equals(hm4)); // eno's in hs3 & hs4 are different.
		
		// Prgoarm 4: All Iterators of HashMap, we learned in assign4_HashMap_AllIterators.  
		// Prgoarm 5: Some of its methods. 
		System.out.println("***********************************************************************");
		System.out.println(" Program 5: HashMap methods: Most of its methods we lerned in LISTS + in itertors + above");
		
	}
}
