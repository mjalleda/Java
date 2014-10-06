/* Description: In this class, we learn about Inner class usage. Here, we see 
1.1: Declaring outer instance & static variables.
1.2: Declare outer instance &  static methods.
1.3: Inner class declaration.
1.3.1: inside inner class, declare Instance & static variables
1.3.2: create a method inside Inner class.
1.3.3: Access inner instance variables by using this.
1.3.4.1.: Access outer static and instance variables by outer classname & outerclass.this
1.3.4.2: Can access outer methods both static and instance directly. Also possible by Outerclassname, OuterClassname.this
1.3.5:: Error condition 2: You can't put static method inside inner class.
1.3.6: Error condition. You can't put main method inside inner class.
1.4: Outer Main method
1.4.2: Inside main method >  accessing inner class var & methods by inner object.
1.4.3: Inside main method > As you know that you can access outer/parent class variables & methods by its object. */

package Assign1_fundamentalsThree;
public class Exer17_InnerClasses {
	// 1.1: Outer instance & static variables
	public int ivar1 = 100;
	public static int svar1 = 200;

	// 1.2: Outer instance & static  methods.
	public int m1(int x) {
		return x;
	}
	public static int m2(int y) {
		return y;
	}

	// 1.3: Start Inner class
	public class Inner {
		// 1.3.1: inside innerclass, declare Instance & static variables 
		int ivar2 = 10;
		//Static  variable, you can't declare in inner class.
		//static int svar2 = 20;
		
		// 1.3.2: create a method inside Inner class.
		public int m3() {
			//1.3.3: Access inner instance variables by using this.
			System.out.println("Directly call Inner class instance variables ivar1: "+ivar2);
			System.out.println("With this, Call Inner class instance variables ivar1: "+this.ivar2);
			//1.3.4.1.: Access outer static and instance variables by outer classname & outerclass.this
			//System.out.println("outter class static variables ivar2 is: "+InnerClass.ivar1);
			System.out.println("outter class static variables ivar2 is: "+Exer17_InnerClasses.svar1);
			System.out.println("outter class static variables ivar2 is: "+Exer17_InnerClasses.this.ivar1);
			System.out.println("outter class static variables ivar2 is: "+Exer17_InnerClasses.this.svar1);
			return 0;
		}
		//1.3.4.2: Can access outer methods both static and instance directly. Also possible by Outerclassname, OuterClassname.this
		int c = m1(10); //instance method
		int d = m2(20); //static method
		
		// 1.3.5:: Error condition 2: You can't put static method inside inner class.
		 /* static int m4() { return 0; }
		 */

		// 1.3.6: Error condition. You can't put main method inside inner class.
		/* public static void main(String args){ InnerClass obj1 = new
		 * InnerClass(); } */
		 
	}
	//1.4: Outer Main methid
	public static void main(String args[]) {
		Exer17_InnerClasses obj1 = new Exer17_InnerClasses();
		//1.4.1: Create innerclass object.
		Exer17_InnerClasses.Inner obj2 = obj1.new Inner();
		//1.4.2 accessing innerclass var & methods by inner object.
		obj2.ivar2=9;
		obj2.m3();
		//1.4.3: As you know that you can access outer/parent class variables & methods by its object.
		obj1.ivar1=10;
		obj1.svar1=10;
		obj1.m1(1);
		obj1.m2(8);
	}
}

//Reules:1 > Innerclass go by Inner keyword
// 2: You can't create static variables and methods. 
// 3: Inner class is not standalong it always dependent on outerclass object. That means, you have to create outerclass object first. 
// 4: Inside innerclass > you can access innerclass variables and methods by this keyword or directly.
// 5: Inside innerclass > you can access outerclass variables and methods by Outerclass name and outerclass.this keyword.
// 6: Can't define main method inisde innerclass.
// 7: After you create object for inner class, you can access all innerclass variables and methods.
// 8: All modifiers goes in innerclass except native.
