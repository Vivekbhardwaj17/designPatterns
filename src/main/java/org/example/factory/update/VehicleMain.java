package org.example.factory.update;

public class VehicleMain {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicleFactory.callGreeting("CAR").greeting();
        vehicleFactory.callGreeting("BIKE").greeting();
    }

}
