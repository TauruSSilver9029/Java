package com.company.vehicles;
import com.company.people.Fireman;

import java.util.ArrayList;
import java.util.List;

public class FireCar extends Car{
    private final List<Fireman> firemanList;

    public FireCar(int maxPlacesCount) {
        super(maxPlacesCount);
        firemanList = new ArrayList<>();
    }

    @Override
    public int getOccupiedPlacesCount() {
        return firemanList.size();
    }

    public void boardPerson(Fireman fireman) {
        firemanList.add(fireman);
    }

    public void deBoardPerson(Fireman fireman) {
        firemanList.remove(fireman);
    }
}
