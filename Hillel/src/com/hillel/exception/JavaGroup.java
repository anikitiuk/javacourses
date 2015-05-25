package com.hillel.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ANikitiuk on 25.05.2015.
 */
public class JavaGroup {
    private Map<String, Integer> namesToGrades = new HashMap<>();

    public JavaGroup(List<String> names) {
        for (String name : names) {
            namesToGrades.put(name, null);
        }
    }

    public void addGrade(String name, Integer grade) throws UnknownStudentException{
        if(!namesToGrades.containsKey(name)){
            throw new UnknownStudentException("Unknown student " + name);
        }
        namesToGrades.put(name,grade);
    }
}
