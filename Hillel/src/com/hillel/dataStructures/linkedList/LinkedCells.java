package com.hillel.dataStructures.linkedList;

/**
 * Created by A.Nikitiuk on 17.04.2015.
 */
public class LinkedCells {
    private Cell head;
    private int counter;
    private Cell tail;

    public void add(String value) {
        /*if (head == null) {
            head = new Cell(value);
            counter++;
        }
        if(head.getNext()== null){
            head.setNext(new Cell(value));
        }
        Cell current = head;

        while(current.getNext() != null){
            current
        }*/
        if (head == null) {
            head = new Cell(value);
        }
        if (tail == null) {
            tail = head;
        } else {
            tail.setNext(new Cell(value));
        }
        counter++;
    }
    public  String toString(){
        String result = "[";
        Cell current = head;
        while (current != null){
            result += current.getValue();
            if(current.getNext() != null){
                result +=", ";
            }
            current = current.getNext();
        }
        result +="]";
        return result;
    }

}
