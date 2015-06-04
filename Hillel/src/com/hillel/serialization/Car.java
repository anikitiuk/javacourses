package com.hillel.serialization;

import java.io.Serializable;

/**
 * Created by ANikitiuk on 04.06.2015.
 */
public class Car implements Serializable{
    private static final long serialVersionUID = 1L;

    String manufacturer;

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
