import java.util.*;

class StackDemo{

	public static void main(String[] args){

		Stack s = new Stack();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);

		s.pop();
		s.size();
		s.isEmpty();
		System.out.println(s.peek());
		System.out.println(s.search(10));
		System.out.println(s);
	}
}

