package Training;

public class UserInputValidation {
    public static void validateAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            if (age < 1 || age > 120) {
                throw new InvalidAgeRangeException("Age is outside the valid range (1-120).");
            }
            System.out.println("Age is valid: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid age format. Please enter a valid number. (NumberFormatException occurred)");
        } catch (InvalidAgeRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing with invalid integer input:");
        validateAge("abc");

        System.out.println("\nTesting with age too low:");
        validateAge("0");

        System.out.println("\nTesting with age too high:");
        validateAge("150");

        System.out.println("\nTesting with valid age:");
        validateAge("30");
    }
}