import java.util.*;

class RevLinkedList{
/*
	void reverseItr(){

		if(head == null)
			return;
		Node prev = null;
		Node curr = head;
		Node forward = null;

		while(curr!= null){
			forward =curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		head = prev;
	}
*/
	public static void main(String[] args){

		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);

		System.out.print(s);
	}


}
