package com.hillel.dataStructures.Hash;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by A.Nikitiuk on 13.05.2015.
 */
public class MyHashSet {

    private int capacity = 4;
    private LinkedList<Object>[] array = new LinkedList[capacity];

    public MyHashSet(){
        for (int i = 0; i < array.length; i++){
            array[i] = new LinkedList<Object>();
        }
    }

    public void add(Object obj){
        int index = getIndex(obj);
        LinkedList<Object> list = array[index];
        list.add(obj);
    }

    public int getIndex(Object obj) {
        return Math.abs(obj.hashCode() % array.length);
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public boolean contains(Object obj){
        int index = getIndex(obj);
        LinkedList<Object> list = array[index];

        return list.contains(obj);
    }
}
