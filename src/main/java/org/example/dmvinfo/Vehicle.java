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
        sb.append("VIN: ").append(vin).append("\n");
        sb.append("Manufacture Year: ").append(manufactureYear).append("\n");
        sb.append("Vehicle Type: ").append(vehicleType).append("\n");
        return sb.toString();
    }


    protected int toString(int tabLevel, StringBuilder sb) {
        String tabs = "\t".repeat(Math.max(0, tabLevel));
        sb.append(tabs)
                .append("Vehicle Information:\n");
        String innerTabs = "\t".repeat(Math.max(0, tabLevel + 1));
        sb.append(innerTabs)
                .append("VIN: ")
                .append(vin)
                .append("\n");
        sb.append(innerTabs)
                .append("Manufacture Year: ")
                .append(manufactureYear)
                .append("\n");
        sb.append(innerTabs)
                .append("Vehicle Type: ")
                .append(vehicleType.getDisplayName())
                .append("\n");
        return tabLevel + 1;
    }
}
