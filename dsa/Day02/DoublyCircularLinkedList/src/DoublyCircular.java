public class DoublyCircular {

    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int value) {
            prev = null;
            data = value;
            next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    DoublyCircular() {
        head = null;
        tail = null;
        size = 0;
    }

    public void displayList() {
        Node trav = head;

        do {
            System.out.print(" " + trav.data);
            trav = trav.next;
        } while (trav != head);
    }

    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            newNode.next = newNode.prev = newNode;

        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        Node trav = head;

        do {
            trav = trav.next;
        } while (trav.next != head);

        newNode.prev = trav;
        newNode.next = head;
        head.prev = newNode;

        size++;
    }

}

class Testing1 {
    public static void main(String[] args) {
        DoublyCircular list = new DoublyCircular();
        // list.addFirst(10);
        // list.addFirst(20);
        list.addLast(30);
        list.displayList();

    }
}
