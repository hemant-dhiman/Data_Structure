package Linked_List;

import java.util.Scanner;

public class LinkedListBeg {
    static class node{
        int data;
        node next;

        node(int a){
            this.data = a;
            this.next = null;
        }
    }
    node start, current, new_node= null;
    public void create(){
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter Data:");
            new_node = new node(sc.nextInt());
            if(start == null){
                start = new_node;
                current = new_node;

            }else{
                new_node.next = start;
                start = new_node;
            }
            System.out.print("Do you want to add more (y/n):");
            ch = sc.next().charAt(0);

        } while (ch == 'y');
        sc.close();
    }
    public void show(){
        node n = start;
        while(n != null){
            System.out.print(n.data+"--->");
            n = n.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        LinkedListBeg linkedlist1 = new LinkedListBeg();

        linkedlist1.create();
        linkedlist1.show();
    }
    
}