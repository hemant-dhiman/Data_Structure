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
    }
}
