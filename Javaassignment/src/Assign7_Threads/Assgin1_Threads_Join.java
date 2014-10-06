// Description: In this assignment we learn, how to use Join method on threads..
package Assign7_Threads;
public class Assgin1_Threads_Join extends Thread {
	// @Override run method
	public void run() {
	int i;
	for(i=1;i<=6;i++) { 

		System.out.println("Join class Child thread. Executing " +i + " time.");
		m1();
	}		
	}
	//Method1:
	void   m1() {	
		//System.out.println("This is from m1 method");
	}
	public static void main(String args[]) throws Exception {
		Assgin1_Threads_Join t1 = new Assgin1_Threads_Join();
		t1.setName("Join Child thread"); 								 // Setting Joing child thread name
		String name = t1.getName(); 	 								 //getting currently running thread name.
		System.out.println("Currently running thread is: "+name);  		 // Print currently running thread.
		t1.start();
		t1.join(); 						 								 // it will completely stop current thread execution. Here current thread is Main.
		String name1 = t1.getName();     								 //getting currently running thread name. 
		System.out.println("Currently running thread is: "+name1);  	 // Print currently running thread.      
		int j;                               
		for(j=1;j<=6;j++) { 
			System.out.println("Main thread execution & executing " +j + " time");
		}
}
}
