import java.util.*;

class Node {

	int data;

	Node next = null;

	Node(int data) {
		this.data = data;

	}
}

class SinglyLinkedList {

	Node head = null;

	// ADD First Function
	void addFirst(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	// ADD Last
	void addLast(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = newNode;

		}

	}

	// ADD at Position
	void addAtPos(int pos, int data) {

		
		if (pos <= 0 || pos >= countNode() + 2) {
			System.out.println("Wrong Input");
			return;
		}
		if (pos == 1) {
			addFirst(data);
		} else if (pos == countNode() + 1) {
			addLast(data);
		} else {
			Node newNode = new Node(data);
			Node temp = head;

			while (pos - 2 != 0) {
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	// DELETE First
	void delFirst(){
		
		if(countNode()==0){
			System.out.println("Cannot Delete Linkedlist is Empty");
			return;

		}
		if(countNode()==1){
			head = null;
		}else{
			head =head.next;
		}
	}
	// DELETE Last
	void delLast(){

		
		if(countNode()==0){
			System.out.println("Cannot Delete Linkedlist is Empty");
			return;

		}
		if(countNode()==1){
			head = null;
		}else{
			Node temp = head;
			while(temp.next.next != null){
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	// DELETE At Position
	void delAtPos(int pos){

		
		if (pos <= 0 || pos >= countNode()+ 2) {
			System.out.println("Wrong Input");
			return;
		}
		if (pos == 1) {
			delFirst();
		} else if (pos == countNode()) {
			delLast();
		} else {
			
			Node temp = head;

			while (pos - 2 != 0) {
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
		}

	}


	// Reverse a Linked List
	void reverseItr(){

		if(head == null)
			return ;
		Node prev = null;
		Node curr = head;
		Node forward = null;

		while(curr!=null){
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		head = prev;
	}

	void middleNode1(){
		int len = countNode();
		Node temp = head;
		int count=0;
		while(count < len/2){
			temp= temp.next;
			count++;
		}
		System.out.println(temp.data);
	}

	void middleNode2(){

		Node slow =head;
		Node fast =head.next;

		while(fast!=null){
			fast = fast.next;
			if(fast!=null){
				fast = fast.next;
			}
			slow = slow.next;
		}

		System.out.println(slow.data);
	}


	// PRINT SLL
	void printSLL() {

		if (head == null) {
			System.out.println("Empty Linked List");
		} else {
			Node temp = head;
			while (temp.next != null)/*(temp!=null)*/ {
				System.out.print(temp.data + "->");
				temp = temp.next;

			}
			System.out.print(temp.data);

			System.out.println();
		}
	}

	int countNode() {

		int count = 0;
		Node temp = head;

		if (head == null) {
			return 0;
		}

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;
	}

}

class Client {
	public static void main(String[] args) {

		SinglyLinkedList ll = new SinglyLinkedList();
		
		char ch;

		do{
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.delFirst");
			System.out.println("5.delLast");
			System.out.println("6.delAtPos");
			System.out.println("7.countNode");
			System.out.println("8.printSLL");
			System.out.println("9.reverse Linked List");
			System.out.println("10.middleNode");
			System.out.println("11.middleNode using Slow-Fast Pointer");
			System.out.println("Enter a Choice");


			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch(choice){
				case 1: 
					{
						System.out.println("Enter Data");
						int data = sc.nextInt();
						ll.addFirst(data);
					}
					break;
				case 2: 
					{
						System.out.println("Enter Data");
						int data = sc.nextInt();
						ll.addLast(data);
					}
					break;
				case 3: 
					{
						System.out.println("Enter Position");
						int pos = sc.nextInt();
						System.out.println("Enter Data");
						int data = sc.nextInt();
						ll.addAtPos(pos,data);
					}
					break;

				case 4: 
					{
						ll.delFirst();
					}
					break;

				case 5: 
					{
						ll.delLast();
					}
					break;
				case 6: 
					{
						System.out.println("Enter Position");
						int pos = sc.nextInt();
						ll.delAtPos(pos);
					}
					break;
				case 7: 
					{
						
						ll.countNode();
					}
					break;
				case 8: 
					{
						ll.printSLL();
					}
					break;
				case 9: 
					{
						ll.reverseItr();
					}
					break; 
				case 10: 
					{
						ll.middleNode1();
					}
					break;
				case 11:
					{
						ll.middleNode2();
					}
					break;
				default:
					System.out.println("Wrong Choice");
					break;
			}


			System.out.println("Do you want to continue?");
			ch = sc.next().charAt(0);

		}
		while(ch =='y' || ch == 'Y');
		if(ch !='y' || ch != 'Y'){
			System.out.println("Thank You............");
			return;
		}
	}
}
