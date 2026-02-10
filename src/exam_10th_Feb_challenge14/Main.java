package exam_10th_Feb_challenge14;

public class Main {
    public static void main(String[] args) {

        // Sample data
        String[] values = {"10", "0", "abc"};

        try {
            // NumberFormatException (if value is not a number)
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);

            // ArithmeticException (division by zero)
            int result = a / b;
            System.out.println("Result: " + result);

            // ArrayIndexOutOfBoundsException
            System.out.println(values[5]);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        }
    }
}
