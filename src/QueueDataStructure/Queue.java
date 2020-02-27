package QueueDataStructure;

import java.lang.reflect.Array;

public class Queue {
    private int[] Queue;
    private int front;
    private int rear;
    private int dequeue_count = 1;

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
        this.dequeue_count--;
        if (this.front == this.rear || this.rear < this.Queue.length) {
            this.Queue[this.rear] = value;
            this.rear++;
        } else
            throw new QueueOverFlowException("Queue is OVERFLOW! Size=" + this.Queue.length + " and given " + (this.Queue.length + 1));
    }

    int dequeue() {
        this.dequeue_count++;
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

    int getFront() {
        if (this.dequeue_count >= this.Queue.length ) {
            throw new QueueUnderFlowException("No Element at front!");
        } else
            return Queue[front];
    }

    int getRear() {
        if (this.dequeue_count >= this.Queue.length) {
            throw new QueueUnderFlowException("No Elements at rear!");
        } else
            return Queue[rear - 1];
    }

}

