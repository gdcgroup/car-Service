package com.example.car.service;

import com.example.car.entity.Car;
import com.example.car.entity.Lorry;

import java.util.List;

public interface LorryService {

    List<Lorry> listLorries();
    Lorry findLorry(long id);
    Lorry addLorry(Lorry lorry);

}
