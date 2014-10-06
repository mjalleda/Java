/* Description: Here, we learn aboyt Yield. For this, we need three classes.  
Relationship:Assign1_Threads_Yield, Assign1_Threads_CreationOfType1, Assgin1_Threads_Join
 - 1: Yield only using Assign1_Threads_Yield thread as child.
 - 2: Yield with setPriority=10 using Assign1_Threads_SetPriority as child.
 - 3: Yield with setPriority=2  using Assgin1_Threads_Join thread as child */
 
package Assign7_Threads;
public class Assign1_Threads_Yield extends Thread {
	// @Override run method
	public void run() {
	int i;
	for(i=1;i<=10;i++) { 
		System.out.println("Yield class Child thread. Executing " +i + " time.");
		m1();
	}		
	}
	//Method1:
	void   m1() {	
		//System.out.println("This is from m1 method");
	}
	
	public static void main(String args[]) throws Exception {
		// Executing only yield method. that means pausing that thread priority for a while. Here stopping child thread. 
		// 1: Using two threads. t1 and mainthread. t1.yield, that means t1 pause for a while and give chances to mainthread.
		Assign1_Threads_Yield t1 = new Assign1_Threads_Yield();
		t1.setName("Yield Child thread"); // Setting yield child thread name
		t1.start();
		t1.yield(); // pausing t1 thread exeuction for some time. Not sure how long.
		String name1 = t1.getName(); // return current running thread name 
		System.out.println("Currently executing thread is: "+name1);   // Print current running thread name
		int j;
		for(j=1;j<=6;j++) { 
			System.out.println("Main thread execution & executing " +j + " time");
		}
		
		// Execute both Setpriority and Yield. JVM gives priority to Setpriority method if it's priority is > currentthread priority. but here it has more. which should execute child first then.
		// 2: Using two threads. t2 and mainthread. t2.setPriority(10) & t2.yield, that means t2 gets highpriority and yield will be ignored. after t2, main will execute.
		System.out.println("********************************************************");
		Assign1_Threads_SetPriority t2 = new Assign1_Threads_SetPriority();
		t2.setName("SetPrioprity Child thread"); //Setting SetPriority child thread name
		t2.setPriority(2);
		t2.start();
		t2.yield(); // pausing t1 thread exeuction for some time. Not sure how long.
		String name2 = t2.getName(); // return current running thread name 
		System.out.println("Currently executing thread is: "+name2);   // Print current running thread name
		for(j=1;j<=6;j++) { 
			System.out.println("Main thread execution & executing " +j + " time");
		}
		
		// Execute both Setpriority and Yield. JVM give priority to Setpriority method if it's priority is > currentthread priority. but here it has less. which should execute current/main first
		// 3: Using two threads. t3 and mainthread. t3.setPriority(2) & t3.yield, that means t3 gets lowpriority and yield will be activated. after main, t3  will execute.
		System.out.println("********************************************************");
		Assgin1_Threads_Join t3 = new Assgin1_Threads_Join();
		t3.setName("Join Child thread"); //Setting Joing child threadname
		t3.setPriority(10);
		t3.start();
		t3.yield(); // pausing t1 thread exeuction for some time. Not sure how long.
		String name3 = t3.getName(); // return current running thread name 
		System.out.println("Currently executing thread is: "+name3);   // Print current running thread name
		for(j=1;j<=6;j++) { 
			System.out.println("Main thread execution & executing " +j + " time");
		}
}
}