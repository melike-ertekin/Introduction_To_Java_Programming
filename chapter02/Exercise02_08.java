package chapter02;

import java.util.Scanner;

public class Exercise02_08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long totalMilliSec = System.currentTimeMillis();
		long currentHour = (totalMilliSec / 3600000) % 24 ;
		long currentMin = (totalMilliSec / 60000) % 60 ;
		long currentSec = (totalMilliSec / 1000) % 60 ;
		
		System.out.println("Current Time in Greenwich: " + currentHour + ":" + currentMin + ":" + currentSec);
		
		System.out.print("Enter the time zone offset to GMT: ");
		long timeOffSet = input.nextLong();
		
		if((currentHour + timeOffSet) < 0) {
			currentHour = currentHour + timeOffSet + 24 ;
		}
		else if((currentHour + timeOffSet) > 24) {
			currentHour = currentHour + timeOffSet - 24 ;
		}
		else {
			currentHour = currentHour + timeOffSet;
		}

		System.out.println(currentHour + ":"+currentMin +":"+currentSec);
		
			
	}

}
