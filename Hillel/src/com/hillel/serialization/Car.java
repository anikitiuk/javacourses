package com.hillel.serialization;

import java.io.Serializable;

/**
 * Created by ANikitiuk on 04.06.2015.
 */
public class Car implements Serializable {
    private static final long serialVersionUID = 3L;

    String manufacturer;

    transient int fuelConsumption;

    CarOwner owner;

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car(String manufacturer, int fuelConsumption, CarOwner owner) {
        this.manufacturer = manufacturer;
        this.fuelConsumption = fuelConsumption;
        this.owner = owner;
        System.out.println("in constructor");
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", fuelConsumpion=" + fuelConsumption +
                ", owner=" + owner +
                '}';
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public CarOwner getOwner() {
        return owner;
    }
}
