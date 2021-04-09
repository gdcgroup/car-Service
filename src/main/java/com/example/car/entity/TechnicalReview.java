package com.example.car.entity;

import com.example.car.common.TypeTechnicalReview;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class TechnicalReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "type_of_review")
    @Enumerated(EnumType.STRING)
    private TypeTechnicalReview typeTechnicalReview;
    @Column(name = "valid_from_date")
    private LocalDate validFromDate;
    @Column(name = "valid_to_date")
    private LocalDate validToDate;

    public TechnicalReview() {
    }

    public TechnicalReview(TypeTechnicalReview typeTechnicalReview, LocalDate validFromDate, LocalDate validToDate) {
        this.typeTechnicalReview = typeTechnicalReview;
        this.validFromDate = validFromDate;
        this.validToDate = validToDate;
    }
}
