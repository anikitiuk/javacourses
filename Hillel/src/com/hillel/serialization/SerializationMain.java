package com.hillel.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANikitiuk on 04.06.2015.
 */
public class SerializationMain {
    public static void main(String[] args) {

        CarOwner owner = new CarOwner("Ivan");

        Car bmw = new Car("BMW", 10, owner);

        Car merc = new Car("merc", 12, owner);

        List<Car> cars = new ArrayList<>();
        cars.add(bmw);
        cars.add(merc);

        save(cars);
        System.out.println("car saved");

        bmw = null;

        cars = load();

        bmw = cars.get(0);
        merc = cars.get(1);

        System.out.println("owner is same object" + (bmw.getOwner() == merc.getOwner()));

        System.out.println(bmw);
    }

    private static List<Car> load() {
        List<Car> cars = null;
        try (ObjectInputStream outputStream = new ObjectInputStream(new FileInputStream("hillel/serializedCar.dat"))) {
            cars = (List<Car>) outputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cars;
    }

    private static void save(List<Car> cars) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("hillel/serializedCar.dat"))) {
            outputStream.writeObject(cars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
