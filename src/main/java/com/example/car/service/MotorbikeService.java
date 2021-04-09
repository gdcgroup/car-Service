package com.example.car.service;

import com.example.car.entity.Motorbike;

import java.util.List;

public interface MotorbikeService {

    List<Motorbike> listMotorbikes();
    Motorbike findMotorbike(long id);
    Motorbike addMotorbike(Motorbike motorbike);

}
