import java.util.Collections;
import java.util.Arrays;

/**
 * Created by Михаил on 15.01.2017.
 */
public class APL {
    public static void main(String[] args) {
        Person array[] = new Person[5];
        array[0] = new Person("Petrov", "Vasya", 32);
        array[1] = new Person("Ivanov", "Petya", 29);
        array[2] = new Person("Sidorov", "Iosif", 45);
        array[3] = new Person("Ivanov", "Ivan", 28);
        array[4] = new Person("Popov", "Ivan", 32);
        System.out.println(array);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
