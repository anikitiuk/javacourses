import com.hillel.dataStructures.ArrayList.StringArray;
import org.junit.Test;

/**
 * Created by A.Nikitiuk on 17.04.2015.
 */
public class StringArrayTest {

    public static void main(String[] args) {
        StringArray array = new StringArray();
        System.out.println("Empty array: " + array);
        System.out.println("Empty array size: " + array.size());

        array.add("first");
        System.out.println("One element: " + array);
        System.out.println("One element size: " + array);

        array.add("second");
        System.out.println("Two elements: " + array);
        System.out.println("Two elements size: " + array);

        System.out.println("First element: " + array.get(0));
        System.out.println("Second element: " + array.get(1));

        System.out.println("Third element: " + array.get(2));
    }

    @Test
    public void asd(){
        System.out.println("test is running");
    }
}
