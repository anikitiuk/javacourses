package com.hillel.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANikitiuk on 25.05.2015.
 */
public class JavaGroupMain {
    public static void main(String[] args) throws UnknownStudentException {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Dimon");
        list.add("Taras");

        JavaGroup group = new JavaGroup(list);

        try {
            group.addGrade("Ivan", 5);
        } catch (UnknownStudentException e) {
            System.out.println(e);
            throw e;
        }
        try {
            group.addGrade("Nikolay", 2);
        }catch (UnknownStudentException e){
            e.printStackTrace(System.out);
        }
        try {
            group.addGrade("Dimon", 5);
        } catch (UnknownStudentException e) {
            e.printStackTrace();
        }

    }
}
