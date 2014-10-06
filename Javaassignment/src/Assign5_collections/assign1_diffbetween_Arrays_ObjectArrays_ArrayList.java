/* Description: Array Types & their differences.
Array can be defined in three types. ConcreateArray, Object Arrays and Collection Arrays
 Difference between them.
 1: Concreate Arrays    : Size can't grow and can't take diff datatype values.
 2: Object Arrays          :  Size can't grow but takes diff datatype values.
 3: Collections Arrays  : Size can grow and takes diff datatype values too.
Relationship. Using different class objects in ObjectArrays. The another class is assign1_diffbetween_Arrays_ObjectArrays_ArrayList_Subclass
*/

//**************************  CODING STARTS *****************************//
package Assign5_collections;
import java.util.ArrayList;
public class assign1_diffbetween_Arrays_ObjectArrays_ArrayList {
	
	public static void main(String args[]) {
		// *******************  CONCRETE ARRAYS ****************************//
		// When you define one array as one dataype, that type of values only allowed not others.
		// you can't declare them as objects.
		// Size can't grow automatically.
		System.out.println("**************************************************");
		System.out.println("************** CONCRETE ARRAYS   ****************");
		int i;
		int[] arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 10;
		arr1[2] = 100;
		arr1[3] = new Integer(100); //since autoboxing and unboxing feature Wrapper Integer is allowed for int array.
		//arr1[3] = 10.00; // different datatype value cant be initialized.
		//arr1[5] = "Mamta"; // different datatype value can't be initialized.
		// arr1[6] = 60; You will get ArrayIndexOutOfBoundException at line 12. Size can't be grow.
		
		System.out.println("The size of ObjectArray is: "+arr1.length);
		for (i=0; i<arr1.length; i++) {
			System.out.println("print concreate array values: "+arr1[i]);
		}
			
		
		// *******************  OBJECT ARRAYS ****************************//
		// Any datatype values are allowed like Wrapper, primitive, Float.
		// you have to declare them as objects.
		// Size can't grow automatically.
		System.out.println("***********************************************");
		System.out.println("************** OBJECT ARRAYS   ****************");
		Object[] arr2 = new Object[5];
		arr2[0] = new Integer(200);
		arr2[1] = new Float(200.1);
		arr2[2] = new assign1_diffbetween_Arrays_ObjectArrays_ArrayList_Subclass(1); //another class object can't be intialized. 
		arr2[3] = 2000; // primitive type is allowed. JVM converts into wrapper using autoboxing/unboxing freatures.
		arr2[4] = "Mamta"; // different datatypes are allowed.
		// arr2[5] = 60; You will get ArrayIndexOutOfBoundException at line 12. Size can't grow.	
		System.out.println("The size of ObjectArray is: "+ arr2.length);		
		for (i=0; i<arr2.length; i++) {
			System.out.println("print Object array values: "+arr2[i]);
		}
				
		// *******************  COLLECTION ARRAYLIST ****************************//
		// Any datatype values are allowed like Wrapper, primitive, Float.
		// you can't declare them as objects.
		// Size can grow automatically.
		System.out.println("***************************************************");
		System.out.println("************** COLLECTION ARRAYS   ****************");
		ArrayList arr3 = new ArrayList(2);
		arr3.add("Laxmi");
		arr3.add("Gorantla");
		arr3.add(3);
		arr3.add(30.0); //Size can grow
		arr3.add(300.10);
		arr3.add(3000.10); 
 		arr3.add(30000.10); 
		// arr3[5] = new Integer(10); // you can't intialize objects.
		// arr3[6] = 100;		 	  // you can't initialize direct values without addmethod.
		// arr2[7] = 60; You will get ArrayIndexOutOfBoundException at line 12. Size can't be grow.
		System.out.println("The size of ConcreteArray is: "+ arr3.size());		
			for (i=0; i<arr3.size(); i++) {
				System.out.println("print Concreate ArrayList values: "+arr3.get(i));
			}
		System.out.println("***********************************************");	
}
}
