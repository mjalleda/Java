/* Description: : A Deadlock scenario (happens with Threads) 
When child thread executes first and notifies then main thread, then it goes to wait state and waits for lock. To explain this, we need two classes.
Relationship: Assign6_DeadLocl2_MainThread is main class & Assign6_DeadLock1_Childthread is childclass */

package Assign7_Threads;
public class Assign6_DeadLock1_Childthread extends Thread {
synchronized public void m1() {
	System.out.println("Current thread is: "+ Thread.currentThread());
	System.out.println("Child thread: I am child class");
	System.out.println("Child thread: I am notifying now");
}
}
