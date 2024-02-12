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

