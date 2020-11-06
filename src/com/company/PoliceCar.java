package com.company;

public class PoliceCar extends Car<Policeman>
{
    PoliceCar(){
        super();
        this.Capacity = 3;
    }
    @Override
    void Err_massage() {
        System.out.println("Police car is full!");
    }
}
