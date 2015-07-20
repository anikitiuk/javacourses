package com.hillel.java8;

/**
 * Created by ANikitiuk on 20.07.2015.
 */
public class Apple {
    private int weight;
    private String color;

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Apple(int weight, String color) {

        this.weight = weight;
        this.color = color;
    }
}
