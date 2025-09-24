package org.example.dmvinfo.Passenger;

public enum EMakes {
    CHEVROLET ("Chevrolet"),
    FORD ("Ford"),
    TOYOTA ("Toyota"),
    TESLA ("Tesla"),
    HONDA ("Honda");

    private final String displayName;

    EMakes(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
