package com.example.car.service;

import com.example.car.entity.Car;
import com.example.car.entity.Vehicle;

import java.util.List;

public interface CarService {

    List<Car> listCars();
    Car findCar(long id);
    Car addCar(Car car);

}
