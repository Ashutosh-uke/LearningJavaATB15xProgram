package exam_18th_Jan_2026_Java_Coding_Test;

public class T4_Reverse_String {
    public static void main(String[] args) {

        String str = "Java Programming";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string: " + reverse);
    }
}
