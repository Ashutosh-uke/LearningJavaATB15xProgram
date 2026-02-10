package exam_10th_Feb_challenge15;

// Custom Exception class
class InvalidAgeException extends Exception {

    public InvalidAgeException(int age) {
        super("Age must be 18 or above. Provided age: " + age);
    }
}

public class Main {

    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {

        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }

        try {
            validateAge(25);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }
}
