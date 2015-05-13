package com.hillel.javaintro;

/**
 * Created by A.Nikitiuk on 13.05.2015.
 */
public class Boxing {
    public static void main(String[] args) {
        int i = 10;
        method(i);

        double d = 2.5;
        method(d);

        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println(i1 + " == " + i2 + " are equal "+ (i1 == i2));

        i1 = 128;
        i2 = 128;
        System.out.println(i1 + " == " + i2 + " are equal "+ (i1 == i2));

        i1 = new Integer(127);
        i2 = new Integer(127);
        System.out.println(i1 + " == " + i2 + " are equal "+ (i1 == i2));

        System.out.println(i1 + " == " + i2 + " are equal using equals "+ (i1.equals(i2)));
    }

    public static void method(Object o){
        if(o instanceof Integer){
            System.out.println("it is integer");
        }else if(o instanceof Double){
            System.out.println("it is double");
        }else{
            System.out.println("unexpected");
        }
        System.out.println(o);
    }
}