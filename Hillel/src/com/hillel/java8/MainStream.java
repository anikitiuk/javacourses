package com.hillel.java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream examples
 * Created by ANikitiuk on 23.07.2015.
 *
 */
public class MainStream {//ctrl+q
//Хорстман + тдд + рефакторинг + начальные книги + философия джава + алгоритмы(НЕ Кнут) Сэджвик + НЕ(!) Шилдт + изучать фреймворки(например Хибернэйт, Спринг) + GWT(k) + коллекции(это важно) + многопоточности(concurency in practice)
//
    /**
     * this is main method
     * @param args command line arguments
     */
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
                .filter(apple -> apple.getWeight() > 120) //здесь лямбда реализует интерфейс предикат(принимает объект, возвращает булеан)
                .limit(2)
                .map(Apple::getColor) //.map(appleToString)
                .sorted()
                .max(Comparator.naturalOrder());

  /*      Random random = new Random();
        int result = Stream.generate(random::nextInt)
                .limit(10)
                .mapToInt(value -> value)
                .min()
                .orElse(0);
        System.out.println(result);

        System.out.println(maxColor.orElse("none"));*/

        System.out.println( "contains all green apples " +
                        apples.stream()
                                .allMatch(apple -> apple.getColor().equals("Green"))
        );

        System.out.println("contains at least one green apple " +
                        apples.stream()
                                .anyMatch(apple -> apple.getColor().equals("Green"))
        );

        Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");
        Predicate<Apple> isYellow = apple -> apple.getColor().equals("Yellow");
        Predicate<Apple> isYellowOrGreen = isGreen.or(isYellow);
        System.out.println( "contains only green or yellow apples " +
                        apples.stream()
                                .allMatch(isYellowOrGreen)
        );

        apples.stream().forEach(System.out::println);
    }

    /**
     *
     * @param val input value
     * @return always false
     */
    public static boolean someMethod(int val){

        /*Class classObject =  Object.class.getClassLoader().loadClass("");
        Apple apple = (Apple) classObject.newInstance();
        apple.getClass().getMethods()*/
        return false;
    }

}
