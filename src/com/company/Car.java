package com.company;

public abstract class Car<T extends Person> extends Vehicle<T>
{
    Car(){
        this.Capacity = 4;
    }
    @Override
    void Err_massage() {
        System.out.println("Car is full!");
    }
}
