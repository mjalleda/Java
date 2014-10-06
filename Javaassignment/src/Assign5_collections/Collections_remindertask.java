/* Description: Here we learn about Timer class.
Relationship:  TimerTask and remindertask are related. Basically using timerclass you can schedules tasks to run. for this you need to create tasks + scheduling time.
1: remindertask have task to run 
2: Every 5 secfonds you schedule to run tassks */

package Assign5_collections;
import java.util.TimerTask;
public class Collections_remindertask extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Execute child tasks");
		
	}

}
