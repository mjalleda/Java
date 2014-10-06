/* Description: Here we learn about overriding comparator methods.
 To learn this, we need two classes. 
Relationship: assign3AND4_Subclass_Mycomparator & assign3And4_SubClass_Employee are realted. 
assign3AND4_Subclass_Mycomparator has Employee Objects, overrided Comprator methods.

// Question: Why separate class is required for overriding Comparator method why not in Employee class itself.
// Ans: First, we need to Implement Comparator Employee class already implemented Comparable method. */
package Assign5_collections;
import java.util.Comparator;
import java.util.Map;
public class assign3AND4_Subclass_Mycomparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) { //it always takes two objects.
		
		// Create two employee/user-defined Objects.
		assign3And4_SubClass_Employee e1 = (assign3And4_SubClass_Employee) o1;
		assign3And4_SubClass_Employee e2 = (assign3And4_SubClass_Employee) o2;
		
		// Basically comparing two employee objects.
		if (e1.eno < e2.eno) {    
			return -1;			    // if value is lessthan, then place it before
		}
		else if (e1.eno > e2.eno) { // if value is Greaterthan then place it infront.
			return 1;
		}
		else {
			return 0;               // if value is same, which means duplicate. So remove it. 
		}
	}
}
