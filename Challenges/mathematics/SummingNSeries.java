package mathematics;


import java.io.*;
import java.util.*;


public class SummingNSeries {

	static long summingSeries(long n) {
        long seriesSum = 0;
        int result;
        seriesSum = (n % 1000000007) * (n % 1000000007) % 1000000007;
        result = (int)(seriesSum);
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of test cases");
        int t = sc.nextInt();
        sc.nextLine();

        for (int tItr = 0; tItr < t; tItr++) {
        	System.out.println("Enter n (upto which series computes) : ");
            long n = sc.nextLong();
            sc.nextLine();
            long sum = summingSeries(n);
            sum = sum % 1000000007;
            int result = (int)sum;
            System.out.println("Result = " + result);
        }
        sc.close();
    }
}
