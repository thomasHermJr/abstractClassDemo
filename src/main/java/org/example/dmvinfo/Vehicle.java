package org.example.dmvinfo;

public abstract class Vehicle {
    private final String vin;
    private final int manufactureYear;
    private final EVehicleTypes vehicleType;

    public Vehicle(String vin, int manufactureYear, EVehicleTypes vehicleType) {
        this.vin = vin;
        this.manufactureYear = manufactureYear;
        this.vehicleType = vehicleType;
    }

    public String getVin() {
        return vin;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public EVehicleTypes getVehicleType() {
        return vehicleType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle Information:\n");
        sb.append("\tVIN: ").append(vin).append("\n");
        sb.append("\tManufacture Year: ").append(manufactureYear).append("\n");
        sb.append("\tVehicle Type: ").append(vehicleType).append("\n");
        return sb.toString();
    }
}
