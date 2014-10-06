/* Description: Usage of HashMaps with an example. And display the list of students belongs to the class-name
Relationship: We use the following class too assign5Assignment1_Student.java
We have a Student class with following properties: Class is "assign5Assignment1_Student.java"
-	Student Id, Student name,age, Student class-name.
- A constructor to initialize the properties with default values.

In this class, we perform the below operations
- Initialize list of Students with different values.
- Split the list of students into Map with class-name as key and list of students is value.
- Define a method to take class-name as argument and display the list of students belongs to the class-name.
*/

package Assign5_collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class assign5Assignments_Main {
	public static void main(String args[]) {
		HashMap HM = new HashMap();
		assign5Assignment1_Student StuObj1 = new assign5Assignment1_Student(10, "Neta", 27, "Comp");
		assign5Assignment1_Student StuObj2 = new assign5Assignment1_Student(20, "Sitdsfdsaa", 333,  "Comp");
		assign5Assignment1_Student StuObj3 = new assign5Assignment1_Student(30, "Rani", 27, "Maths");
		assign5Assignment1_Student StuObj4 = new assign5Assignment1_Student(40, "Rita", 27, "Civils");
		HM.put("Comp", StuObj1);
		HM.put("Software", StuObj2);
		HM.put("Maths", StuObj3);
		HM.put("Civils", StuObj4);
		
		System.out.println("******************************************************");
		System.out.println("********* METHOD : KEYSET & ITERATOR *****************");
		Set s2 = HM.keySet();
		// 1: Return Keys
		Iterator it2 = s2.iterator();
		System.out.println("---------------");
		System.out.println("Returning Keys");
		while(it2.hasNext()) {
			String e2 = (String) it2.next();
			System.out.println("The key is:"+e2);	// Getting only keys
		}
		// 2: Return Values
		// If you want see only particular class values
		Iterator it3 = s2.iterator();
		System.out.println("---------------");
		System.out.println("Returning Values");
		
		while(it3.hasNext()) {
			String e3 = (String) it3.next();
			
			if(e3 == "Comp") {
				System.out.println("The value of key Comp is: "+HM.get(e3));	// Getting only values by using keyss	
			}
		}
		Iterator it4 = s2.iterator();
		// If you want see all key values.
		System.out.println("---------------");
		System.out.println("Returning Values");
		while(it4.hasNext()) {
			String e4 = (String) it4.next();
				System.out.println("The key is : "+ e4 + " The value is:"+HM.get(e4));	// Getting only values by using keys
		}
	}
}

