package com.hillel.database;

/**
 * Created by ANikitiuk on 29.06.2015.
 */
public class Product {
    private String name;
    private String category;
    private Integer price;

    public Product(String name, String category, Integer price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
