/* Description: In this class, we learn about MethodLocaInnerclasses
 MethodLocaInnerclasses are not accessible from outside of the method, so outside of class is out of question. 
In this assignment, we learn 
 -  how to create methodlocalinnerclass, its variables/methods & how to create this in both static/instance outterclass methods. 
Remember: We have two types of innerclasses. Instance and static. We will study about static in later assignments, but here we learn about instance innerclass. */
package Assign1_fundamentalsThree;

public class Exer17_MethodLocalInnerClass {
	int x = 1;
	int y = 5;
	
	// Create a static  method in outterclass.
	static int  m1(int a, int b) {
		int x = 10;
		int y = 50;
		
		// Creation of Innerclass.
		class Employee {
			int x = 100;
			int y = 500;
				public void m2(int x, int y) {
				System.out.println(x);  }
		}
		// Create MethodLocalInnerClass inside instanceouttermethod.
		Employee e = new Employee();
		//System.out.println(e.m2(2, 2)); // this is not possible.
		System.out.println("********* PRINT METHODLOCAL INNERCLASS INSIDE STATIC METHOD *****************");
		System.out.println("print x from outside from m1 method    :"+x);
		System.out.println("print y from outside from m1 method    :"+y);
		System.out.println("print x from methodinnerclass Employee :"+e.x);
		System.out.println("print y from methodinnerclass Employee :"+e.y);
		return 0;
	}
	// Create a instance method in outterclass.
	 int  m3(int a, int b) {
		int x1 = 20;
		int y1 = 30;
		// create a methodlocalinnerclass inside instancemethod.
		class Employee1 {
			int x1 = 200;
			int y1 = 300;
				public void m2(int x, int y) {
				System.out.println(x);  }
		}
		// creating an object for methodlocalinnerclass
		Employee1 e1 = new Employee1();
		//System.out.println(e1.m2(2, 2)); // this is not possible
		System.out.println("\n********* PRINT METHODLOCAL INNERCLASS INSIDE INSTANCE METHOD *****************");
		System.out.println("print x1 from outside from m1 method    :"+x1);
		System.out.println("print y1 from outside from m1 method    :"+y1);
		System.out.println("print x1 from methodinnerclass Employee :"+e1.x1);
		System.out.println("print y1 from methodinnerclass Employee :"+e1.y1);
		return 0;
	}
	

	public static void main(String args[]){
		// Not possible to call Methodinnerclass directly it is inside a method. 
		//MethodLocalInnerClass.m1(5,5)
		//MethodLocalInnerClass.e
		
		// You need to call staticmethod m1, to execute it.
		Exer17_MethodLocalInnerClass.m1(5,5);
		// In order to call instance methods m3, you need to create an object for the outterclass.
		Exer17_MethodLocalInnerClass Obj1 =  new Exer17_MethodLocalInnerClass();
		Obj1.m3(5,5);
	}
}
