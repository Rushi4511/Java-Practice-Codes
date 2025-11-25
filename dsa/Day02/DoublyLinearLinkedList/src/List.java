
public class List {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
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
		return head == null && tail == null;
	}
	
	public void deleteAll() {
		head = tail = null;
		size = 0;
	}
	
	public void addFirst(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if list is empty then add newnode into head and tail
		if(head == null)
			head = tail = newnode;
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into prev of first node
			head.prev = newnode;
			//c. move head on newnode
			head = newnode;
		}
		size++;
	}
	
	public void addLast(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if list is empty then add newnode into head and tail
		if(head == null)
			head = tail = newnode;
		//3. if list is not empty
		else {
			//a. add last node into prev of newnode
			newnode.prev = tail;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move tail on newnode
			tail = newnode;
		}
		size++;
	}
	
	public void addPosition(int value, int pos) {
		//0. if position is invalid then return
		// valid positions : 1 to size + 1
		// invalid positions : < 1 and > size + 1
		if(pos < 1 || pos > size + 1)
			return;
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if list is empty then add newnode into head and tail
		if(head == null)
			head = tail = newnode;
		//special case : pos = 1
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		// special case : pos = size + 1
		else if(pos == size + 1) {
			addLast(value);
			return;
		}
		//3. if list is not empty
		else {
			// traverse till pos - 1 node
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			//a. add pos node into next of newnode
			newnode.next = trav.next;
			//b. add pos - 1 node into prev of newnode
			newnode.prev = trav;
			//c. add newnode into prev of pos node
			trav.next.prev = newnode;
			//d. add newnode into next of pos - 1 node
			trav.next = newnode;
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
			//b. add null into prev of second node
			head.prev = null;
		}
		size--;
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head == tail)
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. move tail on second last node
			tail = tail.prev;
			//b. add null into next of second last node
			tail.next = null;
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		//0. if position is invalid, return
		// valid positions : 1 to size
		// invalid positions : < 1 or > size
		if(pos < 1 || pos > size)
			return;		
		//1. if list is empty
		if(head == null)
			return;
		// special case : pos = 1
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		// special case : pos = size
		else if(pos == size) {
			deleteLast();
			return;
		}
		//2. if list is not empty
		else {
			//a. traverse till pos node
			Node trav = head;
			for(int i = 1 ; i < pos ; i++)
				trav = trav.next;
			//b. add pos + 1 node into next of pos - 1 node
			trav.prev.next = trav.next;
			//c. add pos - 1 node into prev of pos + 1 node
			trav.next.prev = trav.prev;
		}
		size--;
	}

	public void forwardDisplay() {
		Node trav = head;
		System.out.print("Forward List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void backwardDisplay() {
		Node trav = tail;
		System.out.print("backward List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		}
		System.out.println("");
	}
	
	public int size() {
		return size;
	}
}


















