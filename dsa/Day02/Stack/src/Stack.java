
public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
	public void push(int data) {
		if(isFull())
			System.out.println("Stack is full");
		else {
			//a. reposition top
			top++;
			//b. add data at top index
			arr[top] = data;
		}
	}
	
	public int pop() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			temp = arr[top];
			//a. reposition top
			top--;
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			//a. read data of top index
			temp = arr[top];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE-1;
	}
	
}















