/* Description: Deadlock scenario 2: 
Scenario: When child thread executes first and notifies then main, then thread goes to wait state and waits for lock.
To explain this, we need two classes.
Relationship: Assign6_DeadLocl2_MainThread is main class & Assign6_DeadLock1_Childthread is childclass */

package Assign7_Threads;
public class Assign7_DeadLock2_Childclass extends Thread {
	synchronized public void m1() {
		System.out.println("Current thread is: "+ Thread.currentThread()+ "");
		System.out.println("Child thread: I am also going to wait state");
		try {
			wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
