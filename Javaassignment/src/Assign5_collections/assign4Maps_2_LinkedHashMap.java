/* Description: Here we learn about HashMaps. For this, we need three classes.
Relationship: assign4_LinkedHashMap & assign3And4_SubClass_Employee, assign4_LinkedHashMap_AllIterators are related. 
assing3_EmployeeSubclass has Employee constructor, overrided equals and hashcode methods.
assign4_LinkedHashMap_AllIterators has programs for point 4.

In this class, we learn below:
Program 1: How to add same & different datatype values, Order is not preserved. Duplicate keys are not allowed but values are allowed.. 
Program 2: How to compare when maps having pre-defined/primitive/wrapper values 
Program 3: How to compare when maps having custom/userdefined values by overriding Equals & hashcode methods.
Program 4. How to work with Iterators
Program 5: Execute some of its methods. 
//Note: By default HashSets and HashMap uses Equals methods for comparision and then remove duplicates. This happens when you add values to sets and maps. */
package Assign5_collections;
import java.util.LinkedHashMap;
public class assign4Maps_2_LinkedHashMap {
	public static void main(String args[]) {
		System.out.println("***********************************************************************");
		System.out.println(" 		 LINKED HASH SET");
		System.out.println("*********************************************************************** \n");
		
		LinkedHashMap Lhm1 = new LinkedHashMap();
		LinkedHashMap Lhm2 = new LinkedHashMap();
		LinkedHashMap Lhm3 = new LinkedHashMap();
		LinkedHashMap Lhm4 = new LinkedHashMap();
		LinkedHashMap Lhm5 = new LinkedHashMap();
		LinkedHashMap Lhm6 = new LinkedHashMap();
		assign3And4_SubClass_Employee e1 = new assign3And4_SubClass_Employee(1, "Mamta", 200);
		
		//Program 1: Adding different data type values to hashset including custom objects.
		System.out.println("***********************************************************************");
		System.out.println("Program 1: Adding pre & user defined values. Order is preserved and Duplicate Keys are not allowed, but values are allowed. Duplicate keys get overrided on existing key");
		
		Lhm1.put(0,10);					// Primitive integer
		Lhm1.put(11,10.8f); 			// Primitive float
		Lhm1.put(11,'s'); 				// Duplicate key overrides the value of existing key
		Lhm1.put(22,"Mamta");   		// String
		Lhm1.put(22,"Mamta K");   		// Duplicate key overrides the value of existing key
		Lhm1.put(33,'s');				// Primitive char
		Lhm1.put(44,'s'); 				// duplicate s is not allowed.
		Lhm1.put(55,null);				// Null
		Lhm1.put(16,null); 				// duplicate null is not allowed.
		Lhm1.put(27,new Integer(100));	// Wrapper Integer
		Lhm1.put(38,new Float(23.3f));  // Wrapper float 
		Lhm1.put(49,e1);				// Custom/userdefined object
		Lhm2.putAll(Lhm1);
		System.out.println(Lhm1); 		// Order is not preserved & Duplicate values doesnt print.
		System.out.println(Lhm2);
		
		//Type 2: How to compare maps when they have pre-defined values (such as primitive, wrapper, String...)
		// Basically we use, Equal methods 
		System.out.println("***********************************************************************");
		System.out.println("Program 2: Comparing maps when they pre-defined values ");
		if (Lhm1.equals(Lhm2)) {
			System.out.println("LinkedHashmap LHM1 equals to Linkedhashmap LHM2");
		} else {
			System.out.println("LinkedHashmap LMH1 is not equal to Linkedhashmap LHM2"); //It will execute since both hascodes are different.
		}
		// Interally equal methods based on hashcode on two sets
		System.out.println("LHM1 hashcode is: "+Lhm1.hashCode());
		System.out.println("LHM2 hashcode is: "+Lhm2.hashCode());
		if (Lhm1.hashCode() == Lhm2.hashCode()) {
			System.out.println("LHM1 hashcode is same as from LHM2");
		} else {
			System.out.println("LHM1 hashcode is different from LHM2"); 
		}
		
		// Type 3: How to compare Maps when they have custom objects. Equals & Hashcode are overrided in assign3_EmployeeSubclass
		System.out.println("***********************************************************************");
		System.out.println("Program 3: Comparing Maps when they have custom objects ");
		assign3And4_SubClass_Employee e11 = new assign3And4_SubClass_Employee(1, "Mamta", 200);
		assign3And4_SubClass_Employee e12 = new assign3And4_SubClass_Employee(3, "Mamta", 200);
		Lhm3.put(10,e11);
		Lhm4.put(20,e12);
		System.out.println("LHM3 has custom Objects, which are: "+Lhm3); // Doesn't have duplicate values.
		System.out.println("LHM4 has custom Objects, which are: "+Lhm4); // Doesn't have duplicate values.
		System.out.println("Is HS3 Equal to HS4: "+Lhm3.equals(Lhm4)); // eno's in hs3 & hs4 are different.
		
		// Prgoarm 4: All Iterators of HashMap, we learned in assign4_HashMap_AllIterators.  
		// Prgoarm 5: Some of its methods. 
		System.out.println("***********************************************************************");
		System.out.println(" Program 5: LinkedHashMap methods: Most of its methods we lerned in LISTS + in itertors + above");
	
}
}
