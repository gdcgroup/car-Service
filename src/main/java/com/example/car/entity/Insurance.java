package com.example.car.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "valid_from_date")
    private LocalDate validFromDate;
    @Column(name = "valid_to_date")
    private LocalDate validToDate;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private Car car;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private Lorry lorry;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private Motorbike motorbike;

    public Insurance() {
    }

    public Insurance(String name, LocalDate validFromDate, LocalDate validToDate) {
        this.name = name;
        this.validFromDate = validFromDate;
        this.validToDate = validToDate;
    }
}
