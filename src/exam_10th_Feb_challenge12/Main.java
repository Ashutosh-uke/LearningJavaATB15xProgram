package exam_10th_Feb_challenge12;

class Parent {

    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("Child class display method");
    }
}


public class Main {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.display();   // Parent version

        Parent c = new Child(); // Upcasting
        c.display();   // Child version (runtime polymorphism)
    }
}
