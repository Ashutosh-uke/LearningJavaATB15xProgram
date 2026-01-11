package exam_11th_Jan_2026_Java_Coding_Test;

import java.util.Scanner;

public class test_arithmetic_operation_two_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Arithmetic operations
        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainder = a % b;

        // Output results
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Remainder = " + remainder);

        sc.close();
    }
}
