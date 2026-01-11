package exam_11th_Jan_2026_Java_Coding_Test;

import java.util.Scanner;

public class test_reverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;
        int original = num;

        // do-while loop to reverse the number
        do {
            int digit = num % 10;          // get last digit
            reverse = reverse * 10 + digit;
            num = num / 10;                // remove last digit
        } while (num != 0);

        // Output result
        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}
