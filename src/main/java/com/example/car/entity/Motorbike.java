package com.example.car.entity;

import com.example.car.common.TypeOfFuel;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Motorbike extends Vehicle {

    public Motorbike(String name, LocalDate productionDate, TypeOfFuel typeOfFuel, String registrationNumber, Insurance insurance, TechnicalReview technicalReview) {
        super(name, productionDate, typeOfFuel, registrationNumber, insurance, technicalReview);
    }

    public Motorbike() {

    }
}
