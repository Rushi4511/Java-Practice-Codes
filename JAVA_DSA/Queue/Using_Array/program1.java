class Queue{

	
	int arr[];
	int front;
	int rear;
	int current_Size;
	int N;
	

	public Queue(int default_Size){
		
		N = default_Size;
		arr = new int[N];
		front =0;
		rear=0;
	}

	public void push(int x){

		if(!full()){
			arr[rear] = x;
			rear = (rear+1)%N;
			current_Size++;
		}
	}

	public void pop(){
		if(!empty()){

			front = (front+1)%N;
			current_Size--;
		}
	}

	public int getFirst(){
		if(!empty()){
			return arr[front];

		}else{
			System.out.println("Error:Queue is Empty");
			return -1;
		}
	}

	public boolean empty(){
		return current_Size==0;
	}

	public boolean full(){
		return current_Size == N;
	}

	public static void main(String[] args){
	
		

		Queue q = new Queue(5);
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		q.push(6);
		q.pop();
		q.pop();
		q.push(7);
		q.push(8);

		while(!q.empty()){
			System.out.println(q.getFirst());
			q.pop();
		}
	}
}

