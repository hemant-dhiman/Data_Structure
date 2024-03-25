package org.practice.dsa.doubly_linked_list;

/**
 * @author Hemant Dhiman
 * @since 09/03/24
 */
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node {
        int value;
        Node next;
        Node previous;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.previous = null;
        }
    }

    public DoublyLinkedList(int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        this.length = 1;
    }

    public void printDoublyLL() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void printHead() {
        System.out.println("Head: " + this.head.value);
    }

    public void printTail() {
        System.out.println("Tail: " + this.tail.value);
    }

    public void printLength() {
        System.out.println("Length: " + this.length);
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (this.length == 0) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
            newNode.previous = this.tail;
        }
        this.tail = newNode;
        this.length++;
    }

    public Node removeLast() {
        if (this.length == 0) return null;
        Node temp = this.tail;
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = this.tail.previous;
            this.tail.next = null;
            temp.previous = null;
        }
        this.length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.previous = newNode;
            this.head = newNode;
        }
        this.length++;
    }

    public Node removeFirst() {
        if (this.length == 0) return null;
        Node temp = this.head;
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.previous = null;
            temp.next = null;
        }
        this.length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= this.length) return null;

        Node temp = this.head;
        if (index < this.length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = this.tail;
            for (int i = this.length - 1; i > index; i--) {
                temp = temp.previous;
            }
        }
        return temp;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > this.length) return false;

        if (index == 0) {
            this.prepend(value);
            return true;
        }

        if (index == this.length) {
            this.append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node before = this.get(index - 1);
        Node after = before.next;
        newNode.previous = before;
        newNode.next = after;

        before.next = newNode;
        after.previous = newNode;

        this.length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= this.length) return null;
        if (index == 0) return this.removeFirst();
        if (index == this.length - 1) return this.removeLast();

        Node temp = this.get(index - 1);
        temp.next.previous = temp.previous;
        temp.previous.next = temp.next;
        temp.next = null;
        temp.previous = null;

        this.length--;
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = this.get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }


}
