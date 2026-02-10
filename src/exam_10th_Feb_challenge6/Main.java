package exam_10th_Feb_challenge6;

public class Main {
    public static void main(String[] args) {

        // Runtime polymorphism using array of parent type
        Vehicle[] vehicles = { new Car(), new Bike() };

        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}
