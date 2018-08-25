package mathematics;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SherlockAndPermutations {

    // Complete the solve function below.
    static BigInteger fact(int num) {
    	
        BigInteger factorial = new BigInteger("1");
        for(int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            //factorial = (long) (factorial % (Math.pow(10 , 9) + 7));
        }
        return factorial;
    }
    
    static int solve(int n, int m) {
        BigInteger permutation = new BigInteger("0");
        System.out.println(n + "! = " + fact(n));
        System.out.println(m-1 + "! = " + fact(m - 1));
        System.out.println(n + m-1 + "! = " + fact(n + m - 1));
        
        permutation = fact(n + m - 1).divide(fact(n).multiply(fact(m - 1)));
        System.out.println("Permutation = " + permutation);
        
        BigInteger result = permutation.mod(BigInteger.valueOf((long) (Math.pow(10 , 9) + 7)));
        int answer  = result.intValue();
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int result = solve(n, m);

            System.out.println(String.valueOf(result));
        }


        scanner.close();
    }
}