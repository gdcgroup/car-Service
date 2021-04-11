package com.example.car.common;

public enum TypeOfFuel {

    BENZIN("Benzyna"),
    BENZIN_LPG("Benzyna + gaz"),
    DIESEL("Diesel"),
    ELECETRIC("Elektryczny"),
    ;

    private final String abbreviation;


    TypeOfFuel(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
