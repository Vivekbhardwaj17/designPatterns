package org.example.factory.update;

public class VehicleFactory {
    public Greeting callGreeting(String vehicleType){
      if(vehicleType.equalsIgnoreCase("CAR"))
          return new Car();
      else if(vehicleType.equalsIgnoreCase("BIKE"))
          return new Bike();
      return null;
    }
}
