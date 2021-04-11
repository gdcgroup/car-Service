package com.example.car.service;

import com.example.car.entity.Motorbike;
import com.example.car.exception.VehicleNotFoundException;
import com.example.car.repository.MotorbikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorbikeServiceImpl  implements MotorbikeService {

    @Autowired
    private MotorbikeRepository motorbikeRepository;

    @Override
    public List<Motorbike> listMotorbikes() {
        return (List<Motorbike>) motorbikeRepository.findAll();
    }

    @Override
    public Motorbike findMotorbike(long id) {
        return motorbikeRepository.findById(id).orElseThrow(() -> new VehicleNotFoundException("Motorbike not found"));
    }

    @Override
    public Motorbike addMotorbike(Motorbike motorbike) {
        motorbikeRepository.save(motorbike);
        return motorbike;
    }
}
