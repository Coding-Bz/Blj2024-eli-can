public class UncheckedExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());  }
catch (NullPointerException e)
            { System.out.println("Error: String is null! " + e.getMessage());
            }
            int[] arr = {1, 2, 3};
            try {
                System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid array index! " + e.getMessage());
            }

            Object obj = "Hello";
            try {
                Integer num = (Integer) obj; // ClassCastException
            } catch (ClassCastException e) {
                System.out.println("Error: Cannot cast String to Integer! " + e.getMessage());
            }
        }
    }
