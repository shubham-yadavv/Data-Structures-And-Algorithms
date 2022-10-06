public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;


    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }


    private int parent(int pos) {
        return (pos - 1) / 2;
    }


    private int leftChild(int pos) {
        return (2 * pos);
    }


    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int a, int b)
    {
        int temp = Heap[a];
        Heap[a] = Heap[b];
        Heap[b] = temp;
    }

    private void maxHeapify(int i)
    {
        if (isLeaf(i)) {
            return;
        }


        if (Heap[i] < Heap[leftChild(i)] || Heap[i] < Heap[rightChild(i)]) {

            if (Heap[leftChild(i)] > Heap[rightChild(i)]) {
                swap(i, leftChild(i));
                maxHeapify(leftChild(i));
            }
            else {
                swap(i, rightChild(i));
                maxHeapify(rightChild(i));
            }
        }
    }

    public void insert(int element)
    {
        Heap[size] = element;

        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }



    public int extractMax()
    {
        int popped = Heap[1];
        Heap[1] = Heap[size--];
        maxHeapify(1);
        return popped;
    }

    public void print() {
        for(int i=0;i<size;i++){
            System.out.print(Heap[i] + " ");
        }
    }


    public static void main(String[] arg) {

        System.out.println("The Max Heap is ");

        MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();

        System.out.println();
        System.out.println("the max value is " + maxHeap.extractMax());


    }
}
