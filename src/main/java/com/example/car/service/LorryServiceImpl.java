package com.example.car.service;

import com.example.car.entity.Lorry;
import com.example.car.exception.VehicleNotFoundException;
import com.example.car.repository.LorryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LorryServiceImpl implements LorryService {

    @Autowired
    private LorryRepository lorryRepository;

    @Override
    public List<Lorry> listLorries() {
        return (List<Lorry>) lorryRepository.findAll();
    }

    @Override
    public Lorry findLorry(long id) {
        return lorryRepository.findById(id).orElseThrow(() -> new VehicleNotFoundException("Lorry not Found"));
    }

    @Override
    public Lorry addLorry(Lorry lorry) {
        lorryRepository.save(lorry);
        return lorry;
    }
}
