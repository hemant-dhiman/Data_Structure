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

        System.out.println("===prepend 1===");
        doublyLinkedList.prepend(1);
        doublyLinkedList.printHead();
        doublyLinkedList.printTail();
        doublyLinkedList.printLength();
        doublyLinkedList.printDoublyLL();

        System.out.println("===prepend 2===");
        doublyLinkedList.prepend(2);
        doublyLinkedList.printHead();
        doublyLinkedList.printTail();
        doublyLinkedList.printLength();
        doublyLinkedList.printDoublyLL();

        System.out.println("===remove first " + doublyLinkedList.removeFirst().value + "===");
        doublyLinkedList.printHead();
        doublyLinkedList.printTail();
        doublyLinkedList.printLength();
        doublyLinkedList.printDoublyLL();
        System.out.println("===remove first " + doublyLinkedList.removeFirst().value + "===");
        System.out.println("===remove first " + doublyLinkedList.removeFirst() + "===");
        doublyLinkedList.printLength();

    }
}
