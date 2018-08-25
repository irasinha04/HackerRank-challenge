package dataStructures;

import java.io.IOException;
import java.util.Scanner;

public class InsertNodeAtGivenPosition {
	
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;
		
		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}
	
	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;
		
		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}
		
		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
 		
			if(this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}
			
			this.tail = node;
		}
	}
	
	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
		while(node != null) {
			System.out.print(String.valueOf(node.data));
			
			node = node.next;
			
			if(node != null) {
				System.out.print(sep);
			}
		}
	}
	
	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(head == null && position == 0){
            head = newNode;  
        }
        else {
            SinglyLinkedListNode start = head;
            for(int i = 0; i < position - 1; i++) {
                start = start.next;
            }
            newNode.next = start.next;
            start.next = newNode;
        }
        return head;
    }
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		SinglyLinkedList llist = new SinglyLinkedList();
		
		System.out.println("Enter size of list :  ");
		int llistCount = sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		System.out.println("Enter list item(s) : ");
		for(int i = 0; i < llistCount; i++) {
			int llistItem = sc.nextInt();
			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			llist.insertNode(llistItem);
		}
		
		System.out.println("Enter data to be inserted in the list : ");
		int data = sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		System.out.println("Enter position to be inserted in the list : ");
		int position = sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);
		
		printSinglyLinkedList(llist_head, " ");
		
		sc.close();
	}
}
