import java.util.Arrays;

/**
 * Created by A.Nikitiuk on 10.04.2015.
 */
public class Cat {
    static final int pawCount =4;
    String name;
    int age;
    String vaccines[] = new String[10];
    int vaccineCount = 0;

    public Cat() {

    }

    public Cat(String name) {
        this(name, 0);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        String result = "Cat ";
        result += name + ", ";
        if (age == 1) {
            result += age + " year";
        } else {
            result += age + " years";
        }
        result += ", vaccines: " + Arrays.toString(vaccines);
        return result;
    }

    public void acceptVaccine(String vaccine) {
        vaccines[vaccineCount] = vaccine;
        vaccineCount++;
    }

    public static int pawCount(){
        return pawCount;
    }

    public boolean equals(Object other){
        if(other instanceof Cat){
            Cat otherCat = (Cat) other;
            if(this.age != otherCat.age){
                return false;
            }
            if(!this.name.equals(otherCat.name)){
                return false;
            }
            return true;
        }else{
            return false;
        }
    }
}
