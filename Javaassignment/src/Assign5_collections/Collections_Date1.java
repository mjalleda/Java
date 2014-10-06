/*Description: Here we learn about Date class and SimpleDateFormat class. 
Basically SimpleDateFormat class has some methods where date class uses them.
1: How to print today's date, time, hour, minute, seconds, year.
2: How to get calendar, timeformat. */

package Assign5_collections;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Collections_Date1 {
	public static void main(String[] args) {
	
		Date d = new Date();
		System.out.println("Curent system date is : "+d);
		String format1 = "MM/dd/yyyy";
		String Timeformat = "HH:mm:ss";
		SimpleDateFormat sdf1 = new SimpleDateFormat(format1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(Timeformat);		
		System.out.println("Curent date is        : "+sdf1.format(d));
		System.out.println("Curent time is        : "+sdf2.format(d));
		System.out.println("Curent calendar is    : "+sdf1.getCalendar());
		
}
}
