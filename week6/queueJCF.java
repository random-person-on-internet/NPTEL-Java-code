import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book> {
    int bookId;
    String name;
    String author;
    int quantity;

    public Book(int bookId, String name, String author, int quantity) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int compareTo(Book b) {
        if (bookId > b.bookId) {
            return 1;
        } else if (bookId < b.bookId) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class queueJCF {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.remove("two");
        System.out.println(queue + "\nSize of queue is : " + queue.size());
        queue.clear();

        Queue<Integer> queue2 = new LinkedList<Integer>();
        queue2.add(1);
        queue2.add(2);
        queue2.add(3);
        queue2.add(4);
        queue2.remove(2);
        System.out.println(queue2);

        Queue<Book> queue3 = new PriorityQueue<Book>();
        Book b1 = new Book(111, "Origin", "Dan Brown", 2000);
        Book b2 = new Book(222, "The White Fang", "Jack London", 1000);
        Book b3 = new Book(333, "Stay out of the basement", "RL Stine", 4000);

        queue3.add(b2);
        queue3.add(b3);
        queue3.add(b1);
        for (Book b : queue3) {
            System.out.println(b.bookId + " " + b.name + " " + b.author);
        }
    }
}