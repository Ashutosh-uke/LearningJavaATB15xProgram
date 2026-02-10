package exam_10th_Feb_challenge6;

public class Vehicle {
    // Method to be overridden
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Car subclass
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine starts with a roar!");
    }
}

// Bike subclass
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike engine starts with a purr!");
    }
}

