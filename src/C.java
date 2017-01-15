/**
 * Created by Михаил on 15.01.2017.
 */

public class C implements I {
    public static void main(String[] args) {
        I i = new C();
        C c = (C) i;
        c = i;
        J j = new J();
        c = (C) i;
        c = (C) j;
        i = j;
        i = (I) j;
        i = (J) j;
        i = (J) null;

    }
}
