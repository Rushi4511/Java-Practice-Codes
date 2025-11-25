
public class List {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public List() {
		head = tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return head == null;
		//return head == null && tail == null;
		//return size == 0;
	}
	
	public void deleteAll() {
		head = tail = null;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public void addFirst(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null) {
			//a. add newnode into head and tail
			head = tail = newnode;
			//b. make list circular
			tail.next = head;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move head on newnode
			head = newnode;
		}
		size++;
	}
	
	public void addLast(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null) {
			//a. add newnode into head and tail
			head = tail = newnode;
			//b. make list circular
			tail.next = head;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move tail on newnode
			tail = newnode;
		}
		size++;
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head == tail)
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. move head on second node
			head = head.next;
			//b. add second node into next of last node
			tail.next = head;
		}
		size--;
	}
	
	public void display() {
		//0. if list is empty then return
		if(head == null)
			return;
		//1. create trav and start at first node
		Node trav = head;
		System.out.print("List  : ");
		do {
			//2. print current node data
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}while(trav != head);
		//4. repeate above two steps for each node
		System.out.println("");
	}
	
	
	
}

























