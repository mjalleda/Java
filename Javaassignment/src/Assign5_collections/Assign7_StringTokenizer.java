/* Description: How to call stringtokenizer & how to call its methods.
 * Below, I created object for StringTokenizer class and later called its methods.
 * */
package Assign5_collections;
import java.util.StringTokenizer;    
public class Assign7_StringTokenizer {        
    	static String a = "My name is ravi."+ "I am working in Javapoint as a Faculty.";        
    	static String a2 = "My name is ravi."+ "I am working in Javapoint as a Faculty.";
    	
    	public static void main(String args[]) {            
    	StringTokenizer st1=new StringTokenizer(a," ");
    	StringTokenizer st2=new StringTokenizer(a,"s");
    	//return number of tokens.
    	System.out.println("***************************************************************");
    	int i=st1.countTokens();            
    	System.out.println("count="+i);
    	//different approach.
    	while(st1.hasMoreTokens())                {                
    		String val=st1.nextToken();                
    		System.out.println("MEthod 1: Statment break when space found: "+val);                
    	}
    	System.out.println("***************************************************************");
    	//Different approach
    	while(st2.hasMoreTokens()) {
    		String val2=st2.nextToken();                
    		System.out.println("Method 2: Remove s and break statment when it occurs: "+val2);
    	}
    	
    	System.out.println("***************************************************************");
    	// Statment when s occure & and also return s in new line.
    	StringTokenizer  st3=new StringTokenizer(a,"s",true);
    	while(st3.hasMoreTokens())                {                
    		String val=st3.nextToken();                
    		System.out.println("Method 3: Returning s along with String: "+val);                
    	}
    }    
}

