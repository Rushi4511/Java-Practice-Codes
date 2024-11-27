import java.util.*;

class PQueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		// pq.offer(20);
		pq.offer(101);
		pq.offer(30);
		pq.offer(20);
		pq.offer(88);
		pq.offer(90);
		pq.offer(10);
		pq.offer(15);
		pq.offer(50);
		pq.offer(60);
		// pq.offer("E");

		System.out.println(pq);
	}
}
