/* Description: Here, we learn different types of Iterators.
We learn all iterators including regular for loop.
- Regular for loop
- Itertor - which works on Lists & set classes.
- ListItertor - which works only one List classes.
- Enumarator - which only works on legacy, which is Vector. */

package Assign5_collections;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;
public class assign2Lists_AllIterators {
	public static void main(String args[]) {
	ArrayList A1 = new ArrayList();
	ArrayList A2 = new ArrayList();
	Vector V1 = new Vector();
	V1.add("Sarta");
	V1.add("Samta");
	V1.add("Savita");
	
	// Type 1: Using Regular for loop 
	System.out.println("******************************");
	System.out.println("Type 1: Using Regular for loop");
	int i;
	for(i=0 ; i<=5 ;i++) {
		A1.add(i);
	}
	A2.addAll(A1);
	System.out.println(A1);
	System.out.println(A2);
	
	// Type 1: Using Iterator which works on All List & Set classes. Using all three methods of Iterator. hasnext, next and remove. 
	System.out.println("***********************************************************************");
	System.out.println("Type 2: Using Iterator all its three methods: hasnext, next and remove");
	Iterator itr = A1.iterator(); //Get all list values into Iterator and work on Iterator.
	while(itr.hasNext())    
	{    
		Integer i2 = (Integer) itr.next(); //Next doesnt work primitve type so made i2 as wrapper type.
		if(i2.intValue() % 2==0)  // Since arth values like % doesnt work on primitve, so using intValue which makes WrapperInteger to int.    
		{    
			System.out.println(i2);    
		}    
		else     // otherwise remove.
		{    
			itr.remove();  //Values 1,3 & 5 gets not 0 when you divide them by 2.
		}    
	}
	System.out.println(A1);
	
	//Type 3: Using ListIterator some of its : hasnext, next, Set, equals": 
	System.out.println("***********************************************************************");
	System.out.println("Type 3: Using ListIterator some of its : hasnext, next, Set, equals");
	ListIterator Litr = A2.listIterator();
	while(Litr.hasNext()) {
		Integer i3 = (Integer) Litr.next();
		if(i3.equals(1)) {
			//none
		}
		else
		{
			Litr.set(null);		
		}
	}
	System.out.println(A2);
	
	
	//Type 4: Using Enumarator some of its methods :Elemetns, nextelement": 
	System.out.println("***********************************************************************");
	System.out.println("Type 4:  Using Enumarator some of its methods :Elemetns, nextelement");
	Enumeration en = V1.elements();
	while(en.hasMoreElements()) {
		String i4 = (String)en.nextElement();
		if(i4.equals("Sarta")) {
			System.out.println(i4);
		}
	}
}
}
