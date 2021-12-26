package com.company.people;

public class Policeman extends Person{
    public Policeman(String name, boolean hasPistol) {
        super(name);
        this.hasPistol = hasPistol;
    }
    boolean hasPistol;

    public boolean isHasPistol() {
        return hasPistol;
    }

    public void setHasPistol(boolean hasPistol) {
        this.hasPistol = hasPistol;
    }
}
