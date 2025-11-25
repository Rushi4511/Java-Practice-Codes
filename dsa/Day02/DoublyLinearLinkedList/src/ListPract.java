public class ListPract {

    static class Node {
        private Node prev;
        private int data;
        private Node next;

        public Node(int value) {
            prev = null;
            data = value;
            next = null;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    public ListPract() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }

    public void display() {
        Node trav = head;

        while (trav != null) {
            System.out.print(" " + trav.data);
            trav = trav.next;
        }
        System.out.println();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.prev = null;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node trav = head;
        while (trav.next != null) {
            trav = trav.next;
        }

        newNode.prev = trav;

        newNode.next = null;
        trav.next = newNode;

        size++;
    }

    public void delFirst() {
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }

        size--;
    }

    public void delLast() {
        if (size == 1) {
            head = tail = null;
        } else {
            Node trav = head;

            while (trav.next != null) {
                trav = trav.next;
            }

            trav.prev.next = null;
        }
        size--;
    }

    public void addAtPos(int data, int pos) {
        if (head == null) {
            addFirst(data);

        } else if (pos <= 1) {
            addFirst(data);
        } else if (pos == size) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node trav = head;

            for (int i = 1; i < pos - 1; i++) {
                trav = trav.next;
            }
            newNode.prev = trav;
            newNode.next = trav.next;
            trav.next.prev = newNode;
            trav.next = newNode;

        }

        size++;
    }

    public void displaySize() {
        System.out.println(size);
    }

    public void delAtPos(int pos) {
        if (head == null) {
            System.out.println("LinkedList is Empty");
        } else if (pos <= 1) {
            delFirst();
        } else if (pos == size) {
            delLast();
        } else {
            Node trav = head;

            for (int i = 1; i < pos - 1; i++) {
                trav = trav.next;
            }

            trav.next.prev = trav;
            trav.next = trav.next.next;

        }
    }

}

class Testing {
    public static void main(String[] args) {
        ListPract list = new ListPract();

        list.display();
        // System.out.println(list.isEmpty());

        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        // list.display();
        list.addLast(50);
        // list.delFirst();
        // list.delLast();
        list.displaySize();
        list.addAtPos(60, 5);
        list.display();
        list.delAtPos(3);

        list.display();
    }
}
