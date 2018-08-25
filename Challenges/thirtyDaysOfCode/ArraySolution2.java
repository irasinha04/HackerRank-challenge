package thirtyDaysOfCode;

public class ArraySolution2 {
	public static void main(String[] args) {
		
		int[][] arr = getInput();
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length-3; i++) {
			for(int j = 0; j < arr[i].length - 3; j++) {
//				printHourGlass(arr, i, j);
				int sum = getHourGlassSum(arr, i, j);
				maxSum = sum > maxSum ? sum : maxSum;
//				System.out.println("sum: " + sum + " max: " + maxSum);
			}
		}

		System.out.println(maxSum);
	}

	private static void printHourGlass(int[][] arr, int x, int y) {
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((i == 1) && (j == 0 || j == 2)) {
					System.out.print("  ");
					continue;
				}
				
				System.out.print(arr[x + i][y + j] + " ");
			}
			System.out.println();
		}
	}

	private static int getHourGlassSum(int[][] arr, int x, int y) {
		
		int sum = 0;
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((i == 1) && (j == 0 || j == 2)) {
					continue;
				}
				
				sum += arr[x + i][y + j];
				
			}
		}
		return sum;
	}

	private static int[][] getInput() {
		return new int[][] {{1,2,3,4,5,6},{7,8,9,1,2,3},{4,5,6,7,8,9},{1,2,3,4,5,6},{7,8,9,1,2,3},{4,5,6,7,8,9}};
	}
}
