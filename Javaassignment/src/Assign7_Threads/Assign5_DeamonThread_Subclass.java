//Decription: Deamon threads.
// Basically, it runs in the background. Here, I implemented deamon thread code in runmethod.

package Assign7_Threads;
public class Assign5_DeamonThread_Subclass extends Thread {
	int total;
	//Overriding run method.
	public void run() {
		for(int i= 0; i<1000; i++) {
		System.out.println("I am from run method");
		total = total+i;
	}
}
	
	public static void main(String[] args)    {
		//Creating thread for this class.
		Assign5_DeamonThread_Subclass t1 = new Assign5_DeamonThread_Subclass();
		t1.setName("Child 1 thread"); 
		// Intializing deamon thread.
		t1.setDaemon(true); // Now, it executes deamon thread code, which is in runmethod.
		t1.start();
		System.out.println("Main thread: My state is: "+t1.getState()); // Both threads executes simultaniously. Even though both holds same object lock, deamon thread executes in the background.
		for(int i1= 1; i1<=10; i1++) {
			System.out.println("Main thread: "+ i1 + " time");
			
		}
		System.out.println("Main thread: My state is: "+t1.getState());
		System.out.println(t1.total);
	}
}


