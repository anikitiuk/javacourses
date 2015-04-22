package com.hillel.dataStructures.ArrayList;

import java.util.Arrays;


public class ImprovedArray {

    private static final int RESIZE_MULTIPLIER = 2;

    private Object[] array = new Object[1];

    private int counter;

    public void add(Object value) {
        if (counter == array.length) {
            resize();
        }
        array[counter] = value;
        counter++;
    }

    private void resize() {
        array = Arrays.copyOf(array, array.length * RESIZE_MULTIPLIER);
    }

    public Object get(int index) {
        if (index >= counter) {
            throw new IndexOutOfBoundsException("index value: " + index + ", size: " + size());
        }
        return array[index];
    }

    public int size() {
        return counter;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImprovedArray)) {
            return false;
        }
        ImprovedArray other = (ImprovedArray) obj;
        if (this.size() != other.size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (!this.get(i).equals(other.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size(); i++) {
            result += get(i);
            if (i != size() - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}