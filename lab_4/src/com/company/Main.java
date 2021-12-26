package com.company;

import com.company.data.DataGenerator;
import com.company.vehicles.FireCar;
import com.company.vehicles.Taxi;
import com.company.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        test();
    }

    public static void test() throws Exception {
        var road = DataGenerator.generateRoad();
        var people = DataGenerator.generatePersons();
        var taxi = (Taxi) DataGenerator.generateVehicles().get(0);
        System.out.println("Trying to add existing person in a taxi: ");
        try {
            taxi.boardPerson(people.get(0));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Trying to add existing car on a road: ");
        try {
            road.addCarToRoad(taxi);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("All persons on the road count: " + road.getCountOfHumans());
    }
}
