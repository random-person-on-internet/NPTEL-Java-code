class customLinkedList<T> {
    Node head;

    class Node {
        T data;
        Node next;

        Node() {
            this.data = null;
            this.next = null;
        }

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    customLinkedList() {
        head = new Node();
    }

    // insert at front
    public void insertFront(T data) {
        Node newNode = new Node(data);
        newNode.next = this.head.next;
        head.next = newNode;
    }

    // insert at end
    public void insertEnd(T data) {
        Node newNode = new Node(data);
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    // insert anywhere
    public void insertAnywhere(T data, T key) {
        Node newNode = new Node(data);
        Node tempNode = head;
        while (tempNode.data != key) {
            tempNode = tempNode.next;
        }
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    // delete from front
    public T deleteFront() {
        T removedElement = head.next.data;
        head.next = head.next.next;
        return removedElement;
    }

    // delete from end
    public T deleteEnd() {
        Node tempNode = head;
        while (tempNode.next.next != null) {
            tempNode = tempNode.next;
        }
        T removedElement = tempNode.next.data;
        tempNode.next = null;
        return removedElement;
    }

    // delete from anywhere
    public void deleteAny(T key) {
        Node tempNode = head;
        while (tempNode.next.data != key) {
            tempNode = tempNode.next;
        }
        tempNode.next = tempNode.next.next;
    }

    // print linkedList
    public void printLinkedList() {
        Node currentNode = this.head.next;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // merge two linked lists
    public void merge(customLinkedList<T> list2) {
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = list2.head.next;
    }

    // reversing linked list
    public void reverse() {
        Node current = head.next;
        Node prev = null;
        Node next = current.next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head.next = prev;
    }
}

public class linkedListProgramming {
    public static void main(String[] args) {
        customLinkedList<Integer> obj = new customLinkedList<Integer>();
        obj.insertFront(24);
        obj.insertEnd(34);
        obj.insertFront(19);
        obj.insertAnywhere(10, 24);
        obj.insertEnd(45);
        obj.insertFront(13);
        obj.insertFront(8);
        obj.insertAnywhere(23, 19);
        // obj.printLinkedList();

        customLinkedList<Integer> obj2 = new customLinkedList<Integer>();
        obj2.insertFront(24);
        obj2.insertEnd(34);
        obj2.insertFront(19);
        obj2.insertAnywhere(10, 24);
        obj2.insertEnd(45);
        obj2.insertFront(13);
        obj2.insertFront(8);
        obj2.insertAnywhere(23, 19);
        obj.merge(obj2);
        obj.printLinkedList();

        int a = obj.deleteFront();
        System.out.println(a + " removed");
        // obj.printLinkedList();
        a = obj.deleteEnd();
        System.out.println(a + " removed");
        // obj.printLinkedList();
        obj.deleteAny(24);
        System.out.println("24 removed");
        obj.printLinkedList();

        obj.reverse();
        obj.printLinkedList();
    }
}
