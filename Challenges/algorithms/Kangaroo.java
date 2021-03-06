package algorithms;

import java.io.*;
import java.util.*;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		if (v1 == v2 && x1 == x2) {
			return "YES";
		} else if (v1 == v2 && x1 != x2) {
			return "NO";
		} else {
			double positionX1 = x1;
			double M = (x2 - positionX1) / (v1 - v2);
			int Mult = (x2 - x1) / (v1 - v2);
			if (Mult - M == 0 && M > 0) {
				return "YES";
			}
		}
		return "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] x1V1X2V2 = scanner.nextLine().split(" ");

		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		System.out.println(result);
		scanner.close();
	}
}