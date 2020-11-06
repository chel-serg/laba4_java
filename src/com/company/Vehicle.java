package com.company;

import java.util.ArrayList;

public abstract class Vehicle<T extends Person>
{
    int Capacity = 0;
    int Quantity=0;
    private final ArrayList<T> Passengers = new ArrayList<>();
    public void AddPass(T in)
    {
            if (this.Capacity > this.Quantity) {
                Passengers.add(in);
            } else {
                Err_massage();
            }
    }
    abstract void Err_massage();
    public void RemovePass(String Name)
    {
        boolean ind = false;
        int i;
        for (i=0;i<Passengers.size();i++)
        {
            if (Passengers.get(i).getName().equals(Name))
            {
                Passengers.remove(i);
                ind=true;
                this.Quantity--;
            }
        }
        if (!ind)
            System.out.println("Person not found");
    }
    public int getCapacity(){return this.Capacity;}
    public int getQuantity(){return this.Passengers.size();}
}
