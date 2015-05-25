package com.hillel.javaintro.comparison;

public class CheapVine extends Vine {
    public CheapVine(int year, int price) {
        super(year, price);
    }

    @Override
    public String taste() {
        return "Sour";
    }
}