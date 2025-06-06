import java.util.Comparator;

public class CustomSortedSetNonGenericSimple {
    private final int capacity;
    private Object[] elements;
    private int size;
    private final Comparator comparator;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomSortedSetNonGenericSimple() {
        this(DEFAULT_CAPACITY, null);
    }

    public CustomSortedSetNonGenericSimple(Comparator comparator) {
        this(DEFAULT_CAPACITY, comparator);
    }

    public CustomSortedSetNonGenericSimple(int capacity, Comparator comparator) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
        this.comparator = comparator;
    }

    public boolean add(Object element) {
        if (element == null) {
            throw new NullPointerException("Null elements are not allowed.");
        }
        if (isFull()) {
            System.out.println("Sorted Set is full. Cannot add: " + element);
            return false;
        }
        if (contains(element)) {
            return false;
        }

        int insertIndex = 0;
        if (isEmpty()) {
            elements[insertIndex] = element;//charlie
        } else {
            for (int i = 0; i < size; i++) {
                int comparisonResult = compare(element, elements[i]);//(alice,charlie)
                if (comparisonResult < 0) {
                    insertIndex = i;
                    break;
                } else {
                    insertIndex = i + 1;
                }
            }
            for (int i = size; i > insertIndex; i--) {
                elements[i] = elements[i - 1];
            }
            elements[insertIndex] = element;
        }
        size++;
        return true;
    }

    public boolean contains(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && compare(element, elements[i]) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && compare(element, elements[i]) == 0) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                elements[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object first() {
        return isEmpty() ? null : elements[0];
    }

    public Object last() {
        return isEmpty() ? null : elements[size - 1];
    }

    public void display() {
        System.out.print("CustomSortedSet (Size: " + size + "): [");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private int compare(Object o1, Object o2) {//alice ,charlie
        if (comparator != null) {
            return comparator.compare(o1, o2);
        } else {
            Comparable<Object> c1 = (Comparable<Object>) o1;
            return c1.compareTo(o2);
        }
    }

    private boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CustomSortedSetNonGenericSimple mySet = new CustomSortedSetNonGenericSimple();
        mySet.add("Charlie");
        mySet.add("Alice");
        mySet.add("Bob");
        mySet.add("Alice"); // Duplicate
        mySet.add("David");
        mySet.display(); // Output: [Alice, Bob, Charlie, David]

        CustomSortedSetNonGenericSimple numSet = new CustomSortedSetNonGenericSimple(Comparator.reverseOrder());
        numSet.add(5);
        numSet.add(1);
        numSet.add(3);
        numSet.add(1); // Duplicate
        numSet.add(8);
        numSet.display(); // Output: [8, 5, 3, 1]
    }
}