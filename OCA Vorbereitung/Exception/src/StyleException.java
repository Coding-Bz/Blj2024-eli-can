public static void main(String[] args) {
    int numerator = 10;
    int denominator = 0;

    try {
        int result = numerator / denominator; // This will throw ArithmeticException
        System.out.println("Result: " + result); // This line won't be reached if exception occurs
    } catch (ArithmeticException e) {
        System.out.println("Error: Cannot divide by zero!");
        System.out.println("Exception details: " + e.getMessage());
    } finally {
        System.out.println("This block always executes.");
    }

    System.out.println("Program continues after the try-catch-finally block.");
}
