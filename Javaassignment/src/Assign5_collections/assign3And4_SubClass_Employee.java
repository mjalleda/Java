/* Description: Here we learn about overriding comparator methods.
To learn this, we need two classes. 
Relationship: assign3AND4_Subclass_Mycomparator & assign3And4_SubClass_Employee are realted. 
assing3_EmployeeSubclass has Employee fields, constructor, overrided equals, hascode and Comprable methods.
*/
package Assign5_collections;
import java.lang.*;
public class assign3And4_SubClass_Employee implements Comparable  {	
		// 1.1: Fields.
		int eno;
		String name;
		int salary;
		
		// 1.2: Create parameterized constructor
		public assign3And4_SubClass_Employee(int eno, String name, int salary) {
			this.eno = eno;
			this.name = name;
			this.salary = salary;
		}
		
		// 2.1: Override Hashcode & Equals methods
		@Override
		public int hashCode() {
			return this.eno;
		}
		@Override
		public boolean equals(Object obj) {
			final assign3And4_SubClass_Employee other = (assign3And4_SubClass_Employee) obj;
			if (other.eno == eno) { 
				return true; 
			} else {
			return false;
			} 
		}

		// 2.2: Override CompareTo method
		@Override
		public int compareTo(Object obj) {
			// TODO Auto-generated method stub
			final assign3And4_SubClass_Employee other = (assign3And4_SubClass_Employee) obj; // Basically passing Employee object to compareTo method. And returntype is also Employee Object type.
				if (this.eno < other.eno) {  
					return -1;			    // if value is lessthan, then place it before
				}
				else if (this.eno > this.eno) 
				{ 
					return 1; 				// if value is Greaterthan then place it infront.
				}
				else {
					return 0;               // if value is same, which means duplicate. So remove it. 
				}
			}

		public static void main (String args[]) {
		}

		public int getEno() {
			return eno;
		}

		public void setEno(int eno) {
			this.eno = eno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		
}

