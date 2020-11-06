package com.company;

public class FireEngine extends Car<Firefighter> {
    FireEngine(){
        super();
        this.Capacity = 4;
    }
    @Override
    void Err_massage() {
        System.out.println("Fire engine is full!");
    }
}
