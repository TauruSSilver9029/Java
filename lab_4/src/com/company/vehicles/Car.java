package com.company.vehicles;

public abstract class Car implements Vehicle {
    @Override
    public int getMaxPlacesCount() {
        return maxPlacesCount;
    }

    public Car(int maxPlacesCount) {
        this.maxPlacesCount = maxPlacesCount;
    }

    protected final int maxPlacesCount;
}
