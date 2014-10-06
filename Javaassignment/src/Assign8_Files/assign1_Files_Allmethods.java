/* Description: In this class, we learn about Files and how to use Inbuilt methods.
 * */
package Assign8_Files;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class assign1_Files_Allmethods {
	public static void main(String[] args) throws IOException {
		System.out.println("************************************************************************");
		System.out.println("*************** METHOD: CREATE FILE AND DIRECTORY  *********************");
		// Method 1.1: Creating File object.
		File f1 = new File("C:/Users/Username/workspace/Javaassignment/File_2/file1.txt");
		// With help of object, create a newfile. If file doesn't exist.  
		if(f1.exists()==false) {  // Why to use this method, if you dont use it it returns exception.
			f1.createNewFile(); 
		}
		File f2 = new File("C:/Users/Username/workspace/Javaassignment/File_2/file2.doc");  
		if(f2.exists()==false) {  // Why to use this method, if you dont use it it returns exception.
			f2.createNewFile(); 
		}
		File f3 = new File("C:/Users/Username/workspace/Javaassignment/File_2/file3");  
		if(f3.exists()==false) {  // Why to use this method, if you dont use it it returns exception.
			f3.createNewFile(); 
		}
		// Method 1.2: Create directory.
		File f4 = new File("C:/Users/Username/workspace/Javaassignment/File_2");  
		if(!f4.exists()) {  // Why to use this method, if you dont use it it returns exception.
			f4.mkdir(); 
		}
		// Create directory.
		File f5 = new File("C:/Users/Username/workspace/Javaassignment/File_21");  
		if(!f5.exists()) {  // Why to use this method, if you dont use it it returns exception.
			f5.mkdir(); 
		}
		System.out.println("Is File1 a file?: 	   "+f1.isFile());
		System.out.println("Is File1 a directory?:     "+f1.isDirectory());
		System.out.println("Is File a file?:           "+f2.isFile());
		System.out.println("Is File a directory?:      "+f2.isDirectory());

		
		// Method 2.1: Remove file.
		System.out.println("**************************************************************************");
		System.out.println("*************** METHOD 2: DELETE FILE AND DIRECTORY  *********************");
		boolean temp = f3.delete();
		System.out.println("Delete File3: 	   "+temp);
		// Method 2.2: Remove directory.
		boolean temp1 = f5.delete();
		System.out.println("Delete File3: 	   "+temp1);
		

		// Method 4.1: Get file absolute path.
		System.out.println("************************************************************************");
		System.out.println("*************** METHOD 3: GET ABSOLUTE PATH  **************************");
		String s1 = f1.getAbsolutePath();
		System.out.println("The absolute path of file1 is: "+s1);
		//  Method 4.2: Get directory absolute path.
		String s2 = f4.getAbsolutePath();
		System.out.println("The absolute path of File_2 is: "+s2);
		

	}
}
