package org.practice.dsa.doubly_linked_list;

/**
 * @author Hemant Dhiman
 * @since 09/03/24
 */
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);

        doublyLinkedList.append(8);

        doublyLinkedList.printHead();
        doublyLinkedList.printTail();
        doublyLinkedList.printLength();
        doublyLinkedList.printDoublyLL();

        System.out.println("===remove last " + doublyLinkedList.removeLast().value + "===");


        System.out.println("===remove last " + doublyLinkedList.removeLast().value + "===");
        System.out.println("===remove last " + doublyLinkedList.removeLast() + "===");
        doublyLinkedList.printLength();

    }
}
