package queuey;

import java.util.LinkedList;

public class Queuey {
	LinkedList<Integer> queue;
		
	//Making a queue instance
	public void Queue() {
		queue = new LinkedList<Integer>();
	}
	
	//Is our queue empty?
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	//What is the size of our queue
	public int size()  {
		return queue.size();
	}
	
	//Enqueuing an item
	public void enqueue(int n) {
		queue.addLast(n);
	}
	
	//Dequeuing an item
	public int dequeue() {
		return (int) queue.remove(0);
	}
	
	//Peek at the first item
	public int peek() {
		return (int) queue.get(0);
	}
	
	public static void main(String[] args) {
		Queuey numberQueue = new Queuey();
		numberQueue.enqueue(5);
		numberQueue.enqueue(7);
		numberQueue.enqueue(6);
		System.out.println("First out : " + numberQueue.dequeue());
		System.out.println("Second out : " + numberQueue.dequeue());
		System.out.println("Third out : " + numberQueue.dequeue());
	}
}
