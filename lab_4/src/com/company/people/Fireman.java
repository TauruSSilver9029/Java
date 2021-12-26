package com.company.people;

public class Fireman extends Person {
    public Fireman(String name, int countOfDestroyedFires) {
        super(name);
        this.countOfDestroyedFires = countOfDestroyedFires;
    }
    private int countOfDestroyedFires;

    public int getCountOfDestroyedFires() {
        return countOfDestroyedFires;
    }

    public void setCountOfDestroyedFires(int countOfDestroyedFires) {
        this.countOfDestroyedFires = countOfDestroyedFires;
    }
}
