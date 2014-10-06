/* Description: Here, we learn how to declare and use 
  -	Static variables
  - Static methods
  - Instance variables
  - Instance methods. 
 
  Below, we create
 1: static, instance variables at class level. 
 2: Create static(ex:void) and instance(any regular) methods. 
 3: Create objects in both methods.
 4: we try to modify both instance and static variables in both methods and observe the results. 
 Results are: you can't modify static variable anywhere. */

package Assign1_fundamentalsOne;

public class Exer05_VariablesAndMethods_BothStaticAndInstance {	
		
		// 1: Static variables 
		static String staticVar1;
		static String staticVar2 = "Mamatha";
		static int staticVar3 = 1;
		
		// 2: Instance variables
		int instanceVar1;
		int instanceVar2 = 10;
		
		public static void main(String args[])  // main is a a static method
		{
		// 3: Update instance variable value & print in main/static method.
		int instanceVar2 = 20;
		System.out.println("my instance variable value is: "+instanceVar2);
		
		// 4: Update staticvariable value.
		// String staticVar1 = "Mamatha J"; You can't re-initialize static variables since I got an error.
		
		// 5: Create objects for StudentClass1
		Exer05_VariablesAndMethods_BothStaticAndInstance Obj1 = new Exer05_VariablesAndMethods_BothStaticAndInstance();
		Exer05_VariablesAndMethods_BothStaticAndInstance Obj2 = new Exer05_VariablesAndMethods_BothStaticAndInstance();
		Exer05_VariablesAndMethods_BothStaticAndInstance Obj3 = new Exer05_VariablesAndMethods_BothStaticAndInstance();
		Exer05_VariablesAndMethods_BothStaticAndInstance Obj4 = new Exer05_VariablesAndMethods_BothStaticAndInstance();
		Exer05_VariablesAndMethods_BothStaticAndInstance Obj5 = new Exer05_VariablesAndMethods_BothStaticAndInstance();
		
		// 6: access static variables by objects/class/directly. remember you can't modify staticvariables.
		System.out.println("my static variable value is: "+Obj1.staticVar2); 		  // can access staticvariable by using object refernece 
		System.out.println("my static variable value is: "+Exer05_VariablesAndMethods_BothStaticAndInstance.staticVar2); // can access staticvariable by classname
		System.out.println("my static variable value is: "+staticVar2); 			  // can access staticvariable directly
		
		// 7: access instance variables by objects/classname. 
		Obj1.instanceVar1 = 100; // remember you can modify instancevariables by using objects.
		System.out.println("my static variable value is: "+Obj1.instanceVar1); // can access instancevariable by using object refernece
		int instanceVar1 = 200; // remember you can also modify instancevariables by their datatypes.
		System.out.println("my static variable value is: "+instanceVar1); 	  // can access instancevariable directly
		//System.out.println("my static variable value is: "+StudentClass1.instanceVar1); 	  // can't access instancevariable with classname. 
		}
		
		public int regularmethod() // regularmethod/instance method which is nonstatic. 
		{
			// 8: Update instance variable value & print in instance/regular method.
			int instanceVar2 = 30;
			System.out.println("my instance variable value is: "+instanceVar2);
			
			// 9: Update staticvariable value.
			// String staticVar1 = "Mamatha JA"; You can't re-initialize static variables since I got an error.
			
			// 10: Create objects for StudentClass1
			Exer05_VariablesAndMethods_BothStaticAndInstance Obj6 = new Exer05_VariablesAndMethods_BothStaticAndInstance();
			Exer05_VariablesAndMethods_BothStaticAndInstance Obj7 = new Exer05_VariablesAndMethods_BothStaticAndInstance();
			Exer05_VariablesAndMethods_BothStaticAndInstance Obj8 = new Exer05_VariablesAndMethods_BothStaticAndInstance();
			Exer05_VariablesAndMethods_BothStaticAndInstance Obj9 = new Exer05_VariablesAndMethods_BothStaticAndInstance();
			Exer05_VariablesAndMethods_BothStaticAndInstance Obj10 = new Exer05_VariablesAndMethods_BothStaticAndInstance();
				
			// 11: access static variables by objects/class/directly. remember you can't modify staticvariables.
			System.out.println("my static variable value is: "+Obj6.staticVar2); 		  // can access staticvariable by using object refernece 
			System.out.println("my static variable value is: "+Exer05_VariablesAndMethods_BothStaticAndInstance.staticVar2); // can access staticvariable by classname
			System.out.println("my static variable value is: "+staticVar2); 			  // can access staticvariable directly
			
			// 12. access instance variables by objects/classname. 
			Obj6.instanceVar1 = 100; // remember you can modify instancevariables by using objects.
			System.out.println("my static variable value is: "+Obj6.instanceVar1); // can access instancevariable by using object refernece
			int instanceVar1 = 200; // remember you can also modify instancevariables by their datatypes.
			System.out.println("my static variable value is: "+instanceVar1); 	  // can access instancevariable directly
			//System.out.println("my static variable value is: "+StudentClass1.instanceVar1); 	  // can't access instancevariable with classname.
			return 10;
			}
	}