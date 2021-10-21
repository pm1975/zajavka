package day31.reference;


public class main {
    public static void main(String[] args) {
        Cat cat = new Cat("Angrzej");
        System.out.println(cat);
        passByReferenceOrPassByValue(cat);
        System.out.println(cat);

        int i = 10;
        System.out.println(i);
        passByReferenceOrPassByValue(i);
        System.out.println(i);
    }

    private static void passByReferenceOrPassByValue(Cat anotherReferenceToCat) {
        anotherReferenceToCat.setName("Filipek");
        anotherReferenceToCat = new Cat("Filip");
        System.out.println(anotherReferenceToCat);
    }

    private static void passByReferenceOrPassByValue(int i) {
        i = 20;
    }
}
