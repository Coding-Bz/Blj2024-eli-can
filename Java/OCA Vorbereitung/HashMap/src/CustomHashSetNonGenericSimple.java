
public class CustomHashSetNonGenericSimple {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public CustomHashSetNonGenericSimple() {
        this(DEFAULT_CAPACITY);
    }

    public CustomHashSetNonGenericSimple(int capacity) {
        this.elements = new Object[capacity];
        this.size = 0;
    }

    public boolean add(Object element) {
// Check if element is already present
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && elements[i].equals(element)) {
                return false; // Element already exists
            }
        }

// Add element if there is space
        if (size < elements.length) {
            elements[size++] = element;
            return true;
        }
        return false; // No more space
    }

    public boolean contains(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && elements[i].equals(element)) {
                elements[i] = null;
// Shift subsequent elements to fill the gap (optional, for a more compact array)
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                if (size > 0) {
                    elements[size - 1] = null; // Clear the last shifted element
                }
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

    public void display() {
        System.out.print("CustomHashSet (Size: " + size + "): [");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CustomHashSetNonGenericSimple mySet = new CustomHashSetNonGenericSimple(5);

        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Apple"); // Duplicate
        mySet.add(123);
        mySet.add(null);

        mySet.display();
        System.out.println("Size of set: " + mySet.size());
        System.out.println("Contains 'Banana'? " + mySet.contains("Banana"));
        System.out.println("Contains null? " + mySet.contains(null));

        mySet.remove("Banana");
        mySet.display();

        System.out.println("Is set empty? " + mySet.isEmpty());
    }}
