package com.hillel.dataStructures.ArrayList;

import java.util.Iterator;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class ArrayIterator implements Iterator {

    private ImprovedArray improvedArray;
    private int nextIndex;

    public ArrayIterator(ImprovedArray improvedArray) {
        this.improvedArray = improvedArray;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < improvedArray.size();
    }



    @Override
    public Object next() {
        Object next = improvedArray.get(nextIndex);
        nextIndex++;
        return null;
    }
}
