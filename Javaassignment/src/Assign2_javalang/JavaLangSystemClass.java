/* Description: How to use System Class & Properties class */
package Assign2_javalang;
import java.util.Properties;
public class JavaLangSystemClass {
		public static void main(String args[])
		{
			Properties s= new Properties();
			Properties p=System.getProperties();
			System.out.println("1: Print from here \n");
			p.list(System.out);
			System.out.println("2: Print from here \n");
			//p.list("mykey","myvalue");
			String s1=(p).getProperty("mykey");
			System.out.println("3: Print from here \n"+s1);
			String s2=(p).getProperty("mykey","myvalue");
			System.out.println("4: Print from here \n");
			System.out.println(s2);
		}
		private static void property() {
			// TODO Auto-generated method stub
		}
	}

/* Important properties of System are 'out', 'gc. 
If you want to see what JVM loads while runtime, execute p.list in above code.
Basically you are creating an object and getting all system properties into that object and printing it from object. */

