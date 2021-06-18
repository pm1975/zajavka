package day24.reference;

/**
 * @author piotr
 */
public class PrimitivesVsReferences {
    public static void main(String[] args) {
        int a = 4;
        double c = 10;
        boolean f = false;
        String abc = "abc";
        Cat cat1 = new Cat("CAT1");
        Cat cat2 = cat1;
        Cat cat3 = cat1;
        Cat cat4 = cat1;

        System.out.println(cat1);
        cat1.name = "CAT_OTHER";
        System.out.println(cat3);
    }
}
