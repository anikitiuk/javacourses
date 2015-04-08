import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        //System.out.println(String.format("%.2f",2.22222222));
        System.out.println(ratio);

        //byte b = (byte) 127;
        int i = 5;
        //int b = 5 + i++;
        int b = 5 + ++i;
        System.out.println(b);
        /*i++;
        ++i; больший приоритет чем i++
        i+=4 == i=i+4;*/
        i = 11 % 2;//остаток от деления
        System.out.println(i);

        boolean attendJavaCourses = true;
        boolean isWednesdayToday = true;
        //если && - оператор короткой логики, проверяет первый, если false, то второй проверять уже не будет
        if (attendJavaCourses() & isWednesdayToday()) {
            System.out.println("I'm gonna to go on my lectures");
        } else {
            System.out.println("Nothing to do today");
        }

        //оператор "или", || - короткой логики
        if (attendJavaCourses() | isWednesdayToday()) {
            System.out.println("I'm gonna to go on my lectures");
        } else {
            System.out.println("Nothing to do today");
        }

        //int result = 155 ^ 20; //"xor"

        //посмотреть сдвиги

        int r = 455;
        int result = r ^ 20;
        System.out.println(result);
        result = result ^ 20;
        System.out.println(result);

        //ввод
        /*Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int inputedInt = scanner.nextInt();//можно и без проверки
        }*/

        /*if (false) {
            System.out.println("in if");
        } else if (false){
            System.out.println("in else");
        } else if (attendJavaCourses()) {
            System.out.println("ya,ya, okay...");
        } else {
            System.out.println("nope");
        }*/

        int month = 5;
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 5:
                System.out.println("may");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("wrong month");
                break;
        }
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            default:
                System.out.println("wrong month");
                break;
        }
        System.out.println("out of switch");

        //тернарный оператор?
        boolean iNeedEven = true;
        int oddOrEven = iNeedEven ? 2 : 1;
        // int oddOrEven = iNeedEven && true ? true ? 122:34:1; dafaq??!
        /* тоже самое что:
        if (iNeedEven) {
            oddOrEven = 2;
        } else {
            oddOrEven = 1;
        }*/
        System.out.println(oddOrEven);

        /*float difference  = (1.1f + 2.2f)-3.3f;
        float sigma = 0.01f;
        if(Math.abs(difference)<= sigma){
            System.out.println("equal");
        }

        if(1.1f + 2.2f == 3.3f){
            System.out.println("it is obvious");
        }else{
            System.out.println("i should study java harder");
        }
        System.out.println(1.1f + 2.2f);
        */

        int[] intArray = {1, 2, 3, 4, 5}; //идентично int intArray[], но лучше первый вариант
        intArray = new int[5];// 5 - размер массива
        intArray = Arrays.copyOf(intArray, 20);//изменение размера массива без удаления данных

        int[] newintArray = {1, 2, 3, 4, 5};
        int h = newintArray[0];
        System.out.println(h);

        newintArray[0] = 10;
        h = newintArray[0];
        System.out.println(h);
        System.out.println(Arrays.toString(newintArray));
        System.out.println(newintArray.length);

        System.out.println("before for");
        /*for(int j=0; j< newintArray.length; j++){
            if(j==3){
                continue;//если break - прерывается полностью, если continue - прерывается текущая итерация цикла
            }
            int element = newintArray[j];
            System.out.println(element);
        }*/

        /*boolean[] boolArray = {true, true, false};
        for(boolean element : boolArray){
            System.out.println(element);
        }*/

        /*for(int j=0; j< newintArray.length; j++){
            if(j==3){
                continue;//если break - прерывается полностью, если continue - прерывается текущая итерация цикла
            }
            int element = newintArray[j];
            System.out.println(element);

            newintArray[j] = newintArray[j] * 2;
        }
        System.out.println(Arrays.toString(newintArray));
        */

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            scanner.next();
        }
        int input = scanner.nextInt();
        System.out.println("in: " + input);

        /*do {

        }while (true);*/

        Random random = new Random();
        int randomNumber = random.nextInt(10);
    }

    public static boolean attendJavaCourses() {
        System.out.println("in first method");
        return true;
    }

    public static boolean isWednesdayToday() {
        System.out.println("in second method");
        return true;
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
