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
        sb.append(super.toString());
        sb.append("Model: ").append(model).append("\n");
        return sb.toString();
    }

}
