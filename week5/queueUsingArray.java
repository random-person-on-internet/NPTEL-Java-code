class QueueArray<T> {
    T[] data;
    int front, rear;
    int length;

    QueueArray(T[] data) {
        this.data = data;
        front = 0;
        rear = -1;
        length = data.length;
    }

    // defining enqueue()
    void enque(T data) {
        if (rear >= length - 1) {
            System.out.println("Queue Overflow");
        } else {
            rear++;
            this.data[rear] = data;
        }
    }

    // defining dequeue()
    T deque() {
        if (rear < front) {
            // empty
            System.out.println("Queue Underflow");
            return null;
        } else {
            front++;
            return data[front - 1];
        }
    }

    // defining isEmpty()
    boolean isEmpty() {
        return front > rear ? true : false;
    }

    // defining printQueue()
    void printQueue() {
        if (front > rear) {
            System.out.println("Queue empty!");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
}

public class queueUsingArray {
    public static void main(String[] args) {
        Integer arr[] = new Integer[2];
        QueueArray<Integer> q = new QueueArray<Integer>(arr);
        q.enque(1);
        q.enque(2);
        q.printQueue();
        q.enque(3);
        q.deque();
        q.enque(5);
        q.printQueue();
    }
}