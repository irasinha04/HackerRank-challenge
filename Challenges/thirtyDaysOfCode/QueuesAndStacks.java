package thirtyDaysOfCode;

import java.util.*;
import java.util.LinkedList;

public class QueuesAndStacks {
	
	LinkedList<String> queuey = new LinkedList<String>();
	Stack<String> stacky = new Stack<>();
	
	private void enqueueCharacter(char c) {
		String s = "" + c;
		queuey.addLast(s);
	}
	
	private void pushCharacter(char c) {
		String s = "" + c;
		stacky.push(s);
	}
	
	private char dequeueCharacter() {
		String s = queuey.remove();
		return s.charAt(0);
	}
	
	private char popCharacter() {
		String s = stacky.pop();
		return s.charAt(0);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
//		Convert input String to an array of characters
		char[] s = input.toCharArray();
		
//		Create a class object
		QueuesAndStacks qs = new QueuesAndStacks();
		
//		Enqueue/ Push all chars to their respective data structures:
		for(char c : s) {
			qs.pushCharacter(c);
			qs.enqueueCharacter(c);
		}
		
//		Pop/ Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for(int i = 0; i < s.length / 2; i++) {
			if(qs.popCharacter() != qs.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}
		
//		Finally, print whether String s is a palindrome or not
		System.out.println("The word " + input + " is " + 
					((isPalindrome) ? "a palindrome." : "not a palindrome."));
	}

}
