/* In this class, we learn about, how threads work on Synchronized and non-synchronized methods.
Relationship:  Assign2_Threads_SynchronizationMethods_Employee & Assign2_Threads_SynchronizedMethods_MainClass
- Assign2_Threads_SynchronizationMethods_Employee is subclass, where it has two employee method. One is synchronized and another one is non-synchronized.
- Basically, on synchronized methods, two threads can't execute simultaniously. Where on, non-synchronized, two methods execute simlatanious/or close to eachother.
- If you check in results, you will not find synchronized-methods have mixed results, where as non-synchronized method can have mixed results.
*/
package Assign7_Threads;
public class Assign2_Threads_SynchronizedMethods_Employee extends Thread {

	// Method 1: Synchronized method execution
	synchronized public void synchronizedMethod() {
		int i;		
		for(i=1;i<=10;i++) {
		Object namen12= Thread.currentThread(); //Catching which thread is exeuction currently
		System.out.println("Synchronized method execution and  " + namen12 + " is executing" + i + " time");
		}
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	// Method 2: Non-synchronized method
	public void nonsynchronizedMethod() {
		int i;
		for(i=1;i<=10;i++) {
		Object namen11= Thread.currentThread(); //Catching which thread is exeuction currently
		System.out.println("non-synchronized method execution And " + namen11 + " thread is executing" + i + " time");
		}
	}
}
