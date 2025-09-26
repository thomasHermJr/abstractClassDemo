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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Make: ").append(make).append("\n");
        return sb.toString();
    }

}
