package com.company;

public class Taxi<T extends Person> extends Car<T>
{
    Taxi(){
        this.Capacity = 3;
    }
    @Override
    void Err_massage() {
        System.out.println("Taxi is full!");
    }
}
