package guneet.hackerEarth;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MaxNapSlot {
	public static void main(String aaa[]) throws ParseException{
		String meetings = "Mon 01:00-13:00\r\nTue 01:00-23:00\r\nWed 01:00-23:00\r\nThu 01:00-23:00\r\nFri 01:00-23:00\r\nSat 01:00-23:00\r\nSun 01:00-21:00";
//		System.out.println(meetings);
		maxSlot(meetings);
	}
	
	public static void maxSlot(String meetings) throws ParseException{
		
		// line separated
		// - separated
		
		String[] dates = meetings.split("/r/n");
		for(String d:dates){
			System.out.println(d);
			
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEE hh:mm");
		System.out.println(sdf.parse("Tue 01:00"));
	}
}
