package algorithms;

import java.io.*;
import java.util.*;

public class TimeConversion {

	static String timeConversion(String s) {
		String hhString, am_pmString, timeString;
		int hhInteger = 0;
		am_pmString = s.substring(8);
		timeString = s.substring(0, 8);
		hhString = s.substring(0, 2);
		
		if(hhString.equals("12") && am_pmString.equals("AM")) {
			timeString = timeString.substring(2);
			timeString = "00" + timeString;
		}
		else if (!hhString.equals("12") && am_pmString.equals("PM")) {
			timeString = timeString.substring(2);
			hhInteger = Integer.valueOf(hhString);
			hhInteger = hhInteger + 12;
			timeString = hhInteger + timeString;
		}
		return timeString;

	}

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {

		String s = scan.nextLine();
		String result = timeConversion(s);
		System.out.println(result);
	}
}
