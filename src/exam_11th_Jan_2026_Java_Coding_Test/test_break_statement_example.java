package exam_11th_Jan_2026_Java_Coding_Test;

public class test_break_statement_example {
    public static void main(String[] args) {

        int i = 1;

        // do-while loop
        do {
            if (i == 5) {
                break;  // exit loop when i is 5
            }

            System.out.println(i);
            i++;

        } while (i <= 10);
    }
}
