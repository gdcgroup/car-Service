package com.example.car.entity;

import com.example.car.common.TypeOfFuel;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Lorry extends Vehicle {

    public Lorry(String name, LocalDate productionDate, TypeOfFuel typeOfFuel, String registrationNumber, Insurance insurance, TechnicalReview technicalReview) {
        super(name, productionDate, typeOfFuel, registrationNumber, insurance, technicalReview);
    }

    public Lorry() {

    }
}
