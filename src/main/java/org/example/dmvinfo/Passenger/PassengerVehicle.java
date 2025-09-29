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

    @Override
    protected int toString(int tabLevel, StringBuilder sb) {
        int newTabLevel = super.toString(tabLevel, sb);
        String tabs = "\t".repeat(Math.max(0, newTabLevel));
        sb.append(tabs)
                .append("Make: ")
                .append(make)
                .append("\n");
        return newTabLevel+1;
    }

}
