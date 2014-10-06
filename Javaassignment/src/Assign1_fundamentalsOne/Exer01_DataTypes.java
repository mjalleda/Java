//Description: Declare & initialize variables for all data types.
package Assign1_fundamentalsOne;
public class Exer01_DataTypes {

	//1: declaration of int
	int a, Var1 = 100;
	int b = 10;
	//int c = 12222222222L; //can't convert Long to int

	//2: declaration of char
	char d = 'A';
	//char Var2 = 'ABCD'; Invalid character constant error returned

	//3: declaration of long
	long e, f;
	long g = 1333; // No need to say l at the end of value.
	long h = 22222222222222l; // you can
	//long i = 012345678L; // it gives an error if you put leading zero since it is out of range of octal.

	//4: declaration of float
	 float j;
	//float k = 1.3; // If you don't add f at the end of value, it gives error: Can't convert double to float.
	float k = 1.3f;

	//5: declaration of double
	double l = 20.00;
	double m = (float) (k + j);
	
	//6: Boolean 
	boolean n; // its default value is false
	boolean o = true;
	//boolean p = 0;  // you can't initialize value int to boolean, so it given an error.
}