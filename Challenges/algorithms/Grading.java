package algorithms;

import java.io.*;
import java.util.*;

public class Grading {

	static int[] gradingStudents(int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] >= 38) {
				int unitPlace = grades[i] % 10;
				int diffWith5 = 5 - unitPlace;
				int diffWith10 = 10 - unitPlace;
				if (diffWith5 > 0 && diffWith5 < 3) {
					grades[i] += diffWith5;
				} else if (diffWith10 > 0 && diffWith10 < 3) {
					grades[i] += diffWith10;
				}
			}
		}
		return grades;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] grades = new int[n];

		for (int gradesItr = 0; gradesItr < n; gradesItr++) {
			int gradesItem = Integer.parseInt(scan.nextLine().trim());
			System.out.println();
			grades[gradesItr] = gradesItem;
		}

		int[] result = gradingStudents(grades);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			System.out.println((result[resultItr]));
		}
	}
}
