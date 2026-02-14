// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    // Method that throws custom checked exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Age validated successfully");
    }

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            // Runtime Exception (Unchecked)
            int result = a / b;
            System.out.println("Result: " + result);

            // Custom Checked Exception
            validateAge(15);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
            e.printStackTrace();

        } catch (InvalidAgeException e) {
            System.out.println("Custom Error: " + e.getMessage());

        } finally {
            System.out.println("Execution completed. Cleanup done.");
        }

        System.out.println("Program continues safely...");
    }
}
