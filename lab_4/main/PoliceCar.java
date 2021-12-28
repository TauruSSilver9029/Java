package main;

import main.Car;

public class PoliceCar extends Car<PoliceMan> {
    public PoliceCar(int numberOfPassangers) {
        super(numberOfPassangers);
    }
}
