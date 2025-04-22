public class ErrorExample {
    public static void main(String[] args) {
        try {
            allocateLargeArray(); // Might lead to OutOfMemoryError
        } catch (Throwable t) { // Catching Throwable (generally avoid this for Errors)
            System.out.println("Caught a throwable: " + t);
        }
        System.out.println("Program may not reach here.");
    }

    public static void allocateLargeArray() {
        long[] arr = new long[Integer.MAX_VALUE]; }}