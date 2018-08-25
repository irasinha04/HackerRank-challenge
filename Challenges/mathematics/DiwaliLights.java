package mathematics;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DiwaliLights {


    static long lights(int n) {
    	BigInteger numOfWays = new BigInteger("2");
        numOfWays = (numOfWays.pow(n)).subtract(new BigInteger("1"));
        numOfWays = numOfWays.mod(new BigInteger("100000"));
        long result = numOfWays.longValue();
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	System.out.println("Enter number of test cases : ");
        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int tItr = 0; tItr < t; tItr++) {
        	System.out.println("Enter number of bulbs : ");
        	int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            long result = lights(n);

            System.out.println(String.valueOf(result));
        }


        scanner.close();
    }
}
