package com.example.car.service;

import com.example.car.entity.Car;
import com.example.car.exception.VehicleNotFoundException;
import com.example.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> listCars() {
        return (List<Car>) carRepository.findAll();
    }

    @Override
    public Car findCar(long id) {
        return carRepository.findById(id).orElseThrow(() -> new VehicleNotFoundException("Car not found"));
    }

    @Override
    public Car addCar(Car car) {
        carRepository.save(car);
        return car;
    }
}
