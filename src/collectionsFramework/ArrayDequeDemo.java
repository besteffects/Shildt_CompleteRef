package collectionsFramework;

import java.util.ArrayDeque;

class ArrayDequeDemo {
    // It creates a dynamic array and has no capacity restrictions

    public static void main(String[] args) {
        //Create an array deque.
        ArrayDeque<String> adq = new ArrayDeque<String>();

        //Use an ArrayDeque like a stack.
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Popping the stack: ");
        while (adq.peek()!=null){
            System.out.print(adq.pop() + " "); //Returns elements from the head of the queue
        }
        System.out.println();

    }
}
