package Linked_List;

import java.util.Scanner;

public class LinkedListMiddle {
    static class node{
        int data;
        node next;
        node(int a){
            this.data = a;
            this.next = null;
        }
    }
    node start, current, new_node = null;
    public void create(){
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
            System.out.println("Enter data: ");
            new_node = new node(sc.nextInt());
            if(start == null){
                start = new_node;
                current = new_node;
            }else{
                current.next = new_node;
                current = new_node;
            }
            System.out.print("Do you want to add more (y/n):");
            ch = sc.next().charAt(0);

        }while(ch == 'y');
        //sc.close();
    }
    public void insert(int item, int afterItem){
        node temp = new node(item);
        node n = start;
        node pre= start;
        while(n.data != afterItem){
            pre = n.next;
            n = n.next;
        }
        temp.next = pre.next;
        pre.next = temp;
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
        LinkedListMiddle linkedlist1 = new LinkedListMiddle();
        linkedlist1.create();
        linkedlist1.show();

        Scanner a = new Scanner(System.in);
        System.out.println("\nAfter which element you want to add the item:");
        int ele = a.nextInt();

        linkedlist1.insert(100, ele);
        linkedlist1.show();
        
    }

}