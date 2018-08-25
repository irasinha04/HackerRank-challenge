package mathematics;

import java.io.*;
//import java.math.*;
//import java.text.*;
import java.util.*;
//import java.util.regex.*;

public class LeonardosPrimeFactors {

	static int primeCount(long n) {

		int i;
		int[] primeArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};//, 53 , 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		long primeProd = 1;
		for(int j = 0; j < primeArray.length; j++) {
			 primeProd *= primeArray[j]; 
		}
		
		System.out.println(primeProd);
		
		for (i = primeArray.length-1; primeProd > n; i--) {

			primeProd /= primeArray[i];
			
			System.out.print("Product = " + primeProd);
			System.out.print(" , " + (primeProd <= n ? "true" : false));
			System.out.println();
		}
		return i+1;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter # of test cases : ");
		int q = sc.nextInt();
		sc.nextLine();

		for (int qItr = 0; qItr < q; qItr++) {
			System.out.println("Enter num : ");
			long n = sc.nextLong();
			sc.nextLine();

			int result = primeCount(n);

			System.out.println("Maximum no. of unique prime factors = " + result);
		}

		sc.close();
	}
}
