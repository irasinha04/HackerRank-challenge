package thirtyDaysOfCode;

import java.util.Scanner;


public class BinarySolution {

	public static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}

	public static class LinkedList {
		static Node head;

		public static void append(int data) {
			if(head == null) {
				head = new Node(data);
				return;
			}
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}

		public static void printList() {
			Node traverse;
			System.out.println("List contains :");
			for(traverse = head; traverse != null; traverse = traverse.next) {
				System.out.print(traverse.data + " ");
			}
			System.out.println();
		}

		public static void maxOnes() {
			Node traverse;
			int count = 0, maxCount = 0;
			for(traverse = head; traverse != null; traverse = traverse.next) {
				if(traverse.data != 1) {
					count = 0;
				}
				else {
					count ++;
				}
				if(count > maxCount)
					maxCount = count;
			}
			System.out.println("Maximum number of 1's is : "+maxCount);
		}

		public static void Binary(int num) {
			int digit = 0;	
			while(num > 0) {
				digit = num % 2;
				append(digit);
				num = num / 2;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		LinkedList.Binary(num);
		LinkedList.printList();
		LinkedList.maxOnes();
	}
}