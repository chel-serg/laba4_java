package com.company;


public class Bus<T extends Person> extends Vehicle<T>
{
    Bus(){
        this.Capacity = 9;
    }
    @Override
    void Err_massage() {
        System.out.println("Bus is full!");
    }
}
