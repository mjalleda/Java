/* Description: Write a program to eliminate the duplicate employees from that list and print it in sorting order based on the Employee number.
Relationship: We use the following class. assign3And4_SubClass_Employee
We already have a Employee Class and with below properties to it.
  - employee Id, employee name, salary and date of birth
  - it has getters and setters. 
  - it also have a constructor to initialize instance variable employee Id, employee name, salary and date of birth.

In below class, it has list of Employee objects. Some of the employee ids are same in that list.
- We need to write a logic to eliminate the duplicate employees from that list and print it as some sorting order based on the Employee number.
*/
// Relationships: assign3And4_SubClass_Employee is employee class which has constructor, fields, getter and setter, overrided hashcode and equal methods and comparable methods.
package Assign5_collections;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class assign5Assignment2_Main {
	public static void main(String args[]) {
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
	}	
	}

