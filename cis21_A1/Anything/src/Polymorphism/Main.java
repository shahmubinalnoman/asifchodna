package Polymorphism;

public class Main {
    static void main() {
        Car car = new Car();
        Bike bike = new Bike();

        car.go();
        bike.go();

        Vehicle[] vehicles = {bike,car};

        for (Vehicle vehicle : vehicles)
        {
            vehicle.go(); 
        }
    }
}
