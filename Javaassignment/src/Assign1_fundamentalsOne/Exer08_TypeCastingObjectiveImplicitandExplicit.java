/* There are two types of type casting. Primitive type and Objective type
Here we are going to learn only primitive type. There are two categories in primitive implicit and explicit. 

1: Implicit - means JVM will take care while compiling the code. Only forward is possible not backward. 
byte --> short --> int --> long --> float --> double
char --> int --> long --> float --> double

2: Explicit - means you have explicitly tell the compiler */
package Assign1_fundamentalsOne;
public class Exer08_TypeCastingObjectiveImplicitandExplicit {

	   //Implicit type casting. Only forward is possible not backward.
		public static void main(String args[]) {
			byte b1 = 2;
			short s1 = 22, s12;
			char c1 = 'c';
			int i1 = 222, i12, i13, i21;
			long l1 = 222222, l12, l13, l14, l21, l22, l23, l24;
			float f1 = 222.2f, f12, f13, f14, f15, f21, f22, f23,f24, f25;
			double d1 = 22222222.22222222, d12, d13, d14, d15, d16, d21, d22, d23, d24, d25;
			
			// 1.1: byte to double
			System.out.println("----------------------------\n1.1:BYTE TO DOUBLE\n----------------------------");
			// byte --> short --> int --> long --> float --> double
			s12 = b1;  System.out.println("byte to short.   i.e., short can hold byte value   : "+s12); // short can take byte.
			i12 = b1;  System.out.println("byte to int.     i.e., int can hold byte value     : "+i12); // int can take byte and short
			i13 = s1;  System.out.println("short to int.    i.e., int can hold short value    : "+i13); 
			l12 = b1;  System.out.println("byte to long.    i.e., long can hold byte value    : "+l12); // long can take 'byte','short' and 'int'.
			l13 = s1;  System.out.println("short to long.   i.e., long can hold short value   : "+l13);
			l14 = i1;  System.out.println("int to long.     i.e., long can hold int value     : "+l14); 
			f12 = b1;  System.out.println("byte to float.   i.e., float can hold byte value   : "+f12); // float can take 'byte','short', 'int' and long.
			f13 = s1;  System.out.println("short to float.  i.e., float can hold short value  : "+f13);
			f14 = i1;  System.out.println("int to float.    i.e., float can hold int value    : "+f14);
			f15 = l1;  System.out.println("long to float.   i.e., float can hold long value   : "+f15);
			d12 = b1;  System.out.println("byte to double.  i.e., double can hold byte value  : "+d12); // double can take 'byte','short', 'int','long' and 'float'.
			d13 = s1;  System.out.println("short to double. i.e., double can hold byte value  : "+d13);
			d14 = i1;  System.out.println("int to double.   i.e., double can hold int value   : "+d14);
			d15 = l1;  System.out.println("float to double. i.e., double can hold long value  : "+d15);
			d16 = f1;  System.out.println("double to double.i.e., double can hold float value : "+d16);
		
			
			
			// char to double
			System.out.println("----------------------------\n1.2:CHAR TO DOUBLE\n----------------------------");
			// char --> int --> long --> float --> double
			i21 = c1;  System.out.println("char to int.     i.e., int can hold char value     : "+i21); // int can take byte and short 
			l21 = c1;  System.out.println("char to long.    i.e., long can hold char value    : "+l21); // long can take 'byte','short' and 'int'.
			l22 = i1;  System.out.println("int to long.     i.e., long can hold int value     : "+l22); 
			f21 = c1;  System.out.println("char to float.   i.e., float can hold char value   : "+f21);  // float can take char, int, long
			f22 = i1;  System.out.println("int to float.    i.e., float can hold int value    : "+f22);
			f23 = l1;  System.out.println("long to float.   i.e., float can hold long value   : "+f23);
			d21 = c1;  System.out.println("char to double.  i.e., double can hold char value  : "+d21); // double can take char, int, long and float
			d22 = i1;  System.out.println("int to double.   i.e., double can hold int value   : "+d22);
			d23 = l1;  System.out.println("float to double. i.e., double can hold long value  : "+d23);
			d24 = f1;  System.out.println("double to double.i.e., double can hold float value : "+d24);
		
			// 2.1: Explicit convertion.
			System.out.println("----------------------------\n2.1:BYTE TO DOUBLE\n----------------------------");
			// You can convert anything backward with explicit convertion except char --> byte, chat --> short or short --> char
			// int --> byte, int --> short, long --> int
			byte a1 = 3;
			short a12 = 33;
			int a13 =333;
			long a14 = 1234567890;
			
			// convertion. Format bytevariable = (byte)intvalue. shortval = short)intvalue
			a1 = (byte)a13;
			System.out.println(a1); // remember byte can't display more than 8
			a12 = (short)a13;
			System.out.println(a12);
			a13 = (int)a14;
			System.out.println(a13);  
		}
	}
