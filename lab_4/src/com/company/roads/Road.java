package com.company.roads;

import com.company.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Road {
    private final List<Vehicle> carsInRoad;

    public Road() {
        carsInRoad = new ArrayList<>();
    }

    public int getCountOfHumans() {
        int sum = 0;
        for (var c: carsInRoad) {
            sum+= c.getOccupiedPlacesCount();
        }
        return sum;
    }

    public void addCarToRoad(Vehicle car) throws Exception {
        if(carsInRoad.contains(car))
            throw new Exception("Car is already on the road");
        carsInRoad.add(car);
    }

    public void removeCarFromRoad(Vehicle car) throws Exception {
        if(!carsInRoad.contains(car))
            throw new Exception("Car is not on the road");
        carsInRoad.remove(car);
    }
}
