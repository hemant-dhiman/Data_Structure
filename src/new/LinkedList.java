import java.util.Scanner;;

class LinkedList {

    static class Node {
        String info;
        Node next;

        public Node(String info) {
            this.info = info;
            this.next = null;
        }
    }

    // Node head;
    private Node start, current, newNode = null;

    public void create() {
        Scanner scan = new Scanner(System.in);
        char c;
        do {
            System.out.print("Enter data: ");
            newNode = new Node(scan.next());
            if (this.start == null) {
                this.start = newNode;
                this.current = newNode;
            } else {
                this.current.next = newNode;
                this.current = newNode;
            }
            System.out.print("Want to Enter Mode [y/n]: ");
            c = scan.next().charAt(0);
        } while (c == 'y');
        scan.close();
    }

    public void show(){
        Node n = this.start;
        while(n != null){
            System.out.print(n.info + "-->");
            n = n.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.create();
        l.show();
    }
}

// LinkedList linkedList = new LinkedList();

//         // First node
//         linkedList.head = new Node("1");

//         // second node
//         Node second = new Node("2");
//         linkedList.head.next = second;

//         // third node
//         Node third = new Node("3");
//         second.next = third;
//         third.next = null;

//         Node n = linkedList.head;
//         while(n != null){
//             System.out.print(n.info + "-->");
//             n = n.next;
//         }
//         System.out.print("null");