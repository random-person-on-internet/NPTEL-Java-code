import java.util.LinkedList;

class StackLinkedList<T> {
    LinkedList<T> top;

    StackLinkedList() {
        top = new LinkedList<T>();
    }

    // defining push method
    void push(T data) {
        top.addFirst(data);
    }

    // defining pop method
    T pop() {
        if (top.isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            return top.removeFirst();
        }
    }

    // defining isEmpty method
    boolean isEmpty() {
        return !top.isEmpty() ? true : false;
    }

    // defining method to print stack
    void printStack() {
        if (top.isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println(top);
        }
    }
}

public class stackProgrammingWithLinkedList {
    public static void main(String[] args) {
        StackLinkedList<Integer> s = new StackLinkedList<Integer>();

        s.push(4);
        s.push(6);
        s.printStack();
        s.pop();
        s.push(10);
        s.printStack();

        System.out.println("Empty? : " + s.isEmpty());
    }
}