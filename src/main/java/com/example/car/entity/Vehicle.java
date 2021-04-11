package com.example.car.entity;

import com.example.car.common.TypeOfFuel;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    @Column(name = "production_date")
    private LocalDate productionDate;
    @Column(name = "type_of_fuel")
    @Enumerated(EnumType.STRING)
    private TypeOfFuel typeOfFuel;
    @Column(name = "registration_number", unique = true, length = 10)
    private String registrationNumber;
    @OneToOne(cascade = {CascadeType.ALL})
    private Insurance insurance;
    @OneToOne(cascade = {CascadeType.ALL})
    private TechnicalReview technicalReview;


    public Vehicle() {
    }

    public Vehicle(String name, LocalDate productionDate, TypeOfFuel typeOfFuel, String registrationNumber, Insurance insurance, TechnicalReview technicalReview) {
        this.name = name;
        this.productionDate = productionDate;
        this.typeOfFuel = typeOfFuel;
        this.registrationNumber = registrationNumber;
        this.insurance = insurance;
        this.technicalReview = technicalReview;
    }
}
