package com.example.car.common;

public enum TypeTechnicalReview {

    PODSTAWOWY_PRZEGLAD("Przegląd podstawowy"),
    ROZSZERZONY_PRZEGLAD("Porzegląd rozszerzony"),
    ;

    private final String abbreviation;


    TypeTechnicalReview(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

}
