package com.example.car.controller;

import com.example.car.entity.Motorbike;
import com.example.car.exception.VehicleNotFoundException;
import com.example.car.service.MotorbikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class MotorbikeController {

    private MotorbikeService motorbikeService;

    @Autowired
    public void setMotorbikeService(MotorbikeService motorbikeService) {
        this.motorbikeService = motorbikeService;
    }

    @GetMapping("/motorbike/{id}")
    public ResponseEntity<Motorbike> getMotorbike(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<Motorbike>(motorbikeService.findMotorbike(id), HttpStatus.OK);
        } catch (VehicleNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lorry not Found");
        }
    }

    @GetMapping("/motorbikes")
    public ResponseEntity<List<Motorbike>> getAllMotorbikes() {
        List<Motorbike> list = motorbikeService.listMotorbikes();
        return new ResponseEntity<List<Motorbike>>(list, HttpStatus.OK);
    }

    @PostMapping(path = "/motorbikes")
    public void addMotorbike(@RequestBody Motorbike motorbike){
        motorbikeService.addMotorbike(motorbike);
    }


}
