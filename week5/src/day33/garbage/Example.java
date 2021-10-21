package day33.garbage;

public class Example {
    public static void main(String[] args) {
        Cat cat = new Cat("Robert");
        //prośby o uruchomienie garbage collector
//        System.gc();
//        Runtime.getRuntime().gc();
        //1
        cat = null;
        //2
        cat = new Cat("Stefan");
        //3
        Example example = new Example();
        example.method();
        //4
        //island of isolation
        Owner owner = new Owner(cat);
        cat.setOwner(owner);
        cat = null;
        owner = null;
    }

    private void method() {
        Cat cat = new Cat("Robert");
        System.out.println(cat);
        method2();
    }

    @Deprecated
    public void method2() {
        Cat cat = new Cat("kik");
        method3();
    }

    private void method3() {
        System.out.println("method3");
    }
}
