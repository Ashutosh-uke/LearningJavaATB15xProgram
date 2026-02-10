package exam_10th_Feb_challenge2;

public class Student {
    String name;
    int rollNo;
    String section;

    // Constructor
    Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Method to display student details
    void display() {
        System.out.println(
                "Student: " + name +
                        ", Roll No: " + rollNo +
                        ", Section: " + section
        );
    }
}

