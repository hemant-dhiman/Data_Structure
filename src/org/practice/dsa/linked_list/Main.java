package org.practice.dsa.linked_list;

/**
 * @author Hemant Dhiman
 * @since 13/02/24
 */
public class Main {
    public static void main(String[] args) {
        LList linkedList = new LList(14);

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.printLList();

        System.out.println();

        LList linkedList2 = new LList(1);
        linkedList2.append(48);
        linkedList2.append(46);
        linkedList2.append(47);
        System.out.println("Removed Last: " + linkedList2.removeLast().value);
        linkedList2.getHead();
        linkedList2.getTail();
        linkedList2.getLength();
        linkedList2.printLList();

        System.out.println();

        linkedList2.prepend(100);
        linkedList2.getHead();
        linkedList2.getTail();
        linkedList2.getLength();
        linkedList2.printLList();

        System.out.println();

        LList testingRemoveFirst = new LList(2);
        testingRemoveFirst.append(1);

        System.out.println("Removed First: " + testingRemoveFirst.removeFirst().value);
        testingRemoveFirst.getHead();
        testingRemoveFirst.getTail();
        testingRemoveFirst.getLength();
        testingRemoveFirst.printLList();

        System.out.println();

        LList testingGet = new LList(10);
        testingGet.append(20);
        testingGet.append(30);
        testingGet.append(40);
        System.out.println("Get: " + testingGet.get(2).value + "\n");
        testingGet.getHead();
        testingGet.getTail();
        testingGet.getLength();
        testingGet.printLList();

        System.out.println();

        System.out.println("Set 100 at 0: " + testingGet.set(0, 100));
        System.out.println("Set 100 at 4: " + testingGet.set(4, 100));
        testingGet.getHead();
        testingGet.getTail();
        testingGet.getLength();
        testingGet.printLList();

        System.out.println("---testingInsert---");

        LList testingInsert = new LList(0);
        testingInsert.append(2);
        testingInsert.getHead();
        testingInsert.getTail();
        testingInsert.getLength();
        testingInsert.printLList();
        System.out.println("Insert at index 1 with value 1: " + testingInsert.insert(1, 1));
        testingInsert.getHead();
        testingInsert.getTail();
        testingInsert.getLength();
        testingInsert.printLList();

        System.out.println("---testingRemove---");
        LList testingRemove = new LList(10);
        testingRemove.append(14);
        testingRemove.append(22);
        testingRemove.append(35);

        testingRemove.getHead();
        testingRemove.getTail();
        testingRemove.getLength();
        testingRemove.printLList();
        System.out.println("Remove at index 2 with value 22: " + testingRemove.remove(2));
        testingRemove.getHead();
        testingRemove.getTail();
        testingRemove.getLength();
        testingRemove.printLList();

        System.out.println("---testingReverse---");
        LList testingReverse = new LList(1);
        testingReverse.append(2);
        testingReverse.append(3);
        testingReverse.append(4);

        testingReverse.getHead();
        testingReverse.getTail();
        testingReverse.getLength();
        testingReverse.printLList();

        System.out.println("Reverse Linked list");
        testingReverse.reverse();
        testingReverse.getHead();
        testingReverse.getTail();
        testingReverse.getLength();
        testingReverse.printLList();
    }
}
