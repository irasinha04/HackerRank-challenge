package algorithms;

import java.util.*;

public class MiniMaxSum {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		long sum = 0; 
		long maxVal = -9223372036854775808L;
		long minVal = 9223372036854775807L;
		/* Taking the min and max possible values of int */
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < i + 4; j++) {
				if (j > arr.length - 1) {
					System.out.print(j-arr.length + " ");
					sum = sum + arr[j - arr.length];
				} else {
					System.out.print(j + " ");
					sum = sum + arr[j];
				}
			}
			System.out.println("Sum = " + sum);
			if (maxVal < sum) {
				maxVal = sum;
			}
			if (minVal > sum) {
				minVal = sum;
			}
			sum = 0;
		}
		System.out.print(minVal + " " + maxVal);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}
