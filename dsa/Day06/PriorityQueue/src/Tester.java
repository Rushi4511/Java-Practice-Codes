
public class Tester {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue(9);
		
		q.push(6);
		q.push(14);
		q.push(3);
		q.push(26);
		
		System.out.println("Peeked value : " + q.peek());		//26
		System.out.println("Poped value : " + q.pop());
		
		System.out.println("Peeked value : " + q.peek());		//14
		
		

	}

}
