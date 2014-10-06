/* Description: Here we learn about LinkedHashSets. 
 To learn this, we need two classes.
 Relationship: assign3Sets_LinkedHashset & assign3And4_SubClass_Employee are realted. 
assing3_EmployeeSubclass has Employee constructor, overrided equals and hashcode methods.

Here, I wrote 5 programs:
Program 1: How to add same & different datatype values, Order is not preserved. Duplicate values wont print. 
Program 2: How to compare when sets having pre-defined/primitive/wrapper values 
Program 3: How to compare when sets having custom/userdefined values by overriding Equals & hashcode methods.
Program 4. How to work with Iterators
Program 5: Execute some of its methods.
//Note: By default HashSet and LinkedHashSet uses Equals methods for comparision and then remove duplicates. This happens when you add values to hashSet and LinkedHashset.
*/
package Assign5_collections;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class assign3Sets_2_LinkedHashSet {
		public static void main(String args[]) {
			System.out.println("***********************************************************************");
			System.out.println(" 		 LINKED HASH SET");
			System.out.println("*********************************************************************** \n");
			
			LinkedHashSet hs1 = new LinkedHashSet();
			LinkedHashSet hs2 = new LinkedHashSet();
			LinkedHashSet hs3 = new LinkedHashSet();
			LinkedHashSet hs4 = new LinkedHashSet();
			LinkedHashSet hs5 = new LinkedHashSet();
			LinkedHashSet hs6 = new LinkedHashSet();
			
			//Program 1: Adding different datatype values to hashset including custom objects.
			System.out.println("***********************************************************************");
			System.out.println("Program 1: Adding pre & user defined values. Order is not preserved and Duplicate values wont print");
			hs1.add(10);				// Primitive integer
			hs1.add(10.8f); 			// Primitive float
			hs1.add("Mamta");   		// String
			hs1.add('s');				// Primitive char
			hs1.add('s'); 				// duplicate s is not allowed.
			hs1.add(null);				// Null
			hs1.add(null); 				// duplicate null is not allowed.
			hs1.add(new Integer(100));	// Wrapper Integer
			hs1.add(new Float(23.3f));  // Wrapper float
			assign3And4_SubClass_Employee e1 = new assign3And4_SubClass_Employee(1, "Mamta", 200); 
			hs1.add(e1);				// Custom/userdefined object
			hs2.add(hs1);
			hs2.add(100);
			System.out.println(hs1); 	// Order is preserved & Duplicate values doesnt print.
			
			//Type 2: How to compare sets when they have pre-defined values (such as primitive, wrapper, String...)
			// Basically we use, Equal methods 
			System.out.println("***********************************************************************");
			System.out.println("Program 2: Comparing sets when they pre-defined values ");
			if (hs1.equals(hs2)) {
				System.out.println("HS1 equals to HS2");
			} else {
				System.out.println("HS1 is not eual to HS2"); //It will execute since both hascodes are different.
			}
			// Interally equal methods based on hashcode on two sets
			System.out.println("HS1 hashcode is: "+hs1.hashCode());
			System.out.println("HS2 hashcode is: "+hs1.hashCode());
			if (hs1.hashCode() == hs2.hashCode()) {
				System.out.println("HS1 hashcode is same as from HS2");
			} else {
				System.out.println("HS1 hashcode is different from HS2"); 
			}

			// Type 3: How to compare Sets when they have custom objects. Equals & Hashcode are overrided in assign3_EmployeeSubclass
			System.out.println("***********************************************************************");
			System.out.println("Program 3: Comparing sets when they have custom objects ");
			assign3And4_SubClass_Employee e11 = new assign3And4_SubClass_Employee(1, "Mamta", 200);
			assign3And4_SubClass_Employee e12 = new assign3And4_SubClass_Employee(3, "Mamta", 200);
			hs3.add(e11);
			hs4.add(e12);
			System.out.println("HS3 has custom Objects, which are: "+hs3); // Doesn't have duplicate values.
			System.out.println("HS4 has custom Objects, which are: "+hs4); // Doesn't have duplicate values.
			System.out.println("Is HS3 Equal to HS4: "+hs3.equals(hs4)); // eno's in hs3 & hs4 are different.
			
			
			// Prgoram 4: There are not special iterators for Sets except Iterators.
			// Type 1: Using Regular for loop 
			System.out.println("***********************************************************************");
			System.out.println("Program 4: Iterators ");
			System.out.println("Type 1: Using Regular for loop");
			int i;
			for(i=0 ; i<=5 ;i++) {
				hs5.add(i);
			}
			hs6.addAll(hs5);
			System.out.println("HashSet hs5 values are: "+hs5);
			System.out.println("HashSet hs6 values are: "+hs6);
			
			// Type 2: Using Iterator which works on All List & Set classes. Using all three methods of Iterator. hasnext, next and remove.
			// Note: By default HashSet and LinkedHashSet uses Equals methods for comparision and then remove duplicates. This happens when you add values to hashSet and LinkedHashset.
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println("Type 2: Using Iterator all its three methods: hasnext, next and remove");
			Iterator itr = hs5.iterator(); //Get all list values into Iterator and work on Iterator.
			while(itr.hasNext())    
			{    
				Integer i2 = (Integer) itr.next(); //Next doesnt work primitve type so made i2 as wrapper type.
				if(i2.intValue() % 2==0)  // Since arth values like % doesnt work on primitve, so using intValue which makes WrapperInteger to int.    
				{    
					System.out.println("Values which can be divided by 2 are: "+i2);    
				}    
				else     // otherwise remove.
				{    
					itr.remove();  //Values 1,3 & 5 gets not 0 when you divide them by 2.
				}    
			}
			System.out.println("New hashSet HS5 values are: "+hs5);
			
			// Prgoarm 5: Some of its methods. 
			System.out.println("***********************************************************************");
			System.out.println(" Program 5: HashSets methods: Most of its methods we lerned in LISTS, not learning anyhere");
		}
	}

