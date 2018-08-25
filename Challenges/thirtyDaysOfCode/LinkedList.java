package thirtyDaysOfCode;

import java.util.Scanner;

public class LinkedList {
	class Node {
		int data;
		Node next;
		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}
	
	public static Node insert(Node head,int data) {
        //Complete this method
        LinkedList ll = new LinkedList();
		Node newNode = ll.new Node(data);
        if(head == null) {
        	head = newNode;
        } 
        else {
        	Node start = head;
            while(start.next != null) {
                start = start.next;
            }
            start.next = newNode;
        }
        return head;
    }
	
	public static void display(Node head) {
		Node start = head;
		while(start!= null) {
			System.out.println(start.data + " ");
			start = start.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();
		
		while(N > 0) {
			int ele =sc.nextInt();
			head = insert(head,ele);
			N--;
		}
		display(head);
		sc.close();
	}
}
