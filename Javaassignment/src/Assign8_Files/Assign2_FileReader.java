/* Description: In this class, we learn about Files and how to use read data from external files and how to use filereader & bufferreader classes.. */
package Assign8_Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.CharBuffer;
public class Assign2_FileReader {
	
	// Overriding FileReader method.
	private void Filereader() {
	//
	}
	//Mainclass.
	public static void main(String[] args) throws IOException {
	
		// Creating an object of Filereader
		FileReader F1 = new FileReader("C:/Users/Username/workspace/Javaassignment/File_2/file1.txt");
		// Crating char array, getting all chars from F1 to chararray. then iterate on chararray.
		char[] ch = new char[100]; //character array
		F1.read(ch); // sedning all objects to this array
		for(int i = 0; i<ch.length; i++) { //iterating on array
		System.out.println(ch[i]);
		}
		try {
			F1.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileReader F2 = new FileReader("C:/Users/Username/workspace/Javaassignment/File_2/file1.txt");
		BufferedReader BR = new BufferedReader(F2);
		String s = BR.readLine();
		System.out.println(s.length());
		/*for(int j=0; j<=s.length(); j++) {
			System.out.println(s);
		}*/
		while(s!=null) {
			System.out.println(s);
			s=BR.readLine();
		}
		try {
			F2.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	String f1;
	public FileReader1(String f1) {
		// TODO Auto-generated constructor stub
	this.f1 = f1;
	}

	public static void main(String[] args) throws IOException {
	//File f1 = new File("C:/Users/Mamatha Kamtam/workspace/Javaassignment/File_2/file1.txt");
	FileReader fr=new FileReader("C:/Users/Mamatha Kamtam/workspace/Javaassignment/File_2/file1.txt");
	//System.out.println("fr.read()");
	char[] ch =new char[200];
	try {
		fr.read(ch);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//for(char c1:ch)
	System.out.println(ch.length);
	for(int i=0 ; i<ch.length; i++)
	//System.out.println(i);
	
	try {
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Read line by line.
	FileReader f2=new FileReader("C:/Users/Mamatha Kamtam/workspace/Javaassignment/File_2/file1.txt");
	BufferedReader br=new BufferedReader(f2);
	//System.out.println(br);
	br.skip(10);
	String s11 = br.readLine();
	while(s11!=null)
	{
	br.skip(10);
	System.out.println(s11);
	s11 = br.readLine();
	}
	br.close();*/
}

