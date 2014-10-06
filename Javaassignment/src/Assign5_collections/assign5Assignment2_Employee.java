/* Description: Write a Employee class & override some of methods.
 2.1: Override Hashcode & Equals methods
 2.2: Override CompareTo method
 Note: We use this class in class "assign5Assignment2_Main"
 */
  
package Assign5_collections;
import java.lang.*;
public class assign5Assignment2_Employee implements Comparable {
	int id;
	String name;
	int salary;
	
	public assign5Assignment2_Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// 2.1: Override Hashcode & Equals methods
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		final assign5Assignment2_Employee other = (assign5Assignment2_Employee) obj;
		if (other.id == id) { 
			return true; 
		} else {
		return false;
		} 
	}


	// 2.2: Override CompareTo method
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		final assign5Assignment2_Employee other = (assign5Assignment2_Employee) obj; // Basically passing Employee object to compareTo method. And returntype is also Employee Object type.
			if (this.id < other.id) {  
				return -1;			    // if value is lessthan, then place it before
			}
			else if (this.id > this.id) 
			{ 
				return 1; 				// if value is Greaterthan then place it infront.
			}
			else {
				return 0;               // if value is same, which means duplicate. So remove it. 
			}
		}

}
