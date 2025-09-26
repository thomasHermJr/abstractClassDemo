package org.example.dmvinfo;

public enum EVehicleTypes {
    PASSENGER("Passenger"),
    MOTORCYCLE("Motorcycle"),
    BOAT("Boat"),
    TRAILER("Trailer");

    private final String displayName;

    EVehicleTypes(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }


    public String toString(int tabLevel) {
        String tabs = "\t".repeat(Math.max(0, tabLevel));
        StringBuilder sb = new StringBuilder();
        sb.append(tabs)
                .append("Vehicle Type: ")
                .append(displayName)
                .append("\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return toString(0);
    }

}
