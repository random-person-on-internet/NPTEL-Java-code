// declaring using array
class StackArray<T> {
    T[] data;
    int length;
    int top;

    StackArray(T[] data) {
        this.data = data;
        length = data.length;
        top = -1;
    }

    // method to push
    void push(T data) {
        if (top < length - 1) {
            top++;
            this.data[top] = data;
        } else {
            System.out.println("Stack overflow");
        }
    }

    // method to pop
    T pop() {
        if (top == -1) {
            System.out.println("Stack overflow");
            return null;
        } else {
            T temp = data[top];
            top--;
            return temp;
        }
    }

    // defining isEmpty()
    boolean isEmpty() {
        return top == -1 ? true : false;
    }

    // defining method to print stack
    void printStack() {
        if (top == -1) {
            System.out.println("Stack empty!");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
}

public class stackProgrammingWithArray {
    public static void main(String[] args) {
        Integer arr[] = new Integer[2];
        StackArray<Integer> s = new StackArray<Integer>(arr);

        s.push(5);
        s.printStack();
        s.push(6);
        s.push(7);
        s.printStack();
        s.pop();
        s.printStack();
        s.pop();
        s.printStack();
        s.push(12);

        System.out.println("Is empty? : " + s.isEmpty());
    }
}