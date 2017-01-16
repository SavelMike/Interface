import java.util.Collections;
/**
 * Created by Михаил on 15.01.2017.
 */
public class Person implements Comparable {

    private String lastName;
    private String firstName;
    private int age;

    public Person(String lnam, String fnam, int a) {
        lastName = lnam;
        firstName = fnam;
        age = a;
    }

    public boolean equals(Object otherObject) {
        Person other = (Person) otherObject;
        return (this.firstName.equals(other.firstName)) && (this.lastName.equals(other.lastName)) && (this.age ==(other.age));
    }

    public int compareTo(Object otherObject) {

        // 1. return 0 if objects are equal
        boolean b = this.equals(otherObject);
        if (b) {
            return 0;
        }
        // 2. compare last names of Persons with compareTo of String
        Person other = (Person) otherObject;
        String s1 = this.lastName;
        String s2 = other.lastName;

        int rc = s1.compareTo(s2);
        if (rc != 0) {
            return rc;
        }

        // 3. compare first names of Persons with compare of String
        s1 = this.firstName;
        s2 = other.firstName;

        rc = s1.compareTo(s2);
        if (rc != 0) {
            return rc;
        }

        // 4. compare age of Persons with if
        if (this.age > other.age) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
       return "Last name: " + lastName + ", first name: " + firstName + ", age: " + age + "\n";
    }
}
