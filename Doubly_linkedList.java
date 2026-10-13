class Doubly_linkedList {
    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public Doubly_linkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    // Insert at front
    public void insertAtFront(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Insert at end
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Insert at a given position (1-based)
    public void insertAtPosition(int position, int value) {
        if (position < 1 || position > size + 1) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (position == 1) {
            insertAtFront(value);
            return;
        }

        if (position == size + 1) {
            insertAtEnd(value);
            return;
        }

        Node newNode = new Node(value);
        Node current = head;

        for (int i = 1; i < position; i++) {
            current = current.next;
        }

        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
    }

    // Delete from front
    public boolean deleteFromFront() {
        if (isEmpty()) {
            return false;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return true;
    }

    // Delete from end
    public boolean deleteFromEnd() {
        if (isEmpty()) {
            return false;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return true;
    }

    // Delete a given value from the list
    public boolean deleteByValue(int value) {
        if (isEmpty()) {
            return false;
        }

        Node current = head;

        while (current != null) {
            if (current.data == value) {
                if (current == head) {
                    return deleteFromFront();
                } else if (current == tail) {
                    return deleteFromEnd();
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    size--;
                    return true;
                }
            }
            current = current.next;
        }

        return false;
    }

    // Display forward
    public void displayForward() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Display backward
    public void displayBackward() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Doubly_linkedList list = new Doubly_linkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtFront(5);
        list.insertAtPosition(2, 15);

        list.displayForward();   // 5 15 10 20
        list.displayBackward();  // 20 10 15 5

        list.deleteByValue(15);
        list.displayForward();   // 5 10 20
    }
}