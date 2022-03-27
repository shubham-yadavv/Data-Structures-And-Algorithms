import java.util.ArrayList;

class Heap {
    void heapify(ArrayList<Integer> heap, int i) {
        int size = heap.size();
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < size && heap.get(l) > heap.get(largest)) {
            largest = l;
        }
        if (r < size && heap.get(r) > heap.get(largest)) {
            largest = r;
        }

        if (largest != i) {
            int temp = heap.get(largest);
            heap.set(largest, heap.get(i));
            heap.set(i, temp);

            heapify(heap, largest);
        }
    }

    void insert(ArrayList<Integer> heap, int newNum) {
        int size = heap.size();
        if (size == 0) {
            heap.add(newNum);
        } else {
            heap.add(newNum);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(heap, i);
            }
        }
    }

    void deleteNode(ArrayList<Integer> heap, int num)
    {
        int size = heap.size();
        int i;
        for (i = 0; i < size; i++)
        {
            if (num == heap.get(i))
                break;
        }

        int temp = heap.get(i);
        heap.set(i, heap.get(size-1));
        heap.set(size-1, temp);

        heap.remove(size-1);
        for (int j = size / 2 - 1; j >= 0; j--)
        {
            heapify(heap, j);
        }
    }

    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = 0;

        Heap h = new Heap();
        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);

        System.out.println("Max-Heap array: ");
        h.printArray(array, size);

        h.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);
    }
}