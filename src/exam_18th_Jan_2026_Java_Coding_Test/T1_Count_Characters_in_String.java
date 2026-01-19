package exam_18th_Jan_2026_Java_Coding_Test;

public class T1_Count_Characters_in_String {

    public static void main(String[] args) {

        String str = "Java Programming Language";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Total characters (excluding spaces): " + count);
    }
}
