import com.hillel.dataStructures.linkedList.LinkedCellsRecursive;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by max on 17.04.2015.
 */
public class LinkedCellsRecursiveTest {

    @Test
    public void emptyListTest(){
        LinkedCellsRecursive list = new LinkedCellsRecursive();
        assertEquals("[]", list.toString());
        assertEquals(0, list.size());
    }

    @Test
    public void sizingTest(){
        LinkedCellsRecursive list = new LinkedCellsRecursive();
        assertEquals(0, list.size());

        list.add("A");
        assertEquals(1, list.size());
        list.add("B");
        list.add("C");
        assertEquals(3,list.size());
    }

    @Test
    public void toStringTest(){
        LinkedCellsRecursive list = new LinkedCellsRecursive();
        assertEquals("[]", list.toString());

        list.add("A");
        assertEquals("[A]", list.toString());

        list.add("B");
        list.add("C");
        assertEquals("[A, B, C]", list.toString());
    }
    @Test
    public void equalityTest() {
        LinkedCellsRecursive one = new LinkedCellsRecursive();
        assertTrue("Not self equal", one.equals(one));

        LinkedCellsRecursive other = new LinkedCellsRecursive();
        assertTrue("Empty lists aren't equal", one.equals(other));

        one.add("A");
        assertFalse("Different lists are equal", one.equals(other));
        other.add("A");

        one.add("B");
        one.add("C");
        other.add("B");
        other.add("C");
        assertTrue("Not empty lists aren't equal", one.equals(other));
    }
    @Test
    public void getTest() {
        LinkedCellsRecursive list = new LinkedCellsRecursive();
        try {
            list.get(0);
            fail();
        } catch (IndexOutOfBoundsException e) {

        }
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
    }
}