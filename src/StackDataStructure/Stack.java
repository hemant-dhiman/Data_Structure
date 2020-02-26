package StackDataStructure;

public class Stack {
    private int[] stack;
    private int size;

    Stack(int size) {
        this.stack = new int[size];
    }

    void push(int value) {
        if (this.size <= stack.length) {
            stack[this.size] = value;
            this.size++;
        }
    }

    int pop() {
        if (size > 0) {
            this.size--;
            return stack[size];
        }else
            return -1;
    }

    int lenght() {
        return this.size + 1;
    }

    int top() {
        if (size - 1 >= 0)
            return stack[size - 1];
        else
            return -1;
    }

}
