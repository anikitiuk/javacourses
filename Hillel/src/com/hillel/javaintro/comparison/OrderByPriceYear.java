package com.hillel.javaintro.comparison;

        import java.util.Comparator;

/**
 * Created by Mfarsikov on 29.04.2015.
 */
public class OrderByPriceYear implements Comparator<Vine> {
    @Override
    public int compare(Vine one, Vine other) {
        int result = one.getPrice() - other.getPrice();
        if (result == 0) {
            result = one.getYear() - other.getYear();
        }

        return result;
    }
}