/* Description: Here we learn about HashSets. To learn this, we need three classes.
Relationship: assign3_TreeSet, assign3AND4_Subclass_Mycomparator & assign3And4_SubClass_Employee are related. 
assign3And4_SubClass_Employee has Employee constructor, overrided equals and hashcode methods.
assign3AND4_Subclass_Mycomparator implemented Comparator and Overrided Compare method to compare Employee objects.

Here, I coded 6 programs:
Program 1:   How to add same & different datatype values, Order should be some type of sorting. Duplicate values are not allowed/printed. 
Program 2.1: How to compare/Sort when Treeset having pre-defined/primitive/wrapper values 
Program 2.2: How to compare/sort when Treeset having  pre-defined values. TreeSet uses default Comparable method.
Program 2.3: How to compare/sort when Treeset having user-defined values. For this, we can Override Comparable & Comparator methods.
Program 3:   How to work with Iterators
Program 4:   Execute some of its methods.
//Note: By default TreeSet uses Comparable methods for comparision/sorting and then remove duplicates. This happens when you add values to Treeset.
*/
package Assign5_collections;
import java.util.Iterator;
import java.util.TreeSet;
public class assign3Sets_3_TreeSet {
	public static void main(String args[]) {
		System.out.println("***********************************************************************");
		System.out.println(" 		 TREE SET");
		System.out.println("*********************************************************************** \n");
		
		TreeSet Ths1 = new TreeSet();
		TreeSet Ths2 = new TreeSet();
		TreeSet Ths3 = new TreeSet();
		TreeSet Ths4 = new TreeSet();
		TreeSet Ths5 = new TreeSet();
		TreeSet Ths6 = new TreeSet();
		
		//Program 1: Adding different datatype values to hashset including custom objects.
		System.out.println("***********************************************************************");
		System.out.println("Program 1: Adding pre & user defined values. Order is not preserved and Duplicate values wont print");
		assign3And4_SubClass_Employee e1 = new assign3And4_SubClass_Employee(1, "Samta", 200);
		
		Ths1.add(10);				  // Primitive integer
		Ths1.add(new Integer(100));	  // Wrapper Integer
		Ths1.add(10);				  // It doesnt print duplicate value.
		//Ths1.add(10.8f); 			  // ClassCast   exception returns since it only allows same datatype values
		//Ths1.add("Mamta");   		  // ClassCast   exception returns since it only allows same datatype values
		//Ths1.add('s');			  // ClassCast   exception returns since it only allows same datatype values
		//Ths1.add('s'); 			  // ClassCast   exception returns since it only allows same datatype values
		//Ths1.add(null);			  // NullPointer exception returns
		//Ths1.add(null); 			  // duplicate null is not allowed.
		//Ths1.add(new Float(23.3f)); // ClassCast   exception returns since it only allows same datatype values
		//Ths1.add(e1);				  // ClassCast   exception returns since it only allows same datatype values
		Ths2.add(Ths1);               // ClassCast   exception returns since it only allows same datatype values 
		//Ths2.add(100);
		System.out.println("Values of TreeSet Ths1 are:: "+Ths1); 	  // It sorts values and then prints then in sorting order. Yes, duplicate values are not allowed.
		System.out.println("Values of TreeSet Ths2 are:: "+Ths2);
		
		// Program 2.1: How to compare/sort Treeset when it have pre-defined values (such as primitive, wrapper, String...)
		// Internally TreeSet uses Comparable method for sorting. Which means by default. Later uses, equals method for comparision.   
		System.out.println("***********************************************************************");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Program 2.1: Comparing TreeSet when it have pre-defined values");
		if (Ths1.equals(Ths2)) {
			System.out.println("THS1 equals to THS2");
		} else {
			System.out.println("THS1 is not equal to THS2"); //It will execute since both hascodes are different.
		}
		// Interally equal methods based on hashcodes of two sets
		System.out.println("THS1 hashcode is: "+Ths1.hashCode());
		System.out.println("THS2 hashcode is: "+Ths1.hashCode());
		if (Ths1.hashCode() == Ths2.hashCode()) {
			System.out.println("THS1 hashcode is same as from THS2");
		} else {
			System.out.println("THS1 hashcode is different from THS2"); 
		}

		// Program 2.2: TreeSet has user-defined objects, Sort them by using Overrided Comparable method.
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Program 2.2: Sorting TreeSet when it has user-defined Objects/values");
		TreeSet TS3 = new TreeSet();
		assign3And4_SubClass_Employee e31 = new assign3And4_SubClass_Employee(9, "Mamta", 200);
		assign3And4_SubClass_Employee e41 = new assign3And4_SubClass_Employee(4, "Mamta", 200);
		assign3And4_SubClass_Employee e51 = new assign3And4_SubClass_Employee(2, "Mamta", 200);
		assign3And4_SubClass_Employee e61 = new assign3And4_SubClass_Employee(2, "Mamta", 200);
		TS3.add(e31);
		TS3.add(e41);
		TS3.add(e51);
		TS3.add(e61);
		System.out.println("Sorted TreeSet TS3 is : "+TS3); // sort then in Asc order + it doesnt allow duplicate values.
		
		// Program 2.3: TreeSet has user-defined objects, Sort them by using Overrided Comparator method. 
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Program 2.3: Sorting TreeSet when it has user-defined Objects/values");
		TreeSet TS4 = new TreeSet(new assign3AND4_Subclass_Mycomparator());
		assign3And4_SubClass_Employee e32 = new assign3And4_SubClass_Employee(9, "Mamta", 200);
		assign3And4_SubClass_Employee e42 = new assign3And4_SubClass_Employee(4, "Mamta", 200);
		assign3And4_SubClass_Employee e52 = new assign3And4_SubClass_Employee(2, "Mamta", 200);
		assign3And4_SubClass_Employee e62 = new assign3And4_SubClass_Employee(2, "Mamta", 200);
		TS4.add(e32);
		TS4.add(e42);
		TS4.add(e52);
		TS4.add(e62);
		System.out.println("Sorted treeSet TS4 is: "+TS4);
		
		// Prgoram 3: There are not special iterators for TreeSet except Iterator method.
		// Type 1: Using Regular for loop 
		System.out.println("***********************************************************************");
		System.out.println("Program 3: Iterators ");
		System.out.println("Program 3.1: Using Regular for loop");
		int i;
		for(i=0 ; i<=5 ;i++) {
			Ths5.add(i);
		}
		Ths6.addAll(Ths5);
		System.out.println("HashSet hs5 values are: "+Ths5);
		System.out.println("HashSet hs6 values are: "+Ths6);
		
		// Type 2: Using Iterator which works on All List & Set classes. Using all three methods of Iterator. hasnext, next and remove.
		// Note: By default HashSet and LinkedHashSet uses Equals methods for comparision and then remove duplicates. This happens when you add values to hashSet and LinkedHashset.
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println("Program 3.2: Using Iterator all its three methods: hasnext, next and remove");
		Iterator itr = Ths5.iterator(); //Get all list values into Iterator and work on Iterator.
		while(itr.hasNext())    
		{    
			Integer i2 = (Integer) itr.next(); //Next doesnt work primitve type so made i2 as wrapper type.
			if(i2.intValue() % 2==0)  // Since arth values like % doesnt work on primitve, so using intValue which makes WrapperInteger to int.    
			{    
				System.out.println("Values which can be divided by 2 are: "+i2);    
			}    
			else               // otherwise remove.
			{    
				itr.remove();  //Values 1,3 & 5 gets not 0 when you divide them by 2.
			}    
		}
		System.out.println("New hashSet HS5 values are: "+Ths5);
		
		// Prgoarm 5: Some of its methods. 
		System.out.println("***********************************************************************");
		System.out.println("Program 5: HashSets methods: Most of its methods we lerned in LISTS, not learning anyhere");
	}
}
