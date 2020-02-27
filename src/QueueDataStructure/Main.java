package QueueDataStructure;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(3);

        for (int i = 0; i < queue.capacity(); i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.length());

        for (int i = 0; i < queue.capacity(); i++) {
            System.out.println(queue.dequeue());
        }
    }
}
