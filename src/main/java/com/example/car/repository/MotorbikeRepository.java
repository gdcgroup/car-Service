package com.example.car.repository;

import com.example.car.entity.Motorbike;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorbikeRepository extends VehicleRepository<Motorbike> {
}
