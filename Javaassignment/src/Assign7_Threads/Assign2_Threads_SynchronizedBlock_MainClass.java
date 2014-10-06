/* Description: In this class, we learn about, how threads work on Synchronized and non-synchronized blocks.
 - Relationship:  Assign2_Threads_SynchronizedBlock_MainClass & Assign2_Threads_SynchronizedBlock_Employee
 - Assign2_Threads_SynchronizedBlock_Employee is subclass, where it has two employee blocks. One is synchronized and another one is non-synchronized.
 - Basically, on synchronized block, two threads can't execute simultaniously. Where on, non-synchronized, two threads execute simlatanious/or close to eachother.
- If you check in results, you will not find synchronized-blocks have mixed results, where as non-synchronized block can have mixed results.
*/
package Assign7_Threads;
public class Assign2_Threads_SynchronizedBlock_MainClass extends Thread {
	// Creating a reference for subclass object.
	Assign2_Threads_SynchronizedBlock_Employee SubclassObj;
	// Create constructor for this class for above isntance fields. 
	public Assign2_Threads_SynchronizedBlock_MainClass(Assign2_Threads_SynchronizedBlock_Employee SubclassObj ) {
		this.SubclassObj = SubclassObj;
	}
	
	@Override
	public void run() {
		SubclassObj.NonSynchronizedBlock();
		SubclassObj.Synchronizedblock();
	}
	
	// Basically, the subclass object will be called both threads t1 and t2. They are sharing same object.
	public static void main(String args[]) {
		// Creating object for subclass object. 
		Assign2_Threads_SynchronizedBlock_Employee SubclassObj = new Assign2_Threads_SynchronizedBlock_Employee();
		//Creating threads for above run method.
		Assign2_Threads_SynchronizedBlock_MainClass t1 = new Assign2_Threads_SynchronizedBlock_MainClass(SubclassObj);
		Assign2_Threads_SynchronizedBlock_MainClass t2 = new Assign2_Threads_SynchronizedBlock_MainClass(SubclassObj);

		t1.setName("Child 1 thread");
		t2.setName("Child 2 thread");
		t1.start();
		t2.start();
	}
}
