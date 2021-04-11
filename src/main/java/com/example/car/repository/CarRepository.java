package com.example.car.repository;

import com.example.car.entity.Car;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends VehicleRepository<Car> {
}
