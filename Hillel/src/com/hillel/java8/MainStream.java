package com.hillel.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by ANikitiuk on 23.07.2015.
 */
public class MainStream {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(100, "Green"));
        apples.add(new Apple(150, "Yellow"));
        apples.add(new Apple(130, "Green"));
        apples.add(new Apple(150, "Red"));

        Function<Apple, String> appleToString = apple -> apple.getColor();

        List<String> appleColors = apples.parallelStream()
                .filter(apple -> apple.getWeight() > 120)
                .limit(2)
                .map(Apple::getColor) //.map(appleToString)
                .sorted()
                .collect(Collectors.toList());

        Optional<String> maxColor = apples.parallelStream()
                .filter(apple -> apple.getWeight() > 120)
                .limit(2)
                .map(Apple::getColor) //.map(appleToString)
                .sorted()
                .max(Comparator.naturalOrder());



        System.out.println(maxColor.orElse("none"));
    }
}
