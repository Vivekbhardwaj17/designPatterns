package org.example.factory.requirement;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.greeting();
        Car bike = new Car();
        bike.greetingBike();
        // if requirement is car then call -greeting
        // if requirement tis bike then call -greetingBike

        /*Car vehicle = new Car();
        * if(vehicle.requirement.equalsIgnoreCase("CAR")){
        *    vehicle.greeting();
        * }
        * else if(vehicle.requirement.equalsIgnoreCase("BIKE")){
        *    vehicle.greetingBike();
        * }
        *
        * */
    }

}
