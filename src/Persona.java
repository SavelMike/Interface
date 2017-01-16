/**
 * Created by Михаил on 16.01.2017.
 */
public class Persona implements Measurable {

    private String name;
    private double height;


    public Persona(String n, double h) {
        name = n;
        height = h;
    }

    public double getMeasure() {
        return height;
    }
}
