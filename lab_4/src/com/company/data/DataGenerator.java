package com.company.data;

import com.company.people.Fireman;
import com.company.people.Person;
import com.company.people.Policeman;
import com.company.roads.Road;
import com.company.vehicles.*;

import java.util.List;

public class DataGenerator {
    private static List<Person> personList = List.of(
            new Person("Karl"),
            new Person("Ivan"));

    private static List<Fireman> firemanList = List.of(
            new Fireman("Vadim", 3),
            new Fireman("Oleg", 7),
            new Fireman("Karl", 12),
            new Fireman("Andry", 1),
            new Fireman("Ivan", 20)
    );

    private static List<Policeman> policemanList = List.of(
            new Policeman("Max", true),
            new Policeman("Dimitry", true),
            new Policeman("Andy", false),
            new Policeman("Oleg", false),
            new Policeman("Ivan", true)
    );

    private static List<FireCar> fireCars = List.of(
            new FireCar(6),
            new FireCar(8)
    );

    private static List<PoliceCar> policeCars = List.of(
            new PoliceCar(4),
            new PoliceCar(8)
    );

    private static List<Vehicle> vehicles = List.of(
            new Taxi(4),
            new Bus(8)
    );

    public static List<Person> generatePersons() {
        return personList;
    }

    public static List<Fireman> generateFiremans() {
        return firemanList;
    }

    public static List<Policeman> generatePolicemans() {
        return policemanList;
    }

    public static List<FireCar> generateFireCars() {
        return fireCars;
    }

    public static List<PoliceCar> generatePoliceCars() {
        return policeCars;
    }

    public static List<Vehicle> generateVehicles() {
        return vehicles;
    }

    public static Road generateRoad() throws Exception {

        policeCars.get(1).boardPerson(policemanList.get(0));
        policeCars.get(0).boardPerson(policemanList.get(1));
        policeCars.get(0).boardPerson(policemanList.get(3));
        policeCars.get(0).boardPerson(policemanList.get(2));

        fireCars.get(0).boardPerson(firemanList.get(0));
        fireCars.get(0).boardPerson(firemanList.get(1));
        fireCars.get(0).boardPerson(firemanList.get(2));
        fireCars.get(1).boardPerson(firemanList.get(3));

        ((Taxi)vehicles.get(0)).boardPerson(personList.get(0));
        ((Bus)vehicles.get(1)).boardPerson(personList.get(1));

        var road = new Road();

        road.addCarToRoad(policeCars.get(0));
        road.addCarToRoad(policeCars.get(1));
        road.addCarToRoad(fireCars.get(1));
        road.addCarToRoad(fireCars.get(0));
        road.addCarToRoad(vehicles.get(1));
        road.addCarToRoad(vehicles.get(0));

        return road;
    }
}
