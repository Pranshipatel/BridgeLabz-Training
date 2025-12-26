// program that displays the current time in different time zones:

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalTime;

public class TimeZones{
	public static void main(String[] args){
		
		// Get Greenwich Mean Time
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
		
		// Extracting time 
		LocalTime getLocalGmt = gmt.toLocalTime();
		System.out.println("The Zoned Time And date of Gmt = " + gmt);
		System.out.println("The local GMT = " + getLocalGmt);
		
		// Get Indian Standard  Time
		ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		
		// Extracting time 
		LocalTime getLocalIST = ist.toLocalTime();
		System.out.println("The Zoned Time And date of IST = " + ist);
		System.out.println("The local IST = " + getLocalIST);
		
		// Get Pacific Standard  Time
		ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		
		// Extracting time 
		LocalTime getLocalPST = pst.toLocalTime();
		System.out.println("The Zoned Time And date of pst = " + pst);
		System.out.println("The local pst = " + getLocalPST);
		
		
	}
}
		