

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }

    }

    public int size() {
        return size;
    }

    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void removeDob() {
        Node curr = head;
        Node foll = curr.next;
        int count=size;
        while (count >= 0) {
            if (curr.value != curr.next.value) {
                curr = foll;
                foll = foll.next;
            } else {
                foll = curr.next;
                curr.next = foll.next;
                size--;
            }
            count--;
        }
        tail=curr;
    }

    public void writeList() {
        Node curr = this.head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }

    }
}