package exam_11th_Jan_2026_Java_Coding_Test;

import java.util.Scanner;

public class test_maxoftwo_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Find maximum using ternary operator
        int max = (a > b) ? a : b;

        // Output result
        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}
