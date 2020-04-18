package Linked_List;

public class LinkedList_basic {
    static class Node{
        int information;
        Node next;

        Node(int data){
            information = data;
            next = null;
        }
    }

    Node head;

    public static void main(String[] args) {
        LinkedList_basic linkedlist = new LinkedList_basic();

        linkedlist.head = new Node(0);

        Node node_1 = new Node(1);
        linkedlist.head.next = node_1;

        Node node_2 = new Node(2);
        node_1.next = node_2;

        Node node_3 = new Node(3);
        node_2.next = node_3;
        node_3.next = null;

        //node_3.next = null;

        Node n = linkedlist.head;
        while(n != null){
            System.out.println(n.information);
            n = n.next;
        }

    }
}
