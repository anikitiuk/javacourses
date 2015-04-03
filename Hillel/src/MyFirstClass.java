/**
 * Created by A.Nikitiuk on 03.04.2015.
 */
public class MyFirstClass {
    public static void main(String[] params) {

        greetings();
        age();

        /*float
        double
        long i = 12332445356234L;
        float f = 2.5F;
        */

        double height = 193;
        double weight = 91;

        double ratio = weight / height;

        System.out.println(ratio);
    }

    public static void greetings() {
        //commented text

        /*
        some other text
        */

        String a = "Hello World!";

        //String a, b, c;
        /*String a;
        String b;
        String c;
        a = "Hello World!";
        */

        System.out.println(a);
        //System.out.println(params);

        String greeting = "My name is ";
        String name = "Alexey";

        String result = greeting + name;

        System.out.println(result);
    }

    public static void age() {
        int age = 18;

        /*long
        short
        byte
        */

        int i = 1;

        //System.out.println("I'm "+age+i);
        //System.out.println(age + i +" is my age");
        System.out.println("I'm " + (age + i));
    }
}
