import java.util.*;

class Stack{

	int maxSize;
	int stackArr[];
	int top=-1;

	Stack(int size){
		this.stackArr = new int[size];
		this.maxSize=size;
	}
	
	// Push
	void push(int data){
		if(top == maxSize-1){
			System.out.println("Stack overflow");
			return;
		}else{
			top++;
			stackArr[top] = data;
		}
	}

	// Pop
	int pop(){
		if(empty()){
			System.out.println("Stack is Empty");
			return -1;
		}else{
			int val = stackArr[top];
			top--;
			return val;
		}
	}

	// Peek
	int peek(){

		if(empty()){
			System.out.println("Stack is Empty");
			return -1;
		}else{
			return stackArr[top];
		}
	}


	// Size
	int size(){
		return top;
	}

	// Print Stack
	void printStack(){

		if(empty()){
			System.out.println("Nothing to print");
			return;
		}else{
			System.out.print("[");
			for(int i=0;i<=top;i++){

				System.out.print(stackArr[i]+" ");
			}
			System.out.println("]");
		}
	}

	// Empty
	boolean empty(){

		if(top == -1){
			return true;
		}else{
			return false;
		}
	}
}

class Client{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		Stack s = new Stack(size);

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);

		s.printStack();
		
	}


}
