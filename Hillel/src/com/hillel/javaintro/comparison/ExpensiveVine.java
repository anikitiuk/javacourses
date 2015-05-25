package com.hillel.javaintro.comparison;


public class ExpensiveVine extends Vine {
    public ExpensiveVine(int year, int price) {
        super(year, price);
    }

    @Override
    public String taste() {
        return "Bellissimo!";
    }
}