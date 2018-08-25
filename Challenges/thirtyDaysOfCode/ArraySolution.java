package thirtyDaysOfCode;

//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class ArraySolution {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//int[][] arr = new int[6][6];
		//		int hourglassSum = 0;
		//		int maxSum = 0;
		//		int count = 1;

		//		for (int i = 0; i < 6; i++) {
		//			String[] arrRowItems = scanner.nextLine().split(" ");
		//			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//
		//			for (int j = 0; j < 6; j++) {
		//				int arrItem = Integer.parseInt(arrRowItems[j]);
		//				arr[i][j] = arrItem;
		//			}
		//		}

		int [][]arr = {{1,2,3,4,5,6},{7,8,9,1,2,3},{4,5,6,7,8,9},{1,2,3,4,5,6},{7,8,9,1,2,3},{4,5,6,7,8,9}};

		int i,j,k, sum = 0, maxSum = 0;

		System.out.println("Printing array :");
		for(i = 0; i < 6; i++) {
			for(j=0; j < 6; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Printing hourglass :");
		System.out.println();

		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				sum = 0;
				System.out.println("*");
				for(k = 0; k <= 2; k++) {
					//System.out.print("("+ i + " , " + (j+k) + ") ");
					System.out.print(arr[i][j+k] + " ");
					sum = sum + arr[i][j+k];
				}
				System.out.println();
				System.out.print("  ");
				//System.out.print("("+ (i+1) + " , " + (j+k-2) + ") ");
				System.out.print(arr[i+1][j+k-2]);
				sum = sum + arr[i+1][j+k-2];
				System.out.println();
				for(k = 0; k <= 2; k++) {
					//System.out.print("("+ (i+2) + " , " + (j+k) + ") ");
					System.out.print(arr[i+2][j+k] + " ");
					sum = sum + arr[i+2][j+k];
				}
				System.out.println();
				System.out.println();
				if(maxSum < sum)  {
					System.out.println("Hourglass sum=" + sum);
					maxSum = sum;
					System.out.println("max sum = " +maxSum);
				}
			}
		}
		System.out.println("Max hourglass sum = "+maxSum);
	}			
}


//public class Solution {
//
//
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int[][] arr = new int[6][6];
//
//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }
//        
//        int i, j, k, sum = 0, maxSum = arr[0][0];
//        for(i = 0; i < 4; i++) {
//			for(j = 0; j < 4; j++) {
//				sum = 0;
//                for(k = 0; k <= 2; k++) {
//					
//					sum = sum + arr[i][j+k];
//				}
//				sum = sum + arr[i+1][j+k-2];
//				for(k = 0; k <= 2; k++) {
//					sum = sum + arr[i+2][j+k];
//				}
//				if(maxSum < sum)  {
//					maxSum = sum;
//				}
//			}
//		}
//        System.out.println(maxSum);
//        scanner.close();
//    }
//}

