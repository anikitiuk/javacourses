package com.hillel.java8;

import com.hillel.advancedOOP.factory.IngredientCreator;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by ANikitiuk on 20.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(100, "Green"));
        apples.add(new Apple(150, "Yellow"));
        apples.add(new Apple(130, "Green"));
        apples.add(new Apple(150, "Red"));

        Comparator<Apple> appleComparator = Main::compareApplesByWeight;

        appleComparator = (o1, o2) -> Integer.compare(o1.getWeight(), o2.getWeight());

        apples.sort(appleComparator);

        System.out.println(apples);
    }

    public static int compareApplesByWeight(Apple o1, Apple o2){
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }

    private static void filterNumbersExample() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);

        Predicate<Integer> evenFilter = i -> i % 2 == 0;
        List<Integer> evenNumber = filterApples(integers, evenFilter);

        System.out.println(evenNumber);
    }

    private static void appleExample() {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(100, "Green"));
        apples.add(new Apple(150, "Yellow"));
        apples.add(new Apple(130, "Green"));
        apples.add(new Apple(150, "Red"));

        List<Apple> greenApples = filterApples(apples, new ColorFilter());

        Predicate<Apple> weightFilter = new Predicate<Apple>() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 120;
            }
        };

        List<Apple> heavyApples = filterApples(apples, weightFilter);

        //heavyApples = filterApples(apples, (Apple a) -> a.getWeight() > 120);
        heavyApples = filterApples(apples, a -> a.getWeight() > 120);
        greenApples = filterApples(apples, a -> "Green".equals(a.getColor()));

        List<Apple> heavyAndGreen = filterApples(apples, Main::isHeavyAndGreen);
        //Collections.shuffle(apples);

        System.out.println(heavyApples);
        System.out.println(greenApples);
    }

    public static boolean isHeavyAndGreen(Apple apple){
        return apple.getWeight()>120 && "Green".equals(apple.getColor());
    }

    private static <T> List<T> filterApples(List<T> apples, Predicate<T> predicate) {
        List<T> apples1;
        apples1 = new ArrayList<>();
        for (T apple : apples) {
            if (predicate.test(apple)) {
                apples1.add(apple);
            }
        }
        return apples1;
    }

    private static List<Apple> filterHeavyApples(List<Apple> apples) {
        List<Apple> heavyApples;
        heavyApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (120 < apple.getWeight()) {
                heavyApples.add(apple);
            }
        }
        return heavyApples;
    }


    private static void java8StyleSort(List<Apple> apples) {
        apples.sort(Comparator.comparingInt(Apple::getWeight));
    }

    private static void oldStyleSort(List<Apple> apples) {
        Comparator<Apple> comparator = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Integer.compare(o1.getWeight(), o2.getWeight());
            }
        };
        Collections.sort(apples, comparator);
    }
}
