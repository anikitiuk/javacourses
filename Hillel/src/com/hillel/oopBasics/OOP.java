package com.hillel.oopBasics;

/**
 * Created by A.Nikitiuk on 10.04.2015.
 */
public class OOP {

    public static void main(String[] args) {
        oopIntro();
        //negativeAge();
        Cat cat1 = new Cat("Tom", 2);
        Cat cat2 = new Cat("Tom", 2);
        System.out.println("They are equal using ==: " + (cat1 == cat2));
        System.out.println("They are equal using equals(): " + cat1.equals(cat2));
    }

    public static void oopIntro() {
        Cat.pawCount();
        System.out.println(Cat.pawCount());
        Cat cat1 = new Cat("Tom", 2);
        System.out.println("default to string: " + cat1);
        Cat cat2 = new Cat("Murzik", 1);
        Vet vet = new Vet();
        Cat cat3 = null;
        vet.registerCat(cat1);
        vet.registerCat(cat2);
        vet.registerCat(cat3);
        vet.print();
        vet.makeVaccine();
        vet.print();
    }

    public static void negativeAge(){
        Cat cat = new Cat();
        cat.setAge(-1);
        System.out.println("this mesage never be printed");
    }
}
