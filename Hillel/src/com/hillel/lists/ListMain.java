package com.hillel.lists;

import com.hillel.dataStructures.ArrayList.ImprovedArray;
import com.hillel.dataStructures.linkedList.LinkedCells;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class ListMain {
    public static void main(String[] args) {
        //List list = new LinkedList();

        ImprovedArray array = new ImprovedArray();

        array.add("asd");
        array.add("sdsd");

        for(Object o : array){
            System.out.println(o);//???
        }

        /*list.add("asd");
        list.add("sdsd");

        for(Object o : list){
            System.out.println(o);
        }*/
    }
}
