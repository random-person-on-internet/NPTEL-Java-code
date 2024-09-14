public class minHeap {

    int[] Heap;
    int size;
    int maxSize;
    final int FRONT = 1;

    public minHeap(int[] arr, int node) {
        this.maxSize = arr.length;
        this.size = 1;
        Heap = arr;
        Heap[1] = node;
    }

    // to get positions
    int parent(int position) {
        return position / 2;
    }

    int leftChild(int position) {
        return position * 2;
    }

    int rightChild(int position) {
        return position * 2 + 1;
    }

    // swap
    void swap(int position1, int position2) {
        int temp;
        temp = Heap[position1];
        Heap[position1] = Heap[position2];
        Heap[position2] = temp;
    }

    // check if is leaf
    boolean isLeaf(int position) {
        return (position >= size / 2);
    }

    // print
    void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.println(
                    "PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[i * 2] + " RIGHT CHILD : " + Heap[i * 2 + 1]);
        }
    }

    // heapify
    void minHeapify(int position) {
        if (isLeaf(position)) {
            return;
        }
        if ((Heap[position] > Heap[leftChild(position)]) || Heap[position] > Heap[rightChild(position)]) {
            if (Heap[leftChild(position)] > Heap[rightChild(position)]) {
                swap(position, rightChild(position));
                minHeapify(rightChild(position));
            } else {
                swap(position, leftChild(position));
                minHeapify(leftChild(position));
            }
        }
    }

    // insert
    void insert(int element) {
        if (size >= maxSize) {
            return;
        }
        Heap[++size] = element;
        int current = size;

        while (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // remove
    int remove() {
        int removed = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);
        System.out.println("Mimimum number is : " + removed);
        return removed;
    }

    public static void main(String[] args) {
        int[] arr = new int[15];
        minHeap mh = new minHeap(arr, 5);
        mh.insert(3);
        mh.insert(17);
        mh.insert(10);
        mh.insert(84);
        mh.insert(19);
        mh.insert(6);
        mh.insert(22);
        mh.insert(9);
        mh.print();
        mh.remove();
        mh.remove();
        mh.remove();
        mh.remove();
        mh.remove();
        mh.remove();
        mh.remove();
        mh.remove();
        mh.remove();
    }
}
