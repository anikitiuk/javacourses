package com.hillel.dataStructures.linkedList;

public class LinkedCellsRecursive {

    private CellRecursive head;

    public void add(String value) {
        CellRecursive next = new CellRecursive(value);
        if (head == null) {
            head = next;
        } else {
            head.setTail(next);
        }
    }

    public String get(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException();
        }
        return head.get(index);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return head == null ? 0 : head.size();
    }

    public String toString() {
        return "[" + (head == null ? "" : head.toString()) + "]";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LinkedCellsRecursive)) {
            return false;
        }
        LinkedCellsRecursive other = (LinkedCellsRecursive) obj;
        if (this.isEmpty() && other.isEmpty()) {
            return true;
        }
        if (this.head != null) {
            return head.equals(other.head);
        }
        return false;
    }
}