/* In this class, we learn about, how threads work on Synchronized and non-synchronized methods.
Relationship:  Assign2_Threads_SynchronizationMethods_Employee & Assign2_Threads_SynchronizedMethods_MainClass
- Assign2_Threads_SynchronizationMethods_Employee is subclass, where it has two employee method. One is synchronized and another one is non-synchronized.
- Basically, on synchronized methods, two threads can't execute simultaniously. Where on, non-synchronized, two methods execute simlatanious/or close to eachother.
- If you check in results, you will not find synchronized-methods have mixed results, where as non-synchronized method can have mixed results.
*/
package Assign7_Threads;
public class Assign2_Threads_SynchronizedMethods_MainClass extends Thread {
	// Create reference for Employee class.
	Assign2_Threads_SynchronizedMethods_Employee name = new Assign2_Threads_SynchronizedMethods_Employee();
	// Create one more field.
	String name2;
	//Create constructor.
	public Assign2_Threads_SynchronizedMethods_MainClass(String name2) 
	{
	this.name2 = name2;
	}
	
	//OVerride Run method.
	@Override
	public void run() {
		name.nonsynchronizedMethod();
		name.synchronizedMethod();
	}
	
	// In main, create two threads and execute on Synchronzied & non-synchronized methods.
	public static void main(String args[]) {
		Assign2_Threads_SynchronizedMethods_MainClass t1 = new Assign2_Threads_SynchronizedMethods_MainClass("Mamta");
		Assign2_Threads_SynchronizedMethods_MainClass t2 = new Assign2_Threads_SynchronizedMethods_MainClass("Samta");
		t1.setName("Child1 thread");
		t2.setName("Child2 thread");
		t1.start();
		t2.start();
}
}
