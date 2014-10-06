/* Description: In this class, we learn about, how threads work on Synchronized and non-synchronized blocks.
 - Relationship:  Assign2_Threads_SynchronizedBlock_MainClass & Assign2_Threads_SynchronizedBlock_Employee
 - Assign2_Threads_SynchronizedBlock_Employee is subclass, where it has two employee blocks. One is synchronized and another one is non-synchronized.
 - Basically, on synchronized block, two threads can't execute simultaniously. Where on, non-synchronized, two threads execute simlatanious/or close to eachother.
- If you check in results, you will not find synchronized-blocks have mixed results, where as non-synchronized block can have mixed results.
*/
package Assign7_Threads;
public class Assign2_Threads_SynchronizedBlock_Employee {
	
	// Method1: Synchronized blcok
	public void Synchronizedblock() {
		int i;
		//Non-synchronized block
		synchronized (this) { 
			for(i=1;i<=5;i++) {
				Object name12 = Thread.currentThread();
				System.out.println("Synchronized block execution on " + name12 + i + " time");
				try {
					Thread.sleep(2000);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
}
}
	
	// Method2: Non-Synchronized blcok
	public void NonSynchronizedBlock() {
		int i;
		//Non-synchronized block
		{ 
			for(i=1;i<=5;i++) {
			Object name22 = Thread.currentThread();
			System.out.println("Non-Synchronized block execution on " + name22 + i + " time");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
}
}
}
}
}
