package com.npksahakari.system.enumconstants;

public enum MaritalType {
    MARRIED("MARRIED"), UNMARRIED("UNMARRIED");

    private final String value;

    MaritalType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public static MaritalType getEnum(String value) {
        if (value == null)
            throw new IllegalArgumentException();
        for (MaritalType v : values())
            if (value.equalsIgnoreCase(v.getValue()))
                return v;
        throw new IllegalArgumentException();
    }

}
