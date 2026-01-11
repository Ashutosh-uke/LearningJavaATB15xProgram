package exam_11th_Jan_2026_Java_Coding_Test;

import java.util.Scanner;

public class test_even_odd_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check even or odd using modulus operator
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number");
        } else {
            System.out.println(num + " is an Odd number");
        }

        sc.close();
    }
}
