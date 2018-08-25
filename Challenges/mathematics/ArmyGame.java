package mathematics;

import java.util.Scanner;

public class ArmyGame {
	
	private static int cell_1x1() {
		return 1;
	}
	
	private static int cell_1xc(int r, int c) {
		if(c % 2 == 0) {
			return (c / 2);
		}
		return (c / 2) + cell_1x1();
	}
	
	private static int cell_2xc(int r, int c) {
		if(c % 2 == 0) {
			return (c / 2);
		}
		return (c / 2) + cell_rx1(2, c);
	}
	
	private static int cell_rx1(int r, int c) {
		if(r % 2 == 0) {
			return (r / 2);
		}
		return (r / 2) + cell_1xc(r, c);
	}

	static int gameWithCells(int r, int c) {
		if(r % 2 == 0) {
			System.out.println((r / 2) + " * " + (cell_2xc(r,c)));
			return (r / 2) * cell_2xc(r, c);
		}
		System.out.println((r / 2) + " * " + (cell_2xc(r,c)) + " + " + cell_1xc(r, c));
		return (r / 2) * cell_2xc(r, c) + cell_1xc(r, c);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter m : ");
		int m = scanner.nextInt();
		scanner.nextLine();
		int result = gameWithCells(n, m);
		System.out.println("Minimum package drops required : " + result);
		scanner.close();
	}
}
