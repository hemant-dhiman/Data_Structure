package QueueDataStructure;

public class Queue {
    private int[] Queue;
    private int front;
    private int rear;

    Queue(int size) {
        this.Queue = new int[size];
        this.front = this.rear = 0;
    }

    int capacity() {
        return this.Queue.length;
    }

    int length() {
        return this.rear;
    }

    void enqueue(int value) {
        if (this.front == this.rear || this.rear < this.Queue.length) {
            this.Queue[this.rear] = value;
            this.rear++;
        }else
        throw new QueueOverFlowException("Queue is OVERFLOW! Size=" + this.Queue.length + " and given " + (this.Queue.length + 1));
    }

    int dequeue() {
        if (this.rear > this.front) {
            int value = 0;
            this.rear--;
            if (this.rear <= this.Queue.length && this.front >= 0) {
                value = Queue[this.front];
                System.arraycopy(Queue, 1, Queue, 0, Queue.length - 1);
            }
            return value;
        }
        throw new QueueUnderFlowException("Queue UNDERFLOW!");
    }

}

class QueueUnderFlowException extends RuntimeException {

    QueueUnderFlowException(String str) {
        super(str);
    }

}

class QueueOverFlowException extends RuntimeException {

    QueueOverFlowException(String str) {
        super(str);
    }

}
