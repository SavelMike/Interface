import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Михаил on 15.01.2017.
 */
public class APL {
    public static void main(String[] args) {
        Person array[] = new Person[3];
        array[0] = new Person("Petrov", "Vasya", 32);
        array[1] = new Person("Ivanov", "Petya", 29);
        array[2] = new Person("Sidorov", "Iosif", 45);
        System.out.println(array);
        Arrays.sort(array);
        System.out.println();
    }
}
