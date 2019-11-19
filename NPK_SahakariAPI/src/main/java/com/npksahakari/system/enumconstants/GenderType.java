package com.npksahakari.system.enumconstants;

public enum GenderType {

    MALE("MALE"), FEMALE("FEMALE"), OTHER("OTHER");

    private final String value;

    GenderType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public static GenderType getEnum(String value) {
        if (value == null)
            throw new IllegalArgumentException();
        for (GenderType v : values())
            if (value.equalsIgnoreCase(v.getValue()))
                return v;
        throw new IllegalArgumentException();
    }
}
