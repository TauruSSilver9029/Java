package com.company.vehicles;

import com.company.people.Policeman;

import java.util.ArrayList;
import java.util.List;

public class PoliceCar extends Car{
    private final List<Policeman> policemanList;

    public PoliceCar(int maxPlacesCount) {
        super(maxPlacesCount);
        policemanList = new ArrayList<>();
    }

    @Override
    public int getOccupiedPlacesCount() {
        return policemanList.size();
    }

    public void boardPerson(Policeman policeman) throws Exception {
        if(policemanList.contains(policeman))
            throw new Exception("Policeman is already police car");
        policemanList.add(policeman);
    }

    public void deBoardPerson(Policeman policeman) throws Exception {
        if(!policemanList.contains(policeman))
            throw new Exception("Policeman is not in a police car");
        policemanList.remove(policeman);
    }
}
