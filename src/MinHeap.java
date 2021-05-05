public class MinHeap {

    int[] Heap;
    int size;
    int maxSize;

    static final int FRONT = 1;

    public MinHeap(int maxSize)
    {
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize+1];
    }

    private int parent(int position)
    {
        return position/2;
    }

    private boolean isLeaf(int position)
    {
        if (position > (size/2) && position<=size)
        {
            return true;
        }
        return false;
    }

    private void swap (int fpos, int spos)
    {
        int temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }

    public void insert (int element)
    {
        if (size>=maxSize)
            return;

        Heap[++size] = element;
        int current = size;

        while (Heap[current] < Heap[parent(current)])
        {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private int leftChild (int position)
    {
        return (2*position);
    }

    private int rightChild (int position)
    {
        return (2*position) + 1;
    }

    private void minHeapify(int position)
    {
        if (!isLeaf(position))
        {
            if (Heap[position] > Heap[leftChild(position)] || Heap[position] > Heap[rightChild(position)])
            {

            }
        }
    }

    public void print()
    {
        for (int i = 1; i <= size/2; i++)
        {
            System.out.println("Parent: " +Heap[i]
                                + "\nLeft Child: " +Heap[2*i]
                                + "\nRight Child: " +Heap[2*i+1]);

            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Min Heap is:");
        MinHeap minheap = new MinHeap(15);
        minheap.insert(4);
        minheap.insert(2);
        minheap.insert(9);
        minheap.insert(1);
        minheap.insert(6);
        minheap.insert(7);
        minheap.insert(3);
        minheap.insert(8);
        minheap.insert(5);
        minheap.print();

        System.out.println(minheap.isLeaf(4));
    }
}
