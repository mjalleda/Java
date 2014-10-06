/* Description: Write a Student class & override some of methods.
 2.1: Override Hashcode & Equals methods
 Note: We use this class in class "assign5Assignments_Main"
 */
package Assign5_collections;
import java.util.*;
public class assign5Assignment1_Student {
	int id;
	String name;
	int age;
	String Classname;
	
	// Create a constructor.
	public assign5Assignment1_Student(int id, String name, int age, String Classname) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Classname = Classname;
	}
	
	// 2.1: Override Hashcode & Equals methods
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		final assign5Assignment1_Student other = (assign5Assignment1_Student) obj;
		if (other.id == id) { 
			return true; 
		} else {
		return false;
		} 
	}

}
