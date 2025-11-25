
public class Queue {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head, tail;
	public Queue() {
		head = tail = null;
	}
	
	public void push(int data) {
		// create newnode and at last position
		Node newnode = new Node(data);
		if(head == null)
			head = tail = newnode;
		else {
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	public int pop() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			temp = head.data;
			// delete first node
			if(head == tail)
				head = tail = null;
			else 
				head = head.next;
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			//a. read data from front end
			temp = head.data;
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
}
















