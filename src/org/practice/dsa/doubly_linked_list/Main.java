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


        System.out.println("Doubly linked list get testing");

        DoublyLinkedList testGet = new DoublyLinkedList(0);
        testGet.append(1);
        testGet.append(2);
        testGet.append(3);

        System.out.println("Get Node value from index: 1 = " + testGet.get(1).value);
        System.out.println("Get Node value from index: 2 = " + testGet.get(2).value);
        System.out.println("Set index 2 value to 50: " + testGet.set(2, 50));
        System.out.println("Get Node value from index: 2 = " + testGet.get(2).value + '\n');

        testGet.printDoublyLL();

    }
}
