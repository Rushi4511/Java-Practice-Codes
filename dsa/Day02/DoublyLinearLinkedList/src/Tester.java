
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new List();
		
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		//list.addLast(50);
		//list.addLast(60);
		
		//list.addPosition(100, 3);
		//list.addPosition(100, 1);
		//list.addPosition(100, 5);
		//list.addPosition(100, 0);
		//list.addPosition(100, 10);
		
		//list.deleteFirst();
		//list.deleteLast();
		
		//list.deletePosition(3);
		//list.deletePosition(1);
		//list.deletePosition(4);
		//list.deletePosition(-1);
		list.deletePosition(10);
		
		list.forwardDisplay();
		list.backwardDisplay();
		System.out.println("List size : " + list.size());
		
		list.deleteAll();
	}

}
