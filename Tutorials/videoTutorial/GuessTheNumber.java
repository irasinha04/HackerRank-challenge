package videoTutorial;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	int theNUMBER;
	int max;
	Scanner scanner = new Scanner(System.in);

	public GuessTheNumber() {
		Random rand = new Random();
		max = 100;
		theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
	}

	public void play() {
		while (true) {
			int move = scanner.nextInt();
			if (move > theNUMBER) {
				System.out.println("Your number is too big.");
			} else if (move < theNUMBER) {
				System.out.println("Your number is too small.");
			} else {
				System.out.println("You got it !");
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessTheNumber guessGame = new GuessTheNumber();
		System.out.println("Welcome to the GUESS GAME. Try to guess the number. It is between 0 and "+ guessGame.max +" inclusive. Just type a number to get started.");
		guessGame.play();
	}

}
