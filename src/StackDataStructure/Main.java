package StackDataStructure;

class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for (int i = 0; i <= stack.lenght(); i++) {
            System.out.println(stack.pop());
        }
        System.out.println("stack top: " + stack.top());
    }
}
