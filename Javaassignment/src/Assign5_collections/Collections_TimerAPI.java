/* Description: Here we learn about Timer class.
Relationship:  TimerTask and remindertask are related. Basically using timerclass you can schedules tasks to run. for this you need to create tasks + scheduling time.
1: remindertask have task to run 
2: Every 5 secfonds you schedule to run tassks */

package Assign5_collections;
import java.util.Timer;
import java.util.TimerTask;
public class Collections_TimerAPI {
		public static void main(String[] args) {
			System.out.println("I am main class");
			Timer t1 = new Timer();
			System.out.println("Tasks are going to run");
			t1.schedule(new Collections_remindertask(), 5); // you can also schedule how often to run, when to run and when to stop.
			//t1.schedule(new remindertask(), 1, 5);
}
}
	
	

