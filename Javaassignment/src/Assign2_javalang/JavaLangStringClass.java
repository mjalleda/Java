/* Description: How to use String Datatype. In this class, we learn,
1: Declaration of String datatype variables and all three String API Classes objects.
2: Get the results for String, Stringbuffer and StringBuilder when you execute with equal and == assignment operator
3: How memory is allocated when you crate String and StringBuffer. 
4: How memory is allocated when you modify/change the value for existing objects.  */

package Assign2_javalang;

public class JavaLangStringClass {	  
	  public static void m1(String[] args) {
		// 1.1:Regular String datatype declaration. 
		String s1="laxmi";
	    String s3="laxmi";
		
	    // 1.2: String API classes declaration
	    String Obj1 = new String();  //without value
	    String Obj2 = new String("Laxmi");
	    StringBuffer Obj3 = new StringBuffer(); //without value
	    StringBuffer Obj4 = new StringBuffer("laxmi");
	    StringBuilder Obj5 = new StringBuilder();  //without value
	    StringBuilder Obj6 = new StringBuilder("laxmi");
	 }
	    public static void main(String args[]){
	    //Get the results for String and Stringbuffer when you execute with equal and == assignment operator
	    //2.1: String API type.
		 String s=new String("laxmi");
		 String s1=new String("laxmi");
		 System.out.println("String API type comparision with equal: it compares data laxmi and laxmi: it will be true:"+s.equals(s1)); 
		 System.out.println("String API type comparision with operationoperator : it compares hashcodes: it will be flase:"+s==s1);
		  
		 //2.2: StringBuffer type.
		 StringBuffer sb=new StringBuffer("laxmi");
		 StringBuffer sb1=new StringBuffer("laxmi");
		 System.out.println("StringBuffer API type comparision with equal: it compares hashcode: it will be false:"+sb.equals(sb1));
		 System.out.println(sb==sb1); //"StringBuffer API type comprision with assignment operator: it compares hashcodes: it will be false:
		  
		 //2.3: StringBuilder type.
		 StringBuilder sbu=new StringBuilder("laxmi");
		 StringBuilder sbu1=new StringBuilder("laxmi");
		 System.out.println("StringBuilder API type comparision with equal: it compares hashcode: it will be false:"+sbu.equals(sbu1));
		 System.out.println(sbu==sbu1); //"StringBuilder API type comparision with assignment operator: it compares hashcodes: it will be false:
	}
	  public void StringAndStringBuffer() {
		  // Comparing String and StringBuffer. How they allocate memory when you create and modify them.
		  // Creation of string API
		  String S = new String("Laxmi");
		  StringBuffer SB = new StringBuffer("Laxmi");
		 // Please refer to notes there are total 7 steps.
		 // 1 & 2: If you create two objects one for String API and another for StringBuffer API. that is S & SB, JVM will create two different objects in heapmemory
		  S.concat("Gorantla");
		  SB.append("Gorantla");
		  //3, 4, 5: - 3: If you modify S from "laxmi" to "laxmi gorntla" by concat method, 4: the JVM will create a new memorylocation and add Laxmigorantal there and put the same pointer S to here, 5: and the original pointer S with laxmi object will be garbage collected. Since StringAPI types can't be override in memory. even though you modify the value for existing object, it will crate a new object.  
		  //6 & 7: 6:If you modify SB from "laxmi" to "laxmi gorntal" by append method, 7:the JVM will not create a new memorylocation, it just modify the existing object with new value. For better memory management, it is advisable to use Stringbuffer if you keep change the value.
	  }
}