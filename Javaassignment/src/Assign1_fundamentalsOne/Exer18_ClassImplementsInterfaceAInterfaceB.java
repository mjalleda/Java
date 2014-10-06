/* Description: Here, we see how a concrete class implements interface class's methods.
  - How to call/use Interface classes by other interface class,
  - How to call Interface class by concrete class 
Relationship: Exer13_InterfaceA, Exer13_InterfaceB, Exer13_SubInterface are interfaces. Exer13_ClassImplementsInterfaceAInterfaceB is concreate class.
The class Exer13_ClassImplementsInterfaceAInterfaceB implements both Interfaces "InterfaceA, "InterfaceB" methods.

In this class, we lear,
Using Implements keyword to call Interface InterfaceA & InterfaceB.
1.1: How to call interface variables out of main
1.2: How to call interface variables inside main
1.3: After interface methods implementation, how to call interface methods out of main 
1.4: After interface methods implementation, how to call inside main */

package Assign1_fundamentalsOne;
public class Exer18_ClassImplementsInterfaceAInterfaceB implements Exer18_InterfaceA, Exer18_InterfaceB {

		@Override
		public int m1(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int m2(int d, int e) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int m3(int e, int f) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int m4(int a) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		// 1.1: How to call interface variables out of main.
		int k = Exer18_InterfaceA.b;
		
		// 1.3: how to call interface methods out of main.
		int l = m1(1,2);
		
		public static void main(String args[]) {
			// 1.4: Inside main how to call interface methods.Call interface methods after implementation by object. 
			Exer18_ClassImplementsInterfaceAInterfaceB ClassImplementsInterfacea = new Exer18_ClassImplementsInterfaceAInterfaceB();
			int j = ClassImplementsInterfacea.m1(1,2);
			
			// 1.2: Inside main, how to call interface variables. Call interface variables directly from interfacesuperclass using interface name.
			System.out.println(Exer18_InterfaceA.a1);
			int k1 = Exer18_InterfaceA.b;
			int k2= ClassImplementsInterfacea.b;
		}
	}
