package algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayOfTheProgrammer {
    
    static boolean isLeapYear(int year) {
        // Julian calendar
        if(year <= 1917) {
            if(year %  4 == 0) {
                return true;
            }
        }
        // Gregorian calendar
        if(year > 1918) {
            if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                return true;
            }
        }
        return false;
    }
    
    static String getDate(int year, int[] arrayYear) {
        int i, day, month;
        String date;
        
        if(year != 1918) {
            i = 0;
            day = 0;
        } else {
            i = 2;
            day = 32 + 28 - 14;   
        }
        
        while(day < 256) {
            day = day + arrayYear[i];
            i++;
        }
        month = i;
        day = arrayYear[i - 1] - (day - 256);
        if(month > 9) {
        	date = day + "." + month + "." + year;
        } else {
        	date = day + ".0" + month + "." + year;
        }
        return date;
    }
    
    static String solve(int year) {
        int[] regularYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String date;
        if(isLeapYear(year)) {
            date = getDate(year, leapYear);
        } else {
            date = getDate(year, regularYear);
        }
        return date; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int year = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = solve(year);

        System.out.println(result);

        scanner.close();
    }
}
