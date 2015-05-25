package com.hillel.dataStructures.linkedList;

public class CellRecursive {

    private final String value;

    private CellRecursive next;

    public CellRecursive(String value) {
        this.value = value;
    }

    public void setTail(CellRecursive tail) {
        if (next != null) {
            next.setTail(tail);
        } else {
            next = tail;
        }
    }

    public int size() {
        if (next != null) {
            return next.size() + 1;
        } else {
            return 1;
        }
    }

    public String toString() {
        String result = value;
        if (next != null) {
            result += ", " + next;
        }
        return result;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof CellRecursive)) {
            return false;
        }

        CellRecursive other = (CellRecursive) object;
        if (!other.getValue().equals(this.getValue())) {
            return false;
        }

        if (this.next == null || other.next == null) {
            return this.next == null && other.next == null;
        }

        return this.next.equals(other.next);
    }

    public String getValue() {
        return value;
    }

    public String get(int index) {
        if (index == 0) {
            return value;
        } else if (next != null) {
            return next.get(index - 1);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}