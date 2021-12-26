package com.company.vehicles;

import com.company.people.Person;

import java.util.ArrayList;
import java.util.List;

public class Bus implements Vehicle {
    private final List<Person> personList;
    private final int maxPlacesCount;

    public Bus(int maxPlacesCount) {
        this.maxPlacesCount = maxPlacesCount;
        personList = new ArrayList<>();
    }

    @Override
    public int getMaxPlacesCount() {
        return maxPlacesCount;
    }

    @Override
    public int getOccupiedPlacesCount() {
        return personList.size();
    }

    public void boardPerson(Person person) throws Exception {
        if(personList.contains(person))
            throw new Exception("Person is already in bus");
        personList.add(person);
    }

    public void deBoardPerson(Person person) throws Exception {
        if(!personList.contains(person))
            throw new Exception("Person is not in bus");
        personList.remove(person);
    }
}
