
public class PriorityQueue {
	private final int SIZE;
	private int heapSize;
	private int arr[];
	public PriorityQueue(int size) {
		SIZE = size;
		heapSize = 0;
		arr = new int[SIZE + 1];
	}
	
	
	public boolean isEmpty() {
		return heapSize == 0;
	}
	
	public boolean isFull() {
		return heapSize == SIZE;
	}
	
	public void push(int value) {
		//1. check if heap is full, then return
		if(isFull())
			return;
		//2. increase heap size by one
		heapSize++;
		//2. put value on first empty location from left size
		arr[heapSize] = value;
		//3. adjust position of newly added value by comparing it with all its ancestors
		int ci = heapSize;
		int pi = ci / 2;
		while(pi >= 1) {
			//3.1 if parent is already maximum than child then stop
			if(arr[pi] > arr[ci])
				break;
			//3.2 if parent is less than child  then swap
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			//3.3 update parent and child index
			ci = pi;
			pi = ci / 2;
			
		}
	}
	
	public int pop() {
		//0. if queue is empty return
		if(isEmpty())
			return -1;
		//1. take backup of root(maximum) element
		int max = arr[1];
		//2. put last element of heap at root place
		arr[1] = arr[heapSize];
		//3. decrement heap size by one
		heapSize--;
		//4. adjust position of new root
		int pi = 1;
		int ci = pi * 2;
		while(ci <= heapSize) {
			//4.1 find index of max child
			if((ci + 1) <= heapSize && arr[ci + 1] > arr[ci])
				ci = ci + 1;
			//4.2 if parent is already maximum than max child then stop
			if(arr[pi] > arr[ci])
				break;
			//4.3 if parent is less than max child then swap
			int temp = arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = temp;
			//4.4 update index of parent and child
			pi = ci;
			ci = pi * 2;
		}
		//5. return deleted element
		return max;
	}
		
	public int peek() {
		//0. if queue is empty return
		if(isEmpty())
			return -1;
		return arr[1];
	}
	
	
	
	

}









