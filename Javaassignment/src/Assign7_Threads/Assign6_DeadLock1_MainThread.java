/* Description: : A Deadlock scenario (happens with Threads) 
When child thread executes first and notifies then main thread, then it goes to wait state and waits for lock. To explain this, we need two classes.
Relationship: Assign6_DeadLocl2_MainThread is main class & Assign6_DeadLock1_Childthread is childclass */
package Assign7_Threads;
public class Assign6_DeadLock1_MainThread extends Thread {
	Assign6_DeadLock1_Childthread t1 = new Assign6_DeadLock1_Childthread();
	@Override
	public void run() {
		t1.m1();
	}
	
public static void main(String[] args) {
	Assign6_DeadLock1_MainThread thread1 = new Assign6_DeadLock1_MainThread();
	thread1.setName("Child Thread");
	System.out.println("Main thread: My current state is :"+thread1.getState());
	thread1.start();
	try {  							// Putting wait on main thread so child thread executes mean while : To generate deadlock situation
		thread1.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	synchronized (thread1) {
		try {
			System.out.println("Current thread is: "+ Thread.currentThread());
			System.out.println("Main thread: Now i am going to wait state");
			thread1.wait();	 // Main thread going to wait state and childthread notifies it. So daedlock will happend.
			System.out.println("Main thread: Main thread is not waiting anymore"); // this doesnt print since main thread is still waiting for the lock
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
}
