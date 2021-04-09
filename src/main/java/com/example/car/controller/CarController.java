package com.example.car.controller;

import com.example.car.entity.Car;
import com.example.car.exception.VehicleNotFoundException;
import com.example.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("")
public class CarController {

    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) { this.carService = carService; }

    @GetMapping("/car/{id}")
    public  ResponseEntity<Car> getCar(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<Car>(carService.findCar(id), HttpStatus.OK);
        } catch (VehicleNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Car Not Found");
        }
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllApplications() {
        List<Car> list = carService.listCars();
        return new ResponseEntity<List<Car>>(list, HttpStatus.OK);
    }

    @PostMapping(path = "/cars")
    public void addCar(@RequestBody Car car){
        carService.addCar(car);
    }

}
