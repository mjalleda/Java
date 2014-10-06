/* Description: How to use Java Object Class: Which contains properties and behaviors */
package Assign2_javalang;
import java.util.Properties;
public class javaLangObjectClass extends Object {

	public static void main(String args[])
	{
		Object obj1 = new Object();
		Object obj2 = new Object();
		int s = obj1.hashCode();
		System.out.println("hascode of Object1 is: "+s);
		boolean temp = obj1.equals(obj2);
		System.out.println("Comparing two objects: "+temp);
	}
}
