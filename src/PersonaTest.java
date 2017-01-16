
/**
 * Created by Михаил on 16.01.2017.
 */
public class PersonaTest {
    public static void main(String[] args) {
        Measurable[] array = new Measurable[5];
        array[0] = new Persona("Vasya", 190.3);
        array[1] = new Persona("Petya", 185.5);
        array[2] = new Persona("Ivan", 203);
        array[3] = new Persona("Misha", 180.1);
        double sum = average(array);
        System.out.println(sum);
    }

    public static double average(Measurable[] objects) {
        if (objects.length == 0) { return 0; }
            double sum = 0;
            for (Measurable obj : objects)
            {
                sum = sum + obj.getMeasure();
            }
            return sum / objects.length;
        }
    }
}
