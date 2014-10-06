/*  Description: Here, we learn how to extends Thread class, and perform some methods like
setpriority, getpriority, getcurrent and sleep.
*/
package Assign7_Threads;
public class Assign1_Threads_SetPriority extends Thread{
	// @Override run method
	public void run() {
	int i;
	for(i=1;i<=4;i++) { 
		System.out.println("SetPrioirty Child thread. Executing " +i + " time.");
		m1();
	}	
	}
	//Method1:
	void   m1() {
		//System.out.println("This is from m1 method");
	}
	
	public static void main(String args[]) throws Exception {
		Assign1_Threads_SetPriority t1 = new Assign1_Threads_SetPriority();
		Assign1_Threads_SetPriority t2 = new Assign1_Threads_SetPriority();
		t1.setName("SetPriority Child thread"); 						 // Setting Joing child thread name
		String name = t1.getName(); 	 								 //getting currently running thread name.
		System.out.println("Currently running thread is: "+name);  		 // Print currently running thread.
		t1.setPriority(10); 											 //Set child thread priority to 10. Max prio is 10 and min is 1.
		t1.start();
		int j;
		for(j=1;j<=3;j++) { 
			System.out.println("Main thread execution & executing " +j + " time");
		}
		
		System.out.println("Child thread priority is: "+t1.getPriority());
		System.out.println("Currently running thread's prioirty: "+t1.currentThread());
		t2.sleep(5000);
		System.out.println("Thread two is sleeping for 5 seconds.");
		t2.start(); //Set child thread priority to 10. Max prio is 10 and min is 1.
		
}
}
