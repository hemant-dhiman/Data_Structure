package org.practice.dsa.linked_list;

/**
 * @author Hemant Dhiman
 * @since 13/02/24
 */
public class LList {
    private LlNode head;
    private LlNode tail;
    private int length;

    class LlNode {
        int value;
        LlNode next;

        public LlNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LList(int value) {
        LlNode newNode = new LlNode(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printLList() {
        LlNode temp = this.head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        LlNode newNode = new LlNode(value);

        if (this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        }

        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
    }

    public LlNode removeLast() {

        if (this.head == null) return null;

        LlNode current = this.head;
        LlNode previous = this.head;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        this.tail = previous;
        this.length--;

        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }
        return current;
    }

    public void prepend(int value) {
        LlNode newNode = new LlNode(value);
        if (this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        }

        newNode.next = this.head;
        this.head = newNode;
        this.length++;
    }

    public LlNode removeFirst() {
        if (this.head == null && this.tail == null) return null;

        LlNode current = this.head;
        this.head = this.head.next;
        current.next = null;
        this.length--;

        if (this.length == 0) {
            this.tail = null;
        }
        return current;
    }

    public LlNode get(int index) {
        if (index < 0 || index >= length) return null;

        LlNode current = this.head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public boolean set(int index, int value) {
        LlNode current = this.get(index);
        if (current != null) {
            current.value = value;
            return true;
        }
        return false;
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

        LlNode newNode = new LlNode(value);
        LlNode temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
        return true;
    }

    public LlNode remove(int index) {
        if (index < 0 || index >= this.length) return null;

        if (index == 0) return this.removeFirst();

        if (index == this.length - 1) return this.removeLast();

        LlNode previous = this.get(index - 1);
        LlNode current = previous.next;

        previous.next = current.next;
        current.next = null;
        this.length--;
        return current;
    }

    public void reverse() {
        LlNode temp = this.head;
        this.head = this.tail;
        this.tail = temp;

        LlNode before = null;
        LlNode after = temp.next;

        for (int i = 0; i < this.length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}

