package com.example.car.exception;

public class VehicleNotFoundException extends RuntimeException {

    public VehicleNotFoundException(String exception) {
        super(exception);
    }

}
