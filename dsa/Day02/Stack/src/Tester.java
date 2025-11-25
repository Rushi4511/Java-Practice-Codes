
public class Tester {

	public static void main(String[] args) {
		
		Stack st = new Stack(4);
		
		System.out.println("isFull : " + st.isFull());
		System.out.println("isEmpty : " + st.isEmpty());
		
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println("Peek : " + st.peek()); //30
		
		st.pop();		// 30
		
		System.out.println("Peek : " + st.peek());	//20
		
		st.push(40);
		st.push(50);
		st.push(60);
		
		System.out.println("Peek : " + st.peek());	//50
		
		System.out.println("isFull : " + st.isFull());
		System.out.println("isEmpty : " + st.isEmpty());
		

	}

}
