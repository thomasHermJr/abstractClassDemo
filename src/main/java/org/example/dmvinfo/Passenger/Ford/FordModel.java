package org.example.dmvinfo.Passenger.Ford;

import org.example.dmvinfo.Passenger.EMakes;
import org.example.dmvinfo.Passenger.PassengerVehicle;

public class FordModel extends PassengerVehicle {

    private final EModels model;

    public FordModel(
            String vin,
            int manufactureYear,
            EModels model
    ) {
        super(
                vin,
                manufactureYear,
                EMakes.FORD
        );
        this.model = model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString(0, sb));
        return sb.toString();
    }

    @Override
    protected int toString(int tabLevel, StringBuilder sb) {
        int newTabLevel = super.toString(tabLevel, sb);
        String tabs = "\t".repeat(Math.max(0, newTabLevel));
        sb.append(tabs)
                .append("Model: ")
                .append(model)
                .append("\n");
        return newTabLevel;
    }

}
