package org.practice.dsa.doubly_linked_list;

/**
 * @author Hemant Dhiman
 * @since 09/03/24
 */
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
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


}
