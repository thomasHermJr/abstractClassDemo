package org.example.dmvinfo.Passenger.Ford;

public enum EModels {

    F150 ("F-150"),
    MUSTANG ("Mustang"),
    ESCAPE ("Escape"),
    FOCUS ("Focus");

    private final String displayName;

    EModels(String displayName) {
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
