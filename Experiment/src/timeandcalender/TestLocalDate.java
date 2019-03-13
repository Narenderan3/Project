//program to implement local date and time
package timeandcalender;

import java.time.*;

public class TestLocalDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); //
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = yesterday.plusDays(2);
		System.out.println("Today date: " + date);
		System.out.println("Yesterday date: " + yesterday);
		System.out.println("Tommorow date: " + tomorrow);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalTime time2 = time.minusHours(2);
		LocalTime time3 = time2.minusMinutes(34);
		System.out.println(time3);
		   
	}
}
