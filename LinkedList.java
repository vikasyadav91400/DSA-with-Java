public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(10, 1);
        list.add(20, 2);
        list.add(30, 2);
        list.printList();
    }
}

class MyLinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void add(int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position!");
            return;
        }

        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Invalid position!");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}