package exam_11th_Jan_2026_Java_Coding_Test;

public class test_print_everNumbers {
    public static void main(String[] args) {

        int i = 2;  // first even number

        // do-while loop
        do {
            System.out.println(i);
            i += 2;   // move to next even number
        } while (i <= 50);
    }
}
