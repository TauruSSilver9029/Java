package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.*;

public class MainRoadAndVehiclesTests{

    PoliceMan policeMan1;
    FireFighter FireFighter1;
    FireFighter FireFighter2;
    FireFighter FireFighter3;

    Vehicle<PoliceMan> policeCar;
    Vehicle<Person> bus;
    Vehicle<FireFighter> fireDepCar;
    Vehicle<Person> Taxi;

    Road road;

    @Before
    public void SetUp(){
        policeMan1 = new PoliceMan();
        FireFighter1 = new FireFighter();
        FireFighter2 = new FireFighter();
        FireFighter3 = new FireFighter();

        policeCar = new PoliceCar(1);
        bus = new Bus(3);
        fireDepCar = new FireDepCar(2);
        Taxi = new Taxi(2);

        road = new Road();
    }

    @Test(expected = IllegalArgumentException.class)
    public void addingMorePeopleThanCapacityToTheTaxi(){
        Taxi.addPassangerToTheVehicle(policeMan1);
        Taxi.addPassangerToTheVehicle(FireFighter1);
        Taxi.addPassangerToTheVehicle(FireFighter2);
    }

    @Test
    public void CheckIfCapacityCounterWorking(){
        Taxi.addPassangerToTheVehicle(policeMan1);
        Assert.assertEquals(Taxi.getActualAmountOfSeats(), 1);
    }

    @Test
    public void getOutPassangerListCheck(){
        fireDepCar.addPassangerToTheVehicle(FireFighter2);
        fireDepCar.getOutPassangerToTheVehicle(FireFighter2);
        assert(!fireDepCar.passangerList.contains(FireFighter2));
    }

    @Test
    public void getOutPassangerCounterCheck(){
        fireDepCar.addPassangerToTheVehicle(FireFighter2);
        fireDepCar.getOutPassangerToTheVehicle(FireFighter2);
        Assert.assertEquals(fireDepCar.passangerCounter, 0);
    }

    @Test
    public void getMaxAmountOfSeatsCheck(){
        Assert.assertEquals(bus.getMaximalAmountOfSeats(), 3);
    }

    @Test
    public void RoadHumanCounterCheck(){
        fireDepCar.addPassangerToTheVehicle(FireFighter1);
        fireDepCar.addPassangerToTheVehicle(FireFighter2);
        road.addCarToRoad(fireDepCar);
        Assert.assertEquals(road.getCountOfHumans(),2);
    }

    @Test
    public void RoadHumanCounterCheckIfThereAre0Human(){
        Assert.assertEquals(road.getCountOfHumans(),0);
    }

    @Test
    public void AddCarToRoadCheck(){
        fireDepCar.addPassangerToTheVehicle(FireFighter1);
        fireDepCar.addPassangerToTheVehicle(FireFighter2);
        road.addCarToRoad(fireDepCar);
        assert(road.carsInRoad.contains(fireDepCar));
    }


}
