// Description: Here we learn about Calendar class.
// 1: How to print Calendar date, time, year, day of month, last day of month..

package Assign5_collections;
import java.util.Calendar;
public class Collections_Calendar1 {
public static void main(String[] args) {
	Calendar cal1 = Calendar.getInstance();
	System.out.println("The current calendar is					 : "+ cal1);
	System.out.println("The current calendar's time is				  : " +cal1.getTime());
	System.out.println("The current calendar's Date is				  : " +cal1.get(Calendar.DATE));
	System.out.println("The current calendar's Month is				  : " +cal1.get(Calendar.MONTH));
	System.out.println("The current calendar's Year is				  : " +cal1.get(Calendar.YEAR));
	System.out.println("The current calendar's Hour is				  : " +cal1.get(Calendar.HOUR));
	System.out.println("The current calendar's Minute is			  : " +cal1.get(Calendar.MINUTE));
	System.out.println("The current calendar's Second is			  : " +cal1.get(Calendar.SECOND));
	System.out.println("The current calendar's AM is				  : " +cal1.get(Calendar.AM));
	System.out.println("The current calendar's PM is				  : " +cal1.get(Calendar.PM));
	System.out.println("The current calendar's Day_of_month is		  : " +cal1.get(Calendar.DAY_OF_MONTH));
	System.out.println("The current calendar's Day_of_week_in_month is: " +cal1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println("The current calendar's Day_of_year is         : " +cal1.get(Calendar.DAY_OF_YEAR));
	System.out.println("The current calendar's Hour_of_day is         : " +cal1.get(Calendar.HOUR_OF_DAY));
	System.out.println("The current calendar's Milliseconds is        : " +cal1.get(Calendar.MILLISECOND));
	System.out.println("The current calendar's weak_of_month is       : " +cal1.get(Calendar.WEEK_OF_MONTH));
	System.out.println("The current calendar's weak_of_year is        : " +cal1.get(Calendar.WEEK_OF_YEAR));
	//cal.detTime();	
}
}
