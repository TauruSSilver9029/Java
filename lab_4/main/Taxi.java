package main;

import main.Car;
import main.Person;

public class Taxi extends Car<Person> {
    public Taxi(int numberOfPassangers) {
        super(numberOfPassangers);
    }
}
