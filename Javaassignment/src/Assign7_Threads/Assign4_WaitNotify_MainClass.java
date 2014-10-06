/*  Description: Learning about Wait and notify method.  For this, we need to classes. 
Relationship: Assign4_WaitNotify_MainClass is main class. Assign4_WaitNotify_ChildThread is child class.
Main thread wait for lock, and child executes child thread notifies main thread to take lock.
Results are: Basically, child thread executes first then main thread. */
package Assign7_Threads;
public class Assign4_WaitNotify_MainClass extends Thread {
	Assign4_WaitNotify_ChildThread ref;
	public Assign4_WaitNotify_MainClass(Assign4_WaitNotify_ChildThread ref) {
		super();
		this.ref = ref;
	}
	//Overriding run method.
	public void run() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ref.m1();
	}
	
	public static void main(String[] args) throws InterruptedException  {
		Assign4_WaitNotify_ChildThread ref = new Assign4_WaitNotify_ChildThread();
		Assign4_WaitNotify_MainClass t1 = new Assign4_WaitNotify_MainClass(ref);
		t1.setName("Child 1 thread"); 
		t1.start();
		synchronized(t1)//thread got lock
		{
		System.out.println("Main thread:  calling wait method");
		t1.wait();
		System.out.println("Main thread:  I got notification");
		for(int i=0; i<2; i++) {
			System.out.println("Main thread: I received lock and doing calculartion: "+i);
		}
		
		}
	}
}
