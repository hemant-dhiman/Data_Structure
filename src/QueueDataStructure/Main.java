package QueueDataStructure;

import javax.xml.transform.sax.SAXSource;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(3);

        System.out.println("Capacity of Queue: "+queue.capacity());

        queue.enqueue(76);
        queue.enqueue(34);
        System.out.println("front"+queue.getFront());
        System.out.println("rear"+queue.getRear());

        System.out.println();
        System.out.println("call dequeue");
        queue.dequeue();
        System.out.println("front"+queue.getFront());
        System.out.println("rear"+queue.getRear());

        System.out.println();
        System.out.println("call enqueue");
        queue.enqueue(45);
        System.out.println("front"+queue.getFront());
        System.out.println("rear"+queue.getRear());

        System.out.println();
        System.out.println("call enqueue");
        queue.enqueue(676);
        System.out.println("front"+queue.getFront());
        System.out.println("rear"+queue.getRear());

//        System.out.println();
//        System.out.println("call enqueue");
//        queue.enqueue(676);
//        System.out.println("front"+queue.getFront());
//        System.out.println("rear"+queue.getRear());
    }
}
