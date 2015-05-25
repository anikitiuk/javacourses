package com.hillel.troubles;

        import java.util.Arrays;
        import java.util.Set;
        import java.util.TreeSet;


public class MainTrouble {
    public static void main(String[] args) {
        Set<Car> dreams = new TreeSet<>();
        Car ivanDream = new Car("BMW");
        Car petroDream = new Car("Audi");
        Car tarasDream = new Car("Merc");

        dreams.add(ivanDream);
        dreams.add(petroDream);
        dreams.add(tarasDream);

        System.out.println(dreams);

        System.out.println("petro dream present " + dreams.contains(petroDream));

        dreams.remove(petroDream);
        petroDream = new Car("Kalina");
        dreams.add(petroDream);


        System.out.println("petro dream present " + dreams.contains(petroDream));
        System.out.println(dreams);

    }

    public static void arrayCopyTrouble() {
        int[] source = {8,5,2,1};
        int[] copy = Arrays.copyOf(source, source.length);

        int[] sorted = sort(source);


        System.out.println("source " + Arrays.toString(source));
        System.out.println("copy " + Arrays.toString(copy));
        System.out.println("sorted " + Arrays.toString(sorted));
    }

    public static int[] sort(int[] array){
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        return sorted;
    }

}