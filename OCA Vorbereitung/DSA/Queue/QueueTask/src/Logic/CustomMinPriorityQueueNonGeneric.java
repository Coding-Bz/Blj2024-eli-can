package Logic;

public class CustomMinPriorityQueueNonGeneric {
    private Object[] heap;
    private int size;
    private int capacity;

    public CustomMinPriorityQueueNonGeneric(int capacity) {
        this.capacity = capacity;
        this.heap = new Object[capacity];
        this.size = 0;
    }

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private void swap(int index1, int index2) {
        Object temp = heap[index1];//heap[4]=2
        heap[index1] = heap[index2];//heap[4]=5
        heap[index2] = temp;//heap[1]=2
    }

    public void enqueue(int element) { // Assuming integer priority
        if (isFull()) {
            System.out.println("Priority Queue is full. Cannot enqueue: " + element);
            return;
        }
//size=4
        heap[size] = element;
//heap[4]=2
        heapifyUp(size);//2,5,index=1
        size++;//+5
    }

    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Priority Queue is empty. Cannot dequeue.");
            return null;
        }
        int min = (Integer) heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = null;
        size--;
        heapifyDown(0);
        return min;
    }

    public Integer peek() {
        return isEmpty() ? null : (Integer) heap[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    private void heapifyUp(int index) {

//index=4
//hasParent=true
//heap[4]=2
        while (hasParent(index) && (Integer) heap[index] < (Integer) heap[getParentIndex(index)]) {
            swap(index, getParentIndex(index));
//swap(4,1)
//return 2,5
            index = getParentIndex(index);///
//2,5 from swap method
//index=1
        }
    }

    private void heapifyDown(int index) {
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && (Integer) heap[getRightChildIndex(index)] < (Integer) heap[smallerChildIndex]) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if ((Integer) heap[index] < (Integer) heap[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    public Object insertionSort (){
        System.out.println("SORTING STARTED");
        for (int i=0; i<heap.length; i++) {
            int check=i;
            for (int j = i+1; j < heap.length; j++) {
                if ((Integer) heap[j] < (Integer) heap[check]) {
                    check=j;
                }
            }
           Object temp=heap[i];
           heap[i] =heap[check];
           heap[check]=temp;
            System.out.println(heap[i]);
        }
        System.out.println("---The first element---");
        System.out.println(heap[0]);
        System.out.println("---The size---");
        System.out.println(heap.length);
     return heap;
    }



    public static void main(String[] args) {
        CustomMinPriorityQueueNonGeneric pq = new CustomMinPriorityQueueNonGeneric(5);

        pq.enqueue(5);
        pq.enqueue(1);
        pq.enqueue(3);
        pq.enqueue(8);
        pq.enqueue(2);
        pq.insertionSort();

        System.out.println("----WITHOUT SORTING----");

        System.out.println("Peek (min priority): " + pq.peek()); // Output: Peek (min priority): 1
        System.out.println("Dequeue (min priority): " + pq.dequeue()); // Output: Dequeue (min priority): 1
        System.out.println("Peek after dequeue: " + pq.peek()); // Output: Peek after dequeue: 2
        System.out.println("Size: " + pq.size()); // Output: Size: 4

        for (int i=0; i<pq.size; i++){

            pq.peek();
        }

        pq.enqueue(0); // Enqueue with higher priority
        System.out.println("Peek after enqueue 0: " + pq.peek()); // Output: Peek after enqueue 0: 0

        System.out.println("Dequeue all elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.dequeue());
        }
// Output:
// Dequeue all elements:
// 0
// 2
// 3
// 5
// 8
    }
}