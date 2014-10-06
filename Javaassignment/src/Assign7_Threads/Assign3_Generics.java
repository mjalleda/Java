// Description: How to write more generic List. Example with ArrayList. 
// Basically if you know what type of data your list will have, then make List as more generic. So you can avoid typecasting.

package Assign7_Threads;
import java.util.ArrayList;
public class Assign3_Generics {
	public static void main(String args[]) {
		Assign2_Threads_SynchronizedBlock_Employee emp1 = new Assign2_Threads_SynchronizedBlock_Employee();
		Assign2_Threads_SynchronizedBlock_Employee emp2 = new Assign2_Threads_SynchronizedBlock_Employee();
		Assign2_Threads_SynchronizedBlock_Employee emp3 = new Assign2_Threads_SynchronizedBlock_Employee();
		ArrayList<Assign2_Threads_SynchronizedBlock_Employee>  AL1 =  new ArrayList<Assign2_Threads_SynchronizedBlock_Employee>();
		AL1.add(emp1);
		AL1.add(emp2);
		AL1.add(emp3);
		// AL1.add(10); - This gives error since AL1 is generic ArrayList type. so it doesnt take raw values.

		int i;
		for(i=0; i<AL1.size(); i++) {
			// Return type also generic type. I know it returns only employee object so I am catching it in Employee Object name.
			Assign2_Threads_SynchronizedBlock_Employee name = AL1.get(i);
			System.out.println(name);
		}
		
		//Raw ArrayList.
		ArrayList AL2 = new ArrayList();
		AL2.add(10);
		AL2.add('s');
		AL2.add(emp1); // You can add custom objects. 
		int j;
		for(j=0; j<AL2.size(); j++) {
			// Return type also generic type. I know it returns only employee object so I am catching it in Employee Object name.
			System.out.println(AL2);
			// We need to type cast below return type otherwise it returns errors
			Object  obj = AL2.get(j);
		}
		
		
}
}
