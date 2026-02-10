package exam_10th_Feb_2026_Java_Coding_Test;

public class person {
    String name;
    int age;

    // Constructor
    person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

