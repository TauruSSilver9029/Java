package com.company.vehicles;

import com.company.people.Person;

import java.util.ArrayList;
import java.util.List;

public class Taxi extends Car {
    private final List<Person> personList;
    public Taxi(int maxPlacesCount) {
        super(maxPlacesCount);
        personList = new ArrayList<>();
    }

    @Override
    public int getOccupiedPlacesCount() {
        return personList.size();
    }

    public void boardPerson(Person person) throws Exception {
        if(personList.contains(person))
            throw new Exception("Person is already in taxi");
        personList.add(person);
    }

    public void deBoardPerson(Person person) throws Exception {
        if(!personList.contains(person))
            throw new Exception("Person is not in taxi");
        personList.remove(person);
    }
}
