package com.example.car.controller;

import com.example.car.entity.Lorry;
import com.example.car.exception.VehicleNotFoundException;
import com.example.car.service.LorryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class LorryController {

    private LorryService lorryService;

    public LorryController(LorryService lorryService) {
        this.lorryService = lorryService;
    }

    @GetMapping("/lorry/{id}")
    public ResponseEntity<Lorry> getLorry(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<Lorry>(lorryService.findLorry(id), HttpStatus.OK);
        } catch (VehicleNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lorry not Found");
        }
    }

    @GetMapping("/lorries")
    public ResponseEntity<List<Lorry>> getAllLorries() {
        List<Lorry> list = lorryService.listLorries();
        return new ResponseEntity<List<Lorry>>(list, HttpStatus.OK);
    }

    @PostMapping(path = "/lorries")
    public void addLorry(@RequestBody Lorry lorry){
        lorryService.addLorry(lorry);
    }

}
