package Linked_List;

import java.util.Scanner;

class LinkedList{
    static class node{
        int data;
        node next;

        node(int a){
            this.data = a;
            this.next = null;
        }
    }
    private node start, current,new_node  = null;

    public void create(){
        
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter Data:");
            new_node = new node(sc.nextInt());

            if(start == null){
                this.start = new_node;
                this.current = new_node;
            }else{
                this.current.next = new_node;
                this.current = new_node;
            }
            System.out.println("do you want to add node (y/n):");
            ch = sc.next().charAt(0);
        } while (ch == 'y');
        sc.close();
    }

    public void show(){
        node n = this.start;

        while(n != null){
            System.out.print(n.data+"--->");
            n=n.next;
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        LinkedList linkedlist1 = new LinkedList();
        linkedlist1.create();
        linkedlist1.show();
        //System.out.println(linkedlist1.start);
    }
}