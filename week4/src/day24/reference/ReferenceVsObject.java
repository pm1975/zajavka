package day24.reference;

/**
 * @author piotr
 */
public class ReferenceVsObject {
    public static void main(String[] args) {
        Gorilla gorilla1 = new Gorilla("10", "Robert");
        Monkey gorilla2 = gorilla1;

        Gorilla gorilla3 = (Gorilla) gorilla2;
        System.out.println(gorilla1 == gorilla3);
    }

    final  int nethod5() {
        return 1; }
}
