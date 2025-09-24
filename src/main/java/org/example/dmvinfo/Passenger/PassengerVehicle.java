package org.example.dmvinfo.Passenger;

import org.example.dmvinfo.Vehicle;
import org.example.dmvinfo.EVehicleTypes;

public abstract class PassengerVehicle extends Vehicle {

    private final EMakes make;

    public PassengerVehicle(
                            String vin,
                            int manufactureYear,
                            EMakes make) {
        super(
                vin,
                manufactureYear,
                EVehicleTypes.PASSENGER);

        this.make = make;
    }


}
