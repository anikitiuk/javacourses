package com.hillel.Inheritance;

/**
 * Created by A.Nikitiuk on 22.04.2015.
 */
public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public int getArea() {
        return a*b;
    }

    @Override //ctrl + O
    public String toString() {
        return "Rectangle, "+ a +"x" + b + ", " + super.toString();
    }

    @Override
    public String getColor() {
        return "White";
    }
}
