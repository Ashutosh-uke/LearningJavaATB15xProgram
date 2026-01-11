package exam_11th_Jan_2026_Java_Coding_Test;

public class test_continue_statement_example {
    public static void main(String[] args) {

        int i = 1;

        // do-while loop
        do {
            if (i == 5) {
                i++;           // increment before continue
                continue;      // skip the rest of the loop for i = 5
            }

            System.out.println(i);
            i++;

        } while (i <= 10);
    }
}
