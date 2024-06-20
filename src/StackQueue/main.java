package StackQueue;

public class main {
    public static void main(String[] args) {
//        Stack myNewStack = new Stack(7);

        Queue myNewQueue = new Queue(2);

        myNewQueue.enqueue(1);
        System.out.println(myNewQueue.dequeue().value);
        System.out.println(myNewQueue.dequeue().value);
        System.out.println(myNewQueue.dequeue());

//        myNewQueue.getFirst();
//        myNewQueue.getLast();
//        myNewQueue.getLength();

        myNewQueue.printQueue();



//        myNewStack.push(23);
//        myNewStack.push(3);
//        myNewStack.push(11);
//        myNewStack.pop();
//
//
//        myNewStack.printStack();

//        myNewStack.getTop();
//        myNewStack.getHeight();
//
//        myNewStack.printStack();
    }
}
