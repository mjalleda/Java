/*  Description: Learning about Wait and notify method.  For this, we need to classes. 
Relationship: Assign4_WaitNotify_MainClass is main class. Assign4_WaitNotify_ChildThread is child class.
Main thread wait for lock, and child executes child thread notifies main thread to take lock.
Results are: Basically, child thread executes first then main thread. */

package Assign7_Threads;
public class Assign4_WaitNotify_ChildThread extends Thread {
public void m1() {
	int total=0;
	System.out.println("Child thread: I am child class");
	synchronized(this)//.thread got lock
	{
		System.out.println("Child thread: Child class starting calculation");
		
		for(int i=0;i<=1000;i++) 
			{ 
			total = total+i;
			}
		System.out.println("Child thread: I am giving notification call"); 
		notify();//thread releases lock again
	}

}
}
