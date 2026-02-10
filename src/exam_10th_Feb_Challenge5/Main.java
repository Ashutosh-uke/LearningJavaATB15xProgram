package exam_10th_Feb_Challenge5;

public class Main {
    public static void main(String[] args) {

        // Polymorphism: parent reference, child object
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
