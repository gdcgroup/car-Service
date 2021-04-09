package com.example.car.repository;

import com.example.car.entity.Lorry;
import org.springframework.stereotype.Repository;

@Repository
public interface LorryRepository extends VehicleRepository<Lorry> {
}
