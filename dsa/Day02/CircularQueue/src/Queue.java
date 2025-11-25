
public class Queue {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
	}
	
	public void push(int data) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			//a. reposition rear
			rear = (rear + 1) % SIZE;
			//b. add data at rear index
			arr[rear] = data;
		}
	}
	
	public int pop() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			temp = arr[(front + 1) % SIZE];
			//a. reposition front
			front = (front + 1) % SIZE;
			// if queue is empty set front and rear back to -1
			if(front == rear)
				front = rear = -1;
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			//a. read data from front end
			temp = arr[(front + 1) % SIZE];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return front == rear && rear == -1;
	}
	
	public boolean isFull() {
		return (front == -1 && rear == SIZE - 1) || (front == rear && rear != -1);
	}
	
}
















