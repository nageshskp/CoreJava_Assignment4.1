

class Vehicle {
 
    public void drive() {
        System.out.println("In drive method for Driving vehicle ...");
    }
}
 
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("In drive from car extending vehicle for Driving Car ...");
    }
}
 
class Truck extends Vehicle {
    @Override
    public void drive() {
        System.out.println("In drive from truck extending vehicle for Driving truck...");
    }
 
    public void load() {
        System.out.println("In load from truck extending vehicle for Loading truck...");
    }
}
 
public class MethodOverriding {
 
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
 
        Vehicle carVehicle = new Car();
        carVehicle.drive();
 
        Vehicle truckVehicle = new Truck();
        truckVehicle.drive();
        Truck truck = new Truck();
        truck.load();
    }
}
 











