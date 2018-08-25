package algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayChocolate {

    // Complete the solve function below.
    static int solve(int[] s, int d, int m) {
        int count = 0, sum = 0;
        for(int i = 0; i <= s.length - m; i++) {
            for(int j = i; j < i + m; j++) {
                sum = sum + s[j];
                System.out.println("Sum = " + sum);
            }
            if(sum == d) {
                count++;
                System.out.println("Count = " + count);
            }
            sum = 0;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

    	System.out.println("Enter no of squares in chocolate : ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] s = new int[n];
        System.out.println("Enter numbers written on chocolate :");
//        String[] sItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
        	s[i]= Integer.parseInt(scanner.next());
        }
        System.out.println("Enter birth day and month separated by space : ");
        
        int d = Integer.parseInt(scanner.next());

        int m = Integer.parseInt(scanner.next());

        int result = solve(s, d, m);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}