package com.hillel.javaintro.comparison;

/**
 * Created by A.Nikitiuk on 13.05.2015.
 */
public class Vine implements Comparable<Vine> {
    private int year;
    private int price;

    public Vine(int year, int price) {
        this.year = year;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }

        if (!(obj instanceof Vine)) {
            return false;
        }
        Vine other = (Vine) obj;

        return this.year == other.year && this.price == other.price;
    }

    @Override
    public int compareTo(Vine bottle2) {
        int result = this.year - bottle2.year;
        if (result == 0) {
            result = this.price - bottle2.price;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Vine year " + year + " price " + price;
    }

    public int getPrice() {
        return price;
    }

    public String taste() {
        return "nothing special";
    }

    public int getYear() {
        return year;
    }
}