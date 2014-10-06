/* Description: Learning about Clonable interface & its methods on class.
Basically, implement Clonable interface on a class, and then execute clone() method on the same class.
Basically, you can clone one object from another object, that is nothing but copying all methods and properties from object to Object.  */
package Assign2_javalang;
import java.lang.Cloneable;
public class javalang_clonable implements Cloneable {
	String name1;
	String name2;
	public javalang_clonable(String name1, String name2) {
		super();
		this.name1 = name1;
		this.name2 = name2;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		{		
			javalang_clonable o1 = new javalang_clonable("Mamta", "Saritha"); // You should apply only on this class since it implemented clonable interface. 
			javalang_clonable o2 = (javalang_clonable) o1.clone(); // 
			System.out.println("First value of Object o1 is : "+o1.name1);
			System.out.println("Second value of Object o1 is: "+o1.name1);
			System.out.println("First value of Object o2 is : "+o2.name2);
			System.out.println("Second value of Object o2 is: "+o2.name2);
			boolean temp = o2.equals(o1); //comparing hashcodes, they are different.
			System.out.println("Compare if both object's hashcodes are ssame: "+temp);
		}
	}
}
