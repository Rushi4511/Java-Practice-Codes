
public class Tester {

	public static void main(String[] args) {
		
		List l = new List();
		
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		
		l.addLast(50);
		l.addLast(60);
		
		l.deleteFirst();
		l.deleteLast();
		
		l.forwardDisplay();
		l.backwardDisplay();

		l.deleteAll();
	}

}
