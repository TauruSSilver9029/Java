package main;

import java.util.ArrayList;
import java.util.List;


public abstract class Vehicle<T> {

    public int maximalNumberOfPassangers;
    public int passangerCounter;
    public List<T> passangerList;

    public Vehicle(int numberOfPassangers) {
        this.maximalNumberOfPassangers = numberOfPassangers;
        this.passangerCounter = 0;
        this.passangerList = new ArrayList<T>();
    }

    public void addPassangerToTheVehicle(T p){
        if(getActualAmountOfSeats() > 0){
            passangerList.add(p);
            passangerCounter++;
        }
        else throw new IllegalArgumentException();
    }

    public void getOutPassangerToTheVehicle(T p){
        if(passangerList.remove(p)){
            passangerCounter--;
        }
    }

    public int getMaximalAmountOfSeats(){
        return maximalNumberOfPassangers;
    }

    public int getActualAmountOfSeats(){
        return maximalNumberOfPassangers - passangerCounter;
    }


}
