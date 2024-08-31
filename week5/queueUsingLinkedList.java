import java.util.LinkedList;

class QueueLinkedList<T> {
    LinkedList<T> front, rear;

    QueueLinkedList() {
        front = new LinkedList<T>();
        rear = front;
    }

    // defining enqueue
    void enque(T data) {
        rear.addLast(data);
    }

    // defining dequeue
    T deque() {
        if (front.isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        } else {
            return front.removeFirst();
        }
    }

    // defining isEmpty
    boolean isEmpty() {
        return front.isEmpty() ? true : false;
    }

    // defining print
    void printQueue() {
        if (front.isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            front.forEach(element -> {
                System.out.print(element + " ");
            });
            System.out.println();
        }
    }

    // defining empty
    void empty() {
        front.clear();
    }
}

public class queueUsingLinkedList {
    public static void main(String[] args) {
        QueueLinkedList<Integer> q = new QueueLinkedList<Integer>();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.printQueue();
        q.deque();
        q.printQueue();
        q.empty();
        q.printQueue();
        System.out.println("Empty? : " + q.isEmpty());
    }
}
