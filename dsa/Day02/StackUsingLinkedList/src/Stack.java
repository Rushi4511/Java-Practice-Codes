
public class Stack {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public Stack() {
		head = null;
	}
	
	public void push(int data) {
		//1. create a node and add at first 
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
	}
	
	public int pop() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			temp = head.data;
			//delete first node
			head = head.next;
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			//a. read data of top index
			temp = head.data;
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
}















