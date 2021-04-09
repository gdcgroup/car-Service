package com.example.car.repository;

import com.example.car.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface VehicleRepository<T extends Vehicle> extends CrudRepository<T, Long> {
}
