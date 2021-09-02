package com.company;

public class Car {
    private String carNumber;
    private String carColor;

    public Car(String carNumber, String carColor) {
        this.carNumber = carNumber;
        this.carColor = carColor;
    }

    public String getCarNumber(){
        return this.carNumber;
    }

    public String getCarColor(){
        return this.carColor;
    }
}
