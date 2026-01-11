package exam_11th_Jan_2026_Java_Coding_Test;

import java.util.Scanner;

public class test_positive_or_negative_or_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check using nested ternary operator
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        // Output result
        System.out.println("The number is: " + result);

        sc.close();
    }
}
